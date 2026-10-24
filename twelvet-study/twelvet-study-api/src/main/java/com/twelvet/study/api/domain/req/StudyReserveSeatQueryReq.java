package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 预约座位查询请求参数（旧版）
 */
@Schema(description = "预约座位查询请求参数（旧版）")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyReserveSeatQueryReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 开始时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "开始时间 yyyy-MM-dd HH:mm:ss")
	private String reserveStartTime;

	/**
	 * 结束时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "结束时间 yyyy-MM-dd HH:mm:ss")
	private String reserveEndTime;

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public String getReserveStartTime() {
		return reserveStartTime;
	}

	public void setReserveStartTime(String reserveStartTime) {
		this.reserveStartTime = reserveStartTime;
	}

	public String getReserveEndTime() {
		return reserveEndTime;
	}

	public void setReserveEndTime(String reserveEndTime) {
		this.reserveEndTime = reserveEndTime;
	}

}
