package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 签退结算结果
 */
@Schema(description = "签退结算结果")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySignOutResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 学习记录ID
	 */
	@Schema(description = "学习记录ID")
	private Long userSignId;

	/**
	 * 结算套餐名称
	 */
	@Schema(description = "结算套餐名称")
	private String packageName;

	/**
	 * 区域描述
	 */
	@Schema(description = "区域描述")
	private String areaDesc;

	/**
	 * 学习时长
	 */
	@Schema(description = "学习时长")
	private String studyDurationStr;

	/**
	 * 结算金额
	 */
	@Schema(description = "结算金额")
	private BigDecimal settleFee;

	/**
	 * 签退时间
	 */
	@Schema(description = "签退时间")
	private String signOutTimeStr;

	public Long getUserSignId() {
		return userSignId;
	}

	public void setUserSignId(Long userSignId) {
		this.userSignId = userSignId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getAreaDesc() {
		return areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
	}

	public String getStudyDurationStr() {
		return studyDurationStr;
	}

	public void setStudyDurationStr(String studyDurationStr) {
		this.studyDurationStr = studyDurationStr;
	}

	public BigDecimal getSettleFee() {
		return settleFee;
	}

	public void setSettleFee(BigDecimal settleFee) {
		this.settleFee = settleFee;
	}

	public String getSignOutTimeStr() {
		return signOutTimeStr;
	}

	public void setSignOutTimeStr(String signOutTimeStr) {
		this.signOutTimeStr = signOutTimeStr;
	}

}
