package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 预约座位提交请求参数（v2）
 */
@Schema(description = "预约座位提交请求参数（v2）")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyReserveV2SeatConfirmReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 座位ID
	 */
	@Schema(description = "座位ID")
	private Long seatId;

	/**
	 * 预约日期 yyyy-MM-dd
	 */
	@Schema(description = "预约日期 yyyy-MM-dd")
	private String reserveDateStr;

	/**
	 * 开始时段 HH:mm
	 */
	@Schema(description = "开始时段 HH:mm")
	private String reserveStartTimeStr;

	/**
	 * 结束时段 HH:mm
	 */
	@Schema(description = "结束时段 HH:mm")
	private String reserveEndTimeStr;

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
	 * 是否为他人预约：0-否 1-是
	 */
	@Schema(description = "是否为他人预约：0-否 1-是")
	private Integer reserveAnotherFlag;

	public Long getSeatId() {
		return seatId;
	}

	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}

	public String getReserveDateStr() {
		return reserveDateStr;
	}

	public void setReserveDateStr(String reserveDateStr) {
		this.reserveDateStr = reserveDateStr;
	}

	public String getReserveStartTimeStr() {
		return reserveStartTimeStr;
	}

	public void setReserveStartTimeStr(String reserveStartTimeStr) {
		this.reserveStartTimeStr = reserveStartTimeStr;
	}

	public String getReserveEndTimeStr() {
		return reserveEndTimeStr;
	}

	public void setReserveEndTimeStr(String reserveEndTimeStr) {
		this.reserveEndTimeStr = reserveEndTimeStr;
	}

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

	public Integer getReserveAnotherFlag() {
		return reserveAnotherFlag;
	}

	public void setReserveAnotherFlag(Integer reserveAnotherFlag) {
		this.reserveAnotherFlag = reserveAnotherFlag;
	}

}
