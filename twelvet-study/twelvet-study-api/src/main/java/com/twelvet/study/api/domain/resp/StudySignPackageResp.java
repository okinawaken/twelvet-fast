package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 签到 / 结算套餐概要
 */
@Schema(description = "签到 / 结算套餐概要")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySignPackageResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐ID
	 */
	@Schema(description = "套餐ID")
	private Long id;

	/**
	 * 签到套餐ID
	 */
	@Schema(description = "签到套餐ID")
	private Long signInUserPackageId;

	/**
	 * 当前学习记录ID
	 */
	@Schema(description = "当前学习记录ID")
	private Long userSignId;

	/**
	 * 套餐名称
	 */
	@Schema(description = "套餐名称")
	private String packageName;

	/**
	 * 可用区域描述
	 */
	@Schema(description = "可用区域描述")
	private String areaDesc;

	/**
	 * 最长可用时长
	 */
	@Schema(description = "最长可用时长")
	private String maxStudyTimeStr;

	/**
	 * 剩余时长
	 */
	@Schema(description = "剩余时长")
	private String restTimeStr;

	/**
	 * 可结算时段 HH:mm-HH:mm
	 */
	@Schema(description = "可结算时段 HH:mm-HH:mm")
	private String settleHourStr;

	/**
	 * 预计签退时间
	 */
	@Schema(description = "预计签退时间")
	private String signOutExpectTimeStr;

	/**
	 * 签到流水号
	 */
	@Schema(description = "签到流水号")
	private String signSerialNo;

	/**
	 * 是否可用于结算：0-否 1-是
	 */
	@Schema(description = "是否可用于结算：0-否 1-是")
	private Integer canUsePay;

	/**
	 * 该签到套餐对应的座位信息（学习首页签到成功卡片展示用）
	 */
	@Schema(description = "该签到套餐对应的座位信息（学习首页签到成功卡片展示用）")
	private StudySeatResp seatInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSignInUserPackageId() {
		return signInUserPackageId;
	}

	public void setSignInUserPackageId(Long signInUserPackageId) {
		this.signInUserPackageId = signInUserPackageId;
	}

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

	public String getMaxStudyTimeStr() {
		return maxStudyTimeStr;
	}

	public void setMaxStudyTimeStr(String maxStudyTimeStr) {
		this.maxStudyTimeStr = maxStudyTimeStr;
	}

	public String getRestTimeStr() {
		return restTimeStr;
	}

	public void setRestTimeStr(String restTimeStr) {
		this.restTimeStr = restTimeStr;
	}

	public String getSettleHourStr() {
		return settleHourStr;
	}

	public void setSettleHourStr(String settleHourStr) {
		this.settleHourStr = settleHourStr;
	}

	public String getSignOutExpectTimeStr() {
		return signOutExpectTimeStr;
	}

	public void setSignOutExpectTimeStr(String signOutExpectTimeStr) {
		this.signOutExpectTimeStr = signOutExpectTimeStr;
	}

	public String getSignSerialNo() {
		return signSerialNo;
	}

	public void setSignSerialNo(String signSerialNo) {
		this.signSerialNo = signSerialNo;
	}

	public Integer getCanUsePay() {
		return canUsePay;
	}

	public void setCanUsePay(Integer canUsePay) {
		this.canUsePay = canUsePay;
	}

	public StudySeatResp getSeatInfo() {
		return seatInfo;
	}

	public void setSeatInfo(StudySeatResp seatInfo) {
		this.seatInfo = seatInfo;
	}

}
