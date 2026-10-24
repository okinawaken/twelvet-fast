package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 我的预约记录
 */
@Schema(description = "我的预约记录")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyUserReserveResp implements Serializable {

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
	 * 星期文案
	 */
	@Schema(description = "星期文案")
	private String reserveWeekStr;

	/**
	 * 预约时段 HH:mm-HH:mm
	 */
	@Schema(description = "预约时段 HH:mm-HH:mm")
	private String reserveTimeStr;

	/**
	 * 预约状态文案
	 */
	@Schema(description = "预约状态文案")
	private String reserveStatusDesc;

	/**
	 * 是否可取消：0-否 1-是
	 */
	@Schema(description = "是否可取消：0-否 1-是")
	private Integer canCancel;

	/**
	 * 是否可为他人预约：0-否 1-是
	 */
	@Schema(description = "是否可为他人预约：0-否 1-是")
	private Integer canReserveAnother;

	/**
	 * 不可为他人预约的原因
	 */
	@Schema(description = "不可为他人预约的原因")
	private String descNoReserveAnother;

	/**
	 * 是否已订阅消息：0-否 1-是
	 */
	@Schema(description = "是否已订阅消息：0-否 1-是")
	private Integer subscribeFlag;

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

	public String getReserveStatusDesc() {
		return reserveStatusDesc;
	}

	public void setReserveStatusDesc(String reserveStatusDesc) {
		this.reserveStatusDesc = reserveStatusDesc;
	}

	public Integer getCanCancel() {
		return canCancel;
	}

	public void setCanCancel(Integer canCancel) {
		this.canCancel = canCancel;
	}

	public Integer getCanReserveAnother() {
		return canReserveAnother;
	}

	public void setCanReserveAnother(Integer canReserveAnother) {
		this.canReserveAnother = canReserveAnother;
	}

	public String getDescNoReserveAnother() {
		return descNoReserveAnother;
	}

	public void setDescNoReserveAnother(String descNoReserveAnother) {
		this.descNoReserveAnother = descNoReserveAnother;
	}

	public Integer getSubscribeFlag() {
		return subscribeFlag;
	}

	public void setSubscribeFlag(Integer subscribeFlag) {
		this.subscribeFlag = subscribeFlag;
	}

}
