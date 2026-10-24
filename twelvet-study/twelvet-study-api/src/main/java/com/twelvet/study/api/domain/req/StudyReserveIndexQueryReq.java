package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 预约首页查询参数
 */
@Schema(description = "预约首页查询参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyReserveIndexQueryReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 当前经度
	 */
	@Schema(description = "当前经度")
	private BigDecimal currentLng;

	/**
	 * 当前纬度
	 */
	@Schema(description = "当前纬度")
	private BigDecimal currentLat;

	/**
	 * 门店名称关键字，可空
	 */
	@Schema(description = "门店名称关键字，可空")
	private String venueName;

	/**
	 * 是否渠道来源：1-是 0-否，可空
	 */
	@Schema(description = "是否渠道来源：1-是 0-否，可空")
	private Integer channelBili;

	/**
	 * 区域ID，可空
	 */
	@Schema(description = "区域ID，可空")
	private Long areaId;

	public BigDecimal getCurrentLng() {
		return currentLng;
	}

	public void setCurrentLng(BigDecimal currentLng) {
		this.currentLng = currentLng;
	}

	public BigDecimal getCurrentLat() {
		return currentLat;
	}

	public void setCurrentLat(BigDecimal currentLat) {
		this.currentLat = currentLat;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Integer getChannelBili() {
		return channelBili;
	}

	public void setChannelBili(Integer channelBili) {
		this.channelBili = channelBili;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

}
