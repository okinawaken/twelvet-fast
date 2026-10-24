package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 待结算费用状态
 */
@Schema(description = "待结算费用状态")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyUserFeeResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 是否存在待结算费用：0-否 1-是
	 */
	@Schema(description = "是否存在待结算费用：0-否 1-是")
	private Integer hasOwnFee;

	/**
	 * 待结算的学习记录ID
	 */
	@Schema(description = "待结算的学习记录ID")
	private Long userSignId;

	public Integer getHasOwnFee() {
		return hasOwnFee;
	}

	public void setHasOwnFee(Integer hasOwnFee) {
		this.hasOwnFee = hasOwnFee;
	}

	public Long getUserSignId() {
		return userSignId;
	}

	public void setUserSignId(Long userSignId) {
		this.userSignId = userSignId;
	}

}
