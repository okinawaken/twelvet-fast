package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 定位查询参数
 */
@Schema(description = "定位查询参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyLocationQueryReq implements Serializable {

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

}
