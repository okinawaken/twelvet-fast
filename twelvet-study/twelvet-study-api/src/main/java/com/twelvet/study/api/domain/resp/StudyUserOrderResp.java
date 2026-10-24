package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 用户订单
 */
@Schema(description = "用户订单")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyUserOrderResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID
	 */
	@Schema(description = "订单ID")
	private Long id;

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
	 * 套餐原价合计
	 */
	@Schema(description = "套餐原价合计")
	private BigDecimal packagePriceTotal;

	/**
	 * 优惠金额
	 */
	@Schema(description = "优惠金额")
	private BigDecimal discountPrice;

	/**
	 * 应付金额
	 */
	@Schema(description = "应付金额")
	private BigDecimal payPrice;

	/**
	 * 实付金额
	 */
	@Schema(description = "实付金额")
	private BigDecimal payRealMoney;

	/**
	 * 支付流水号
	 */
	@Schema(description = "支付流水号")
	private String payNumber;

	/**
	 * 支付状态
	 */
	@Schema(description = "支付状态")
	private Integer payState;

	/**
	 * 支付状态文案
	 */
	@Schema(description = "支付状态文案")
	private String payStateStr;

	/**
	 * 支付方式文案
	 */
	@Schema(description = "支付方式文案")
	private String payTypeStr;

	/**
	 * 支付时间 yyyy-MM-dd HH:mm
	 */
	@Schema(description = "支付时间 yyyy-MM-dd HH:mm")
	private String payTimeStr;

	/**
	 * 下单时间 yyyy-MM-dd HH:mm
	 */
	@Schema(description = "下单时间 yyyy-MM-dd HH:mm")
	private String createTimeStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getPackagePriceTotal() {
		return packagePriceTotal;
	}

	public void setPackagePriceTotal(BigDecimal packagePriceTotal) {
		this.packagePriceTotal = packagePriceTotal;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	public BigDecimal getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(BigDecimal payPrice) {
		this.payPrice = payPrice;
	}

	public BigDecimal getPayRealMoney() {
		return payRealMoney;
	}

	public void setPayRealMoney(BigDecimal payRealMoney) {
		this.payRealMoney = payRealMoney;
	}

	public String getPayNumber() {
		return payNumber;
	}

	public void setPayNumber(String payNumber) {
		this.payNumber = payNumber;
	}

	public Integer getPayState() {
		return payState;
	}

	public void setPayState(Integer payState) {
		this.payState = payState;
	}

	public String getPayStateStr() {
		return payStateStr;
	}

	public void setPayStateStr(String payStateStr) {
		this.payStateStr = payStateStr;
	}

	public String getPayTypeStr() {
		return payTypeStr;
	}

	public void setPayTypeStr(String payTypeStr) {
		this.payTypeStr = payTypeStr;
	}

	public String getPayTimeStr() {
		return payTimeStr;
	}

	public void setPayTimeStr(String payTimeStr) {
		this.payTimeStr = payTimeStr;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

}
