package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 用户套餐实体（预约前置校验中返回的原始套餐记录）
 * <p>
 * 服务端直接下发的 ORM 实体，packageBase / userOrder / venue / userPackageHistoryList 等
 * 嵌套实体未建模，按需再补。
 */
@Schema(description = "用户套餐实体")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyUserPackageEntityResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户套餐ID
	 */
	@Schema(description = "用户套餐ID")
	private Long id;

	/**
	 * 用户订单ID
	 */
	@Schema(description = "用户订单ID")
	private Long orderId;

	/**
	 * 订单编号
	 */
	@Schema(description = "订单编号")
	private String orderNumber;

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
	 * 套餐周期（天）
	 */
	@Schema(description = "套餐周期（天）")
	private Integer packagePeriodDay;

	/**
	 * 套餐有效期（天）
	 */
	@Schema(description = "套餐有效期（天）")
	private Integer packageValid;

	/**
	 * 套餐实际支付可用的分钟数
	 */
	@Schema(description = "套餐实际支付可用的分钟数")
	private Integer realPayMinuteOfPackage;

	/**
	 * 剩余次数 / 时长
	 */
	@Schema(description = "剩余次数 / 时长")
	private Integer restNum;

	/**
	 * 已使用次数 / 时长
	 */
	@Schema(description = "已使用次数 / 时长")
	private Integer useNum;

	/**
	 * 生效时间（毫秒时间戳）
	 */
	@Schema(description = "生效时间（毫秒时间戳）")
	private Long useStartDate;

	/**
	 * 失效时间（毫秒时间戳）
	 */
	@Schema(description = "失效时间（毫秒时间戳）")
	private Long useExpiryDate;

	/**
	 * 失效时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "失效时间 yyyy-MM-dd HH:mm:ss")
	private String useExpiryDateStr;

	/**
	 * 使用类型
	 */
	@Schema(description = "使用类型")
	private Integer usedType;

	/**
	 * 可请假总天数
	 */
	@Schema(description = "可请假总天数")
	private Integer leaveTotalNum;

	/**
	 * 已请假天数
	 */
	@Schema(description = "已请假天数")
	private Integer leaveRealNum;

	/**
	 * 有效期计算方式
	 */
	@Schema(description = "有效期计算方式")
	private Integer expireComputeType;

	/**
	 * 首次使用时间（毫秒时间戳）
	 */
	@Schema(description = "首次使用时间（毫秒时间戳）")
	private Long firstUseTime;

	/**
	 * 首次使用门店ID
	 */
	@Schema(description = "首次使用门店ID")
	private Long firstUseVenueId;

	/**
	 * 标记
	 */
	@Schema(description = "标记")
	private Integer flag;

	/**
	 * 赠送原因
	 */
	@Schema(description = "赠送原因")
	private String giveReason;

	/**
	 * 赠送人用户ID
	 */
	@Schema(description = "赠送人用户ID")
	private Long giveUserId;

	/**
	 * 备注
	 */
	@Schema(description = "备注")
	private String remark;

	/**
	 * 来源
	 */
	@Schema(description = "来源")
	private Integer source;

	/**
	 * 用户ID
	 */
	@Schema(description = "用户ID")
	private Long userId;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 商户ID
	 */
	@Schema(description = "商户ID")
	private Long merchantId;

	/**
	 * 是否禁用
	 */
	@Schema(description = "是否禁用")
	private Integer disabled;

	/**
	 * 创建时间（毫秒时间戳）
	 */
	@Schema(description = "创建时间（毫秒时间戳）")
	private Long createTime;

	/**
	 * 创建人用户ID
	 */
	@Schema(description = "创建人用户ID")
	private Long createUserId;

	/**
	 * 创建人姓名
	 */
	@Schema(description = "创建人姓名")
	private String createEmpName;

	/**
	 * 更新时间（毫秒时间戳）
	 */
	@Schema(description = "更新时间（毫秒时间戳）")
	private Long updateTime;

	/**
	 * 更新人用户ID
	 */
	@Schema(description = "更新人用户ID")
	private Long updateUserId;

	/**
	 * 更新人姓名
	 */
	@Schema(description = "更新人姓名")
	private String updateEmpName;

	/**
	 * 删除时间（毫秒时间戳）
	 */
	@Schema(description = "删除时间（毫秒时间戳）")
	private Long deleteTime;

	/**
	 * 删除人用户ID
	 */
	@Schema(description = "删除人用户ID")
	private Long deleteUserId;

	/**
	 * 删除人姓名
	 */
	@Schema(description = "删除人姓名")
	private String deleteUserName;

	/**
	 * 删除备注
	 */
	@Schema(description = "删除备注")
	private String deleteRemark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

	public Integer getPackagePeriodDay() {
		return packagePeriodDay;
	}

	public void setPackagePeriodDay(Integer packagePeriodDay) {
		this.packagePeriodDay = packagePeriodDay;
	}

	public Integer getPackageValid() {
		return packageValid;
	}

	public void setPackageValid(Integer packageValid) {
		this.packageValid = packageValid;
	}

	public Integer getRealPayMinuteOfPackage() {
		return realPayMinuteOfPackage;
	}

	public void setRealPayMinuteOfPackage(Integer realPayMinuteOfPackage) {
		this.realPayMinuteOfPackage = realPayMinuteOfPackage;
	}

	public Integer getRestNum() {
		return restNum;
	}

	public void setRestNum(Integer restNum) {
		this.restNum = restNum;
	}

	public Integer getUseNum() {
		return useNum;
	}

	public void setUseNum(Integer useNum) {
		this.useNum = useNum;
	}

	public Long getUseStartDate() {
		return useStartDate;
	}

	public void setUseStartDate(Long useStartDate) {
		this.useStartDate = useStartDate;
	}

	public Long getUseExpiryDate() {
		return useExpiryDate;
	}

	public void setUseExpiryDate(Long useExpiryDate) {
		this.useExpiryDate = useExpiryDate;
	}

	public String getUseExpiryDateStr() {
		return useExpiryDateStr;
	}

	public void setUseExpiryDateStr(String useExpiryDateStr) {
		this.useExpiryDateStr = useExpiryDateStr;
	}

	public Integer getUsedType() {
		return usedType;
	}

	public void setUsedType(Integer usedType) {
		this.usedType = usedType;
	}

	public Integer getLeaveTotalNum() {
		return leaveTotalNum;
	}

	public void setLeaveTotalNum(Integer leaveTotalNum) {
		this.leaveTotalNum = leaveTotalNum;
	}

	public Integer getLeaveRealNum() {
		return leaveRealNum;
	}

	public void setLeaveRealNum(Integer leaveRealNum) {
		this.leaveRealNum = leaveRealNum;
	}

	public Integer getExpireComputeType() {
		return expireComputeType;
	}

	public void setExpireComputeType(Integer expireComputeType) {
		this.expireComputeType = expireComputeType;
	}

	public Long getFirstUseTime() {
		return firstUseTime;
	}

	public void setFirstUseTime(Long firstUseTime) {
		this.firstUseTime = firstUseTime;
	}

	public Long getFirstUseVenueId() {
		return firstUseVenueId;
	}

	public void setFirstUseVenueId(Long firstUseVenueId) {
		this.firstUseVenueId = firstUseVenueId;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getGiveReason() {
		return giveReason;
	}

	public void setGiveReason(String giveReason) {
		this.giveReason = giveReason;
	}

	public Long getGiveUserId() {
		return giveUserId;
	}

	public void setGiveUserId(Long giveUserId) {
		this.giveUserId = giveUserId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getDisabled() {
		return disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateEmpName() {
		return createEmpName;
	}

	public void setCreateEmpName(String createEmpName) {
		this.createEmpName = createEmpName;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Long getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getUpdateEmpName() {
		return updateEmpName;
	}

	public void setUpdateEmpName(String updateEmpName) {
		this.updateEmpName = updateEmpName;
	}

	public Long getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Long deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Long getDeleteUserId() {
		return deleteUserId;
	}

	public void setDeleteUserId(Long deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	public String getDeleteUserName() {
		return deleteUserName;
	}

	public void setDeleteUserName(String deleteUserName) {
		this.deleteUserName = deleteUserName;
	}

	public String getDeleteRemark() {
		return deleteRemark;
	}

	public void setDeleteRemark(String deleteRemark) {
		this.deleteRemark = deleteRemark;
	}

}
