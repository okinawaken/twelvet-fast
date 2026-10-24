package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 扫码签到座位图响应（在座位图基础上增加签到相关信息）
 */
@Schema(description = "扫码签到座位图响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySignSeatMapResp extends StudySeatMapResp {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 自动签到结果
	 */
	@Schema(description = "自动签到结果")
	private Integer seatAutoSignInResult;

	/**
	 * 本次签到使用的用户套餐ID
	 */
	@Schema(description = "本次签到使用的用户套餐ID")
	private Long signInUserPackageId;

	/**
	 * 今日预约提示
	 */
	@Schema(description = "今日预约提示")
	private String todayReserveDesc;

	/**
	 * 今日预约座位
	 */
	@Schema(description = "今日预约座位")
	private StudySeatResp todayReserveSeat;

	/**
	 * VIP 座位
	 */
	@Schema(description = "VIP 座位")
	private StudySeatResp vipSeat;

	public Integer getSeatAutoSignInResult() {
		return seatAutoSignInResult;
	}

	public void setSeatAutoSignInResult(Integer seatAutoSignInResult) {
		this.seatAutoSignInResult = seatAutoSignInResult;
	}

	public Long getSignInUserPackageId() {
		return signInUserPackageId;
	}

	public void setSignInUserPackageId(Long signInUserPackageId) {
		this.signInUserPackageId = signInUserPackageId;
	}

	public String getTodayReserveDesc() {
		return todayReserveDesc;
	}

	public void setTodayReserveDesc(String todayReserveDesc) {
		this.todayReserveDesc = todayReserveDesc;
	}

	public StudySeatResp getTodayReserveSeat() {
		return todayReserveSeat;
	}

	public void setTodayReserveSeat(StudySeatResp todayReserveSeat) {
		this.todayReserveSeat = todayReserveSeat;
	}

	public StudySeatResp getVipSeat() {
		return vipSeat;
	}

	public void setVipSeat(StudySeatResp vipSeat) {
		this.vipSeat = vipSeat;
	}

}
