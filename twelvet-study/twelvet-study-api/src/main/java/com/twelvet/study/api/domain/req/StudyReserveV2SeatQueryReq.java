package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 预约座位查询请求参数（v2）
 */
@Schema(description = "预约座位查询请求参数（v2）")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyReserveV2SeatQueryReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

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
	 * 是否为他人预约：0-否 1-是
	 */
	@Schema(description = "是否为他人预约：0-否 1-是")
	private Integer reserveAnotherFlag;

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
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

	public Integer getReserveAnotherFlag() {
		return reserveAnotherFlag;
	}

	public void setReserveAnotherFlag(Integer reserveAnotherFlag) {
		this.reserveAnotherFlag = reserveAnotherFlag;
	}

}
