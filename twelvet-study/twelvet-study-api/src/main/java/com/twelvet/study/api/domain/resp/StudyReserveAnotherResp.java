package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 他人预约校验响应（/mp/reserve/another/check）
 */
@Schema(description = "他人预约校验响应（/mp/reserve/another/check）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyReserveAnotherResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 是否可为他人操作：0-否 1-是
	 */
	@Schema(description = "是否可为他人操作：0-否 1-是")
	private Integer canReserveAnother;

	/**
	 * 是否有他人可用套餐
	 */
	@Schema(description = "是否有他人可用套餐")
	private Integer hasReserveAnotherPackage;

	/**
	 * 不可操作时提示文案
	 */
	@Schema(description = "不可操作时提示文案")
	private String descNoReserveAnother;

	public Integer getCanReserveAnother() {
		return canReserveAnother;
	}

	public void setCanReserveAnother(Integer canReserveAnother) {
		this.canReserveAnother = canReserveAnother;
	}

	public Integer getHasReserveAnotherPackage() {
		return hasReserveAnotherPackage;
	}

	public void setHasReserveAnotherPackage(Integer hasReserveAnotherPackage) {
		this.hasReserveAnotherPackage = hasReserveAnotherPackage;
	}

	public String getDescNoReserveAnother() {
		return descNoReserveAnother;
	}

	public void setDescNoReserveAnother(String descNoReserveAnother) {
		this.descNoReserveAnother = descNoReserveAnother;
	}

}
