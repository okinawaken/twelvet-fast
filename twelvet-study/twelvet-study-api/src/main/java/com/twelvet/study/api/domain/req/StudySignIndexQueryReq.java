package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 学习首页查询参数
 */
@Schema(description = "学习首页查询参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudySignIndexQueryReq implements Serializable {

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
	 * 当前连接的 WiFi BSSID，可空
	 */
	@Schema(description = "当前连接的 WiFi BSSID，可空")
	private String bssid;

	/**
	 * 当前连接的 WiFi SSID，可空
	 */
	@Schema(description = "当前连接的 WiFi SSID，可空")
	private String ssid;

	/**
	 * 门店ID，可空
	 */
	@Schema(description = "门店ID，可空")
	private Long venueId;

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

	public String getBssid() {
		return bssid;
	}

	public void setBssid(String bssid) {
		this.bssid = bssid;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

}
