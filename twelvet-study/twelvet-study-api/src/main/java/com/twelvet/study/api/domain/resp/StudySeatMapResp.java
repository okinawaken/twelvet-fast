package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 座位图响应
 * <p>
 * 预约座位图（旧版）、预约座位图（v2）、扫码签到座位图共用该结构； reserveHoldMinutes / reserveCancelMinutes /
 * reserveCancelLimit 仅 v2 预约座位图返回，其余场景为 null。
 */
@Schema(description = "座位图响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySeatMapResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店信息
	 */
	@Schema(description = "门店信息")
	private StudySeatVenueResp venue;

	/**
	 * 区域及座位列表
	 */
	@Schema(description = "区域及座位列表")
	private List<StudySeatAreaResp> venueAreaList;

	/**
	 * 预约保留分钟数
	 */
	@Schema(description = "预约保留分钟数")
	private Integer reserveHoldMinutes;

	/**
	 * 预约可提前取消分钟数
	 */
	@Schema(description = "预约可提前取消分钟数")
	private Integer reserveCancelMinutes;

	/**
	 * 可取消时间限制（分钟）
	 */
	@Schema(description = "可取消时间限制（分钟）")
	private Integer reserveCancelLimit;

	public StudySeatVenueResp getVenue() {
		return venue;
	}

	public void setVenue(StudySeatVenueResp venue) {
		this.venue = venue;
	}

	public List<StudySeatAreaResp> getVenueAreaList() {
		return venueAreaList;
	}

	public void setVenueAreaList(List<StudySeatAreaResp> venueAreaList) {
		this.venueAreaList = venueAreaList;
	}

	public Integer getReserveHoldMinutes() {
		return reserveHoldMinutes;
	}

	public void setReserveHoldMinutes(Integer reserveHoldMinutes) {
		this.reserveHoldMinutes = reserveHoldMinutes;
	}

	public Integer getReserveCancelMinutes() {
		return reserveCancelMinutes;
	}

	public void setReserveCancelMinutes(Integer reserveCancelMinutes) {
		this.reserveCancelMinutes = reserveCancelMinutes;
	}

	public Integer getReserveCancelLimit() {
		return reserveCancelLimit;
	}

	public void setReserveCancelLimit(Integer reserveCancelLimit) {
		this.reserveCancelLimit = reserveCancelLimit;
	}

}
