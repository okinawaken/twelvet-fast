package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐下单请求参数（旧版）
 */
@Schema(description = "套餐下单请求参数（旧版）")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyPackageConfirmReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐ID
	 */
	@Schema(description = "套餐ID")
	private Long packageId;

	/**
	 * 购买数量
	 */
	@Schema(description = "购买数量")
	private Integer packageNum;

	/**
	 * 套餐总价
	 */
	@Schema(description = "套餐总价")
	private BigDecimal packagePrice;

	/**
	 * 当前纬度
	 */
	@Schema(description = "当前纬度")
	private BigDecimal currentLat;

	/**
	 * 当前经度
	 */
	@Schema(description = "当前经度")
	private BigDecimal currentLng;

	public Long getPackageId() {
		return packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	public Integer getPackageNum() {
		return packageNum;
	}

	public void setPackageNum(Integer packageNum) {
		this.packageNum = packageNum;
	}

	public BigDecimal getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(BigDecimal packagePrice) {
		this.packagePrice = packagePrice;
	}

	public BigDecimal getCurrentLat() {
		return currentLat;
	}

	public void setCurrentLat(BigDecimal currentLat) {
		this.currentLat = currentLat;
	}

	public BigDecimal getCurrentLng() {
		return currentLng;
	}

	public void setCurrentLng(BigDecimal currentLng) {
		this.currentLng = currentLng;
	}

}
