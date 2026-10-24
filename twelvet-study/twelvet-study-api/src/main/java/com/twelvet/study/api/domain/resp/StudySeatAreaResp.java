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
 * @Description: 座位区域
 * <p>
 * 预约座位图与扫码签到座位图复用同一结构，未在当前场景返回的字段为 null。
 */
@Schema(description = "座位区域")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySeatAreaResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 区域ID
	 */
	@Schema(description = "区域ID")
	private Long id;

	/**
	 * 区域名称
	 */
	@Schema(description = "区域名称")
	private String areaName;

	/**
	 * 区域底图
	 */
	@Schema(description = "区域底图")
	private String areaImgUrl;

	/**
	 * 区域是否绑定套餐：0-否 1-是
	 */
	@Schema(description = "区域是否绑定套餐：0-否 1-是")
	private Integer hasAreaPackage;

	/**
	 * 小时单价（元）
	 */
	@Schema(description = "小时单价（元）")
	private BigDecimal priceHour;

	/**
	 * 日单价（元）
	 */
	@Schema(description = "日单价（元）")
	private BigDecimal priceDay;

	/**
	 * 月单价（元）
	 */
	@Schema(description = "月单价（元）")
	private BigDecimal priceMonth;

	/**
	 * 区域下的座位列表
	 */
	@Schema(description = "区域下的座位列表")
	private List<StudySeatResp> venueAreaSeatList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaImgUrl() {
		return areaImgUrl;
	}

	public void setAreaImgUrl(String areaImgUrl) {
		this.areaImgUrl = areaImgUrl;
	}

	public Integer getHasAreaPackage() {
		return hasAreaPackage;
	}

	public void setHasAreaPackage(Integer hasAreaPackage) {
		this.hasAreaPackage = hasAreaPackage;
	}

	public BigDecimal getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(BigDecimal priceHour) {
		this.priceHour = priceHour;
	}

	public BigDecimal getPriceDay() {
		return priceDay;
	}

	public void setPriceDay(BigDecimal priceDay) {
		this.priceDay = priceDay;
	}

	public BigDecimal getPriceMonth() {
		return priceMonth;
	}

	public void setPriceMonth(BigDecimal priceMonth) {
		this.priceMonth = priceMonth;
	}

	public List<StudySeatResp> getVenueAreaSeatList() {
		return venueAreaSeatList;
	}

	public void setVenueAreaSeatList(List<StudySeatResp> venueAreaSeatList) {
		this.venueAreaSeatList = venueAreaSeatList;
	}

}
