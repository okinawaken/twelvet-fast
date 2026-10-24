package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 我的套餐
 */
@Schema(description = "我的套餐")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyUserPackageResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户套餐ID
	 */
	@Schema(description = "用户套餐ID")
	private Long id;

	/**
	 * 套餐ID
	 */
	@Schema(description = "套餐ID")
	private Long packageId;

	/**
	 * 订单编号
	 */
	@Schema(description = "订单编号")
	private String orderNumber;

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
	 * 购买时长
	 */
	@Schema(description = "购买时长")
	private String buyTimeStr;

	/**
	 * 套餐状态文案
	 */
	@Schema(description = "套餐状态文案")
	private String showStatusDesc;

	/**
	 * 剩余可用数量
	 */
	@Schema(description = "剩余可用数量")
	private Integer restNum;

	/**
	 * 剩余时长
	 */
	@Schema(description = "剩余时长")
	private String restTimeStr;

	/**
	 * 已用时长
	 */
	@Schema(description = "已用时长")
	private String usedTimeStr;

	/**
	 * 可用时段 HH:mm-HH:mm
	 */
	@Schema(description = "可用时段 HH:mm-HH:mm")
	private String settleHourStr;

	/**
	 * 使用截止日期
	 */
	@Schema(description = "使用截止日期")
	private String useExpiryDate;

	/**
	 * 计时方式
	 */
	@Schema(description = "计时方式")
	private Integer usedType;

	/**
	 * 是否可用于结算：0-否 1-是
	 */
	@Schema(description = "是否可用于结算：0-否 1-是")
	private Integer canUsePay;

	/**
	 * 不可用于结算的原因
	 */
	@Schema(description = "不可用于结算的原因")
	private String canNotUsePayDesc;

	/**
	 * 是否可请假：0-否 1-是
	 */
	@Schema(description = "是否可请假：0-否 1-是")
	private Integer canLeaveBtn;

	/**
	 * 请假类型
	 */
	@Schema(description = "请假类型")
	private Integer leaveType;

	/**
	 * 请假日期描述
	 */
	@Schema(description = "请假日期描述")
	private String leaveDateDesc;

	/**
	 * 取消请假描述
	 */
	@Schema(description = "取消请假描述")
	private String leaveCancelDesc;

	/**
	 * 请假记录ID
	 */
	@Schema(description = "请假记录ID")
	private Long userLeaveId;

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

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

	public String getBuyTimeStr() {
		return buyTimeStr;
	}

	public void setBuyTimeStr(String buyTimeStr) {
		this.buyTimeStr = buyTimeStr;
	}

	public String getShowStatusDesc() {
		return showStatusDesc;
	}

	public void setShowStatusDesc(String showStatusDesc) {
		this.showStatusDesc = showStatusDesc;
	}

	public Integer getRestNum() {
		return restNum;
	}

	public void setRestNum(Integer restNum) {
		this.restNum = restNum;
	}

	public String getRestTimeStr() {
		return restTimeStr;
	}

	public void setRestTimeStr(String restTimeStr) {
		this.restTimeStr = restTimeStr;
	}

	public String getUsedTimeStr() {
		return usedTimeStr;
	}

	public void setUsedTimeStr(String usedTimeStr) {
		this.usedTimeStr = usedTimeStr;
	}

	public String getSettleHourStr() {
		return settleHourStr;
	}

	public void setSettleHourStr(String settleHourStr) {
		this.settleHourStr = settleHourStr;
	}

	public String getUseExpiryDate() {
		return useExpiryDate;
	}

	public void setUseExpiryDate(String useExpiryDate) {
		this.useExpiryDate = useExpiryDate;
	}

	public Integer getUsedType() {
		return usedType;
	}

	public void setUsedType(Integer usedType) {
		this.usedType = usedType;
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

	public Integer getCanLeaveBtn() {
		return canLeaveBtn;
	}

	public void setCanLeaveBtn(Integer canLeaveBtn) {
		this.canLeaveBtn = canLeaveBtn;
	}

	public Integer getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(Integer leaveType) {
		this.leaveType = leaveType;
	}

	public String getLeaveDateDesc() {
		return leaveDateDesc;
	}

	public void setLeaveDateDesc(String leaveDateDesc) {
		this.leaveDateDesc = leaveDateDesc;
	}

	public String getLeaveCancelDesc() {
		return leaveCancelDesc;
	}

	public void setLeaveCancelDesc(String leaveCancelDesc) {
		this.leaveCancelDesc = leaveCancelDesc;
	}

	public Long getUserLeaveId() {
		return userLeaveId;
	}

	public void setUserLeaveId(Long userLeaveId) {
		this.userLeaveId = userLeaveId;
	}

}
