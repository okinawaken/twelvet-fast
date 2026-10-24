package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 座位已有的预约记录（座位图内联）
 */
@Schema(description = "座位已有的预约记录（座位图内联）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySeatReserveRecordResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 预约记录ID
	 */
	@Schema(description = "预约记录ID")
	private Long id;

	/**
	 * 预约日期 yyyy-MM-dd
	 */
	@Schema(description = "预约日期 yyyy-MM-dd")
	private String reserveDateStr;

	/**
	 * 预约时段 HH:mm-HH:mm
	 */
	@Schema(description = "预约时段 HH:mm-HH:mm")
	private String reserveTimeStr;

	/**
	 * 预约时长描述
	 */
	@Schema(description = "预约时长描述")
	private String reserveMinuteStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReserveDateStr() {
		return reserveDateStr;
	}

	public void setReserveDateStr(String reserveDateStr) {
		this.reserveDateStr = reserveDateStr;
	}

	public String getReserveTimeStr() {
		return reserveTimeStr;
	}

	public void setReserveTimeStr(String reserveTimeStr) {
		this.reserveTimeStr = reserveTimeStr;
	}

	public String getReserveMinuteStr() {
		return reserveMinuteStr;
	}

	public void setReserveMinuteStr(String reserveMinuteStr) {
		this.reserveMinuteStr = reserveMinuteStr;
	}

}
