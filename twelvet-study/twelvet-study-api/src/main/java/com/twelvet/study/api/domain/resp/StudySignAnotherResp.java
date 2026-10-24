package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 他人签到校验响应（/mp/study/signAnother/check）
 */
@Schema(description = "他人签到校验响应（/mp/study/signAnother/check）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySignAnotherResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 是否有他人可签到套餐：0-否 1-是
	 */
	@Schema(description = "是否有他人可签到套餐：0-否 1-是")
	private Integer hasSignAnotherPackage;

	/**
	 * 他人签到可用套餐列表
	 */
	@Schema(description = "他人签到可用套餐列表")
	private List<StudySignPackageResp> settlePackageList;

	public Integer getHasSignAnotherPackage() {
		return hasSignAnotherPackage;
	}

	public void setHasSignAnotherPackage(Integer hasSignAnotherPackage) {
		this.hasSignAnotherPackage = hasSignAnotherPackage;
	}

	public List<StudySignPackageResp> getSettlePackageList() {
		return settlePackageList;
	}

	public void setSettlePackageList(List<StudySignPackageResp> settlePackageList) {
		this.settlePackageList = settlePackageList;
	}

}
