package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 签退结算套餐
 */
@Schema(description = "签退结算套餐")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySettlePackageResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户套餐ID，签退时作为 settleUserPackageId 回传
	 */
	@Schema(description = "用户套餐ID，签退时作为 settleUserPackageId 回传")
	private Long id;

	/**
	 * 套餐ID
	 */
	@Schema(description = "套餐ID")
	private Long packageId;

	/**
	 * 套餐名称
	 */
	@Schema(description = "套餐名称")
	private String packageName;

	/**
	 * 套餐类型
	 */
	@Schema(description = "套餐类型")
	private Integer packageType;

	/**
	 * 套餐类型描述，如「包月套餐」
	 */
	@Schema(description = "套餐类型描述")
	private String packageTypeStr;

	/**
	 * 可用区域描述
	 */
	@Schema(description = "可用区域描述")
	private String areaDesc;

	/**
	 * 可结算时段 HH:mm-HH:mm
	 */
	@Schema(description = "可结算时段 HH:mm-HH:mm")
	private String settleHourStr;

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
	 * 预计签退时间
	 */
	@Schema(description = "预计签退时间")
	private String signOutExpectTimeStr;

	/**
	 * 套餐有效期描述
	 */
	@Schema(description = "套餐有效期描述")
	private String useExpiryDateStr;

	/**
	 * 是否可用于结算：0-否 1-是
	 */
	@Schema(description = "是否可用于结算：0-否 1-是")
	private Integer canUsePay;

	/**
	 * 不可用于结算的原因描述
	 */
	@Schema(description = "不可用于结算的原因描述")
	private String canNotUsePayDesc;

	/**
	 * 是否自动选中该套餐：0-否 1-是
	 */
	@Schema(description = "是否自动选中该套餐：0-否 1-是")
	private Integer autoSelected;

	/**
	 * 请假类型
	 */
	@Schema(description = "请假类型")
	private Integer leaveType;

	/**
	 * 使用类型
	 */
	@Schema(description = "使用类型")
	private Integer usedType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPackageId() {
		return packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Integer getPackageType() {
		return packageType;
	}

	public void setPackageType(Integer packageType) {
		this.packageType = packageType;
	}

	public String getPackageTypeStr() {
		return packageTypeStr;
	}

	public void setPackageTypeStr(String packageTypeStr) {
		this.packageTypeStr = packageTypeStr;
	}

	public String getAreaDesc() {
		return areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
	}

	public String getSettleHourStr() {
		return settleHourStr;
	}

	public void setSettleHourStr(String settleHourStr) {
		this.settleHourStr = settleHourStr;
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

	public String getSignOutExpectTimeStr() {
		return signOutExpectTimeStr;
	}

	public void setSignOutExpectTimeStr(String signOutExpectTimeStr) {
		this.signOutExpectTimeStr = signOutExpectTimeStr;
	}

	public String getUseExpiryDateStr() {
		return useExpiryDateStr;
	}

	public void setUseExpiryDateStr(String useExpiryDateStr) {
		this.useExpiryDateStr = useExpiryDateStr;
	}

	public Integer getCanUsePay() {
		return canUsePay;
	}

	public void setCanUsePay(Integer canUsePay) {
		this.canUsePay = canUsePay;
	}

	public String getCanNotUsePayDesc() {
		return canNotUsePayDesc;
	}

	public void setCanNotUsePayDesc(String canNotUsePayDesc) {
		this.canNotUsePayDesc = canNotUsePayDesc;
	}

	public Integer getAutoSelected() {
		return autoSelected;
	}

	public void setAutoSelected(Integer autoSelected) {
		this.autoSelected = autoSelected;
	}

	public Integer getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(Integer leaveType) {
		this.leaveType = leaveType;
	}

	public Integer getUsedType() {
		return usedType;
	}

	public void setUsedType(Integer usedType) {
		this.usedType = usedType;
	}

}
