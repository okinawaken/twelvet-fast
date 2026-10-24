package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 座位预约结果
 */
@Schema(description = "座位预约结果")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyReserveConfirmResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 预约记录ID
	 */
	@Schema(description = "预约记录ID")
	private Long id;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 门店名称
	 */
	@Schema(description = "门店名称")
	private String venueName;

	/**
	 * 区域名称
	 */
	@Schema(description = "区域名称")
	private String areaName;

	/**
	 * 座位号
	 */
	@Schema(description = "座位号")
	private String seatNumber;

	/**
	 * 预约日期 yyyy-MM-dd
	 */
	@Schema(description = "预约日期 yyyy-MM-dd")
	private String reserveDateStr;

	/**
	 * 预约星期，如「周一」
	 */
	@Schema(description = "预约星期，如「周一」")
	private String reserveWeekStr;

	/**
	 * 预约时段 HH:mm-HH:mm
	 */
	@Schema(description = "预约时段 HH:mm-HH:mm")
	private String reserveTimeStr;

	/**
	 * 是否可为他人再约一座：0-否 1-是
	 */
	@Schema(description = "是否可为他人再约一座：0-否 1-是")
	private Integer canReserveAnother;

	/**
	 * 是否展示「再约一座」按钮：true-是 false-否
	 */
	@Schema(description = "是否展示「再约一座」按钮：true-是 false-否")
	private String reserveAnotherBtn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getReserveDateStr() {
		return reserveDateStr;
	}

	public void setReserveDateStr(String reserveDateStr) {
		this.reserveDateStr = reserveDateStr;
	}

	public String getReserveWeekStr() {
		return reserveWeekStr;
	}

	public void setReserveWeekStr(String reserveWeekStr) {
		this.reserveWeekStr = reserveWeekStr;
	}

	public String getReserveTimeStr() {
		return reserveTimeStr;
	}

	public void setReserveTimeStr(String reserveTimeStr) {
		this.reserveTimeStr = reserveTimeStr;
	}

	public Integer getCanReserveAnother() {
		return canReserveAnother;
	}

	public void setCanReserveAnother(Integer canReserveAnother) {
		this.canReserveAnother = canReserveAnother;
	}

	public String getReserveAnotherBtn() {
		return reserveAnotherBtn;
	}

	public void setReserveAnotherBtn(String reserveAnotherBtn) {
		this.reserveAnotherBtn = reserveAnotherBtn;
	}

}
