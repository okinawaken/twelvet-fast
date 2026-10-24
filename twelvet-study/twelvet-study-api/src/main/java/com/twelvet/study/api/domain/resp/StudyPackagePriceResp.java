package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐阶梯价
 */
@Schema(description = "套餐阶梯价")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyPackagePriceResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 购买数量（小时 / 天 / 月）
	 */
	@Schema(description = "购买数量（小时 / 天 / 月）")
	private Integer buyNum;

	/**
	 * 阶梯价说明
	 */
	@Schema(description = "阶梯价说明")
	private String priceDesc;

	/**
	 * 该阶梯的单价
	 */
	@Schema(description = "该阶梯的单价")
	private BigDecimal packagePrice;

	public Integer getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public BigDecimal getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(BigDecimal packagePrice) {
		this.packagePrice = packagePrice;
	}

}
