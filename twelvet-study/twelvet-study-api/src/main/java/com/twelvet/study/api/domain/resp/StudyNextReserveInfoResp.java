package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 下次预约信息
 */
@Schema(description = "下次预约信息")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyNextReserveInfoResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店名称
	 */
	@Schema(description = "门店名称")
	private String venueName;

	/**
	 * 座位号
	 */
	@Schema(description = "座位号")
	private String seatNumber;

	/**
	 * 区域名称
	 */
	@Schema(description = "区域名称")
	private String areaName;

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
	 * 下次预约提示文案
	 */
	@Schema(description = "下次预约提示文案")
	private String reserveDesc;

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
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

	public String getReserveDesc() {
		return reserveDesc;
	}

	public void setReserveDesc(String reserveDesc) {
		this.reserveDesc = reserveDesc;
	}

}
