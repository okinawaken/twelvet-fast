package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐
 */
@Schema(description = "套餐")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyPackageResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐ID
	 */
	@Schema(description = "套餐ID")
	private Long id;

	/**
	 * 套餐名称
	 */
	@Schema(description = "套餐名称")
	private String packageName;

	/**
	 * 套餐图片
	 */
	@Schema(description = "套餐图片")
	private String packageImgPath;

	/**
	 * 套餐说明
	 */
	@Schema(description = "套餐说明")
	private String packageDesc;

	/**
	 * 套餐类型
	 */
	@Schema(description = "套餐类型")
	private Integer packageType;

	/**
	 * 套餐类型描述，如「天」「月」
	 */
	@Schema(description = "套餐类型描述，如「天」「月」")
	private String packageTypeStr;

	/**
	 * 原价（元）
	 */
	@Schema(description = "原价（元）")
	private BigDecimal originalPriceYuan;

	/**
	 * 实付价（元）
	 */
	@Schema(description = "实付价（元）")
	private BigDecimal packageAccountPriceYuan;

	/**
	 * 套餐标签，如「全市通用」
	 */
	@Schema(description = "套餐标签，如「全市通用」")
	private String specialTag;

	/**
	 * 套餐价格（旧版套餐列表返回，尚未取到非空样本）
	 */
	@Schema(description = "套餐价格（旧版套餐列表返回，尚未取到非空样本）")
	private BigDecimal packagePrice;

	/**
	 * 套餐次数/时长（旧版套餐列表返回，尚未取到非空样本）
	 */
	@Schema(description = "套餐次数/时长（旧版套餐列表返回，尚未取到非空样本）")
	private Integer packageNum;

	/**
	 * 起售单价，用于展示「元/小时起」「购买单价」
	 */
	@Schema(description = "起售单价，用于展示「元/小时起」「购买单价」")
	private BigDecimal packageBasePrice;

	/**
	 * 可用区域描述
	 */
	@Schema(description = "可用区域描述")
	private String useAreasDesc;

	/**
	 * 阶梯价列表
	 */
	@Schema(description = "阶梯价列表")
	private List<StudyPackagePriceResp> packagePriceList;

	/**
	 * 套餐类型说明（套餐详情返回）
	 */
	@Schema(description = "套餐类型说明（套餐详情返回）")
	private String packageTypeDesc;

	/**
	 * 结算时长说明（套餐详情返回）
	 */
	@Schema(description = "结算时长说明（套餐详情返回）")
	private String settleHourDesc;

	/**
	 * 次数消耗说明（套餐详情返回）
	 */
	@Schema(description = "次数消耗说明（套餐详情返回）")
	private String consumeUseNumDesc;

	/**
	 * 有效期说明（套餐详情返回）
	 */
	@Schema(description = "有效期说明（套餐详情返回）")
	private String validTimeDesc;

	/**
	 * 套餐详情页说明内容（套餐详情返回）
	 */
	@Schema(description = "套餐详情页说明内容（套餐详情返回）")
	private String descPageContent;

	/**
	 * 工作日不可用说明（套餐详情返回）
	 */
	@Schema(description = "工作日不可用说明（套餐详情返回）")
	private String failureWeekdayDesc;

	/**
	 * 节假日不可用说明（套餐详情返回）
	 */
	@Schema(description = "节假日不可用说明（套餐详情返回）")
	private String failureHolidayDesc;

	/**
	 * 指定日期不可用说明（套餐详情返回）
	 */
	@Schema(description = "指定日期不可用说明（套餐详情返回）")
	private String failureDateDesc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageImgPath() {
		return packageImgPath;
	}

	public void setPackageImgPath(String packageImgPath) {
		this.packageImgPath = packageImgPath;
	}

	public String getPackageDesc() {
		return packageDesc;
	}

	public void setPackageDesc(String packageDesc) {
		this.packageDesc = packageDesc;
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

	public BigDecimal getOriginalPriceYuan() {
		return originalPriceYuan;
	}

	public void setOriginalPriceYuan(BigDecimal originalPriceYuan) {
		this.originalPriceYuan = originalPriceYuan;
	}

	public BigDecimal getPackageAccountPriceYuan() {
		return packageAccountPriceYuan;
	}

	public void setPackageAccountPriceYuan(BigDecimal packageAccountPriceYuan) {
		this.packageAccountPriceYuan = packageAccountPriceYuan;
	}

	public String getSpecialTag() {
		return specialTag;
	}

	public void setSpecialTag(String specialTag) {
		this.specialTag = specialTag;
	}

	public BigDecimal getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(BigDecimal packagePrice) {
		this.packagePrice = packagePrice;
	}

	public Integer getPackageNum() {
		return packageNum;
	}

	public void setPackageNum(Integer packageNum) {
		this.packageNum = packageNum;
	}

	public BigDecimal getPackageBasePrice() {
		return packageBasePrice;
	}

	public void setPackageBasePrice(BigDecimal packageBasePrice) {
		this.packageBasePrice = packageBasePrice;
	}

	public String getUseAreasDesc() {
		return useAreasDesc;
	}

	public void setUseAreasDesc(String useAreasDesc) {
		this.useAreasDesc = useAreasDesc;
	}

	public List<StudyPackagePriceResp> getPackagePriceList() {
		return packagePriceList;
	}

	public void setPackagePriceList(List<StudyPackagePriceResp> packagePriceList) {
		this.packagePriceList = packagePriceList;
	}

	public String getPackageTypeDesc() {
		return packageTypeDesc;
	}

	public void setPackageTypeDesc(String packageTypeDesc) {
		this.packageTypeDesc = packageTypeDesc;
	}

	public String getSettleHourDesc() {
		return settleHourDesc;
	}

	public void setSettleHourDesc(String settleHourDesc) {
		this.settleHourDesc = settleHourDesc;
	}

	public String getConsumeUseNumDesc() {
		return consumeUseNumDesc;
	}

	public void setConsumeUseNumDesc(String consumeUseNumDesc) {
		this.consumeUseNumDesc = consumeUseNumDesc;
	}

	public String getValidTimeDesc() {
		return validTimeDesc;
	}

	public void setValidTimeDesc(String validTimeDesc) {
		this.validTimeDesc = validTimeDesc;
	}

	public String getDescPageContent() {
		return descPageContent;
	}

	public void setDescPageContent(String descPageContent) {
		this.descPageContent = descPageContent;
	}

	public String getFailureWeekdayDesc() {
		return failureWeekdayDesc;
	}

	public void setFailureWeekdayDesc(String failureWeekdayDesc) {
		this.failureWeekdayDesc = failureWeekdayDesc;
	}

	public String getFailureHolidayDesc() {
		return failureHolidayDesc;
	}

	public void setFailureHolidayDesc(String failureHolidayDesc) {
		this.failureHolidayDesc = failureHolidayDesc;
	}

	public String getFailureDateDesc() {
		return failureDateDesc;
	}

	public void setFailureDateDesc(String failureDateDesc) {
		this.failureDateDesc = failureDateDesc;
	}

}
