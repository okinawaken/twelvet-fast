package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 门店列表条目（附近门店 / 预约门店 / 核销门店）
 */
@Schema(description = "门店列表条目（附近门店 / 预约门店 / 核销门店）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyVenueItemResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long id;

	/**
	 * 门店名称
	 */
	@Schema(description = "门店名称")
	private String venueName;

	/**
	 * 美团门店编码
	 */
	@Schema(description = "美团门店编码")
	private String meituanShopCode;

	/**
	 * 美团门店名称
	 */
	@Schema(description = "美团门店名称")
	private String meituanShopName;

	/**
	 * 抖音门店标识
	 */
	@Schema(description = "抖音门店标识")
	private String openShopUuid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getMeituanShopCode() {
		return meituanShopCode;
	}

	public void setMeituanShopCode(String meituanShopCode) {
		this.meituanShopCode = meituanShopCode;
	}

	public String getMeituanShopName() {
		return meituanShopName;
	}

	public void setMeituanShopName(String meituanShopName) {
		this.meituanShopName = meituanShopName;
	}

	public String getOpenShopUuid() {
		return openShopUuid;
	}

	public void setOpenShopUuid(String openShopUuid) {
		this.openShopUuid = openShopUuid;
	}

}
