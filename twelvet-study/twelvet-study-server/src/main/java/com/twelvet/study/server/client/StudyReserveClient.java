package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import com.dtflys.forest.annotation.Query;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyReserveIndexQueryReq;
import com.twelvet.study.api.domain.req.StudyReserveSeatConfirmReq;
import com.twelvet.study.api.domain.req.StudyReserveSeatQueryReq;
import com.twelvet.study.api.domain.req.StudyReserveV2SeatConfirmReq;
import com.twelvet.study.api.domain.req.StudyReserveV2SeatQueryReq;
import com.twelvet.study.api.domain.req.StudyUserReserveCancelReq;
import com.twelvet.study.api.domain.resp.StudyCancelTipResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyReserveAnotherResp;
import com.twelvet.study.api.domain.resp.StudyReserveCheckResp;
import com.twelvet.study.api.domain.resp.StudyReserveConfirmResp;
import com.twelvet.study.api.domain.resp.StudyReserveDateResp;
import com.twelvet.study.api.domain.resp.StudyReserveIndexResp;
import com.twelvet.study.api.domain.resp.StudySeatMapResp;
import com.twelvet.study.api.domain.resp.StudyUserReserveResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

/**
 * 时不我待小程序 - 座位预约接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyReserveClient {

	/**
	 * 预约首页（门店列表、轮播图）
	 * @param dto 定位、门店名称关键字、渠道来源与区域
	 * @return 门店列表与轮播图
	 */
	@GetRequest(url = "/mp/reserve/index")
	StudyApiResult<StudyReserveIndexResp> index(@Query StudyReserveIndexQueryReq dto);

	/**
	 * 预约前置校验（是否可预约 / 是否需要购买套餐）
	 * @return 校验结果
	 */
	@GetRequest(url = "/mp/reserve/check")
	StudyApiResult<StudyReserveCheckResp> check();

	/**
	 * 可预约座位列表（旧版）
	 * @param dto 门店与时间段
	 * @return 座位图
	 */
	@PostRequest(url = "/mp/reserve/seat/list")
	StudyApiResult<StudySeatMapResp> seatList(@JSONBody StudyReserveSeatQueryReq dto);

	/**
	 * 提交预约（旧版）
	 * @param dto 座位与时间段
	 * @return 预约结果
	 */
	@PostRequest(url = "/mp/reserve/seat/confirm")
	StudyApiResult<StudyReserveConfirmResp> confirmSeat(@JSONBody StudyReserveSeatConfirmReq dto);

	/**
	 * 可预约日期列表（v2）
	 * @param venueId 门店ID
	 * @return 可预约日期
	 */
	@GetRequest(url = "/mp/reserve/v2/date/select")
	StudyApiResult<StudyReserveDateResp> dateList(@Query("venueId") Long venueId);

	/**
	 * 可预约座位列表（v2）
	 * @param dto 门店、日期与时段
	 * @return 座位图
	 */
	@PostRequest(url = "/mp/reserve/v2/seat/list")
	StudyApiResult<StudySeatMapResp> v2SeatList(@JSONBody StudyReserveV2SeatQueryReq dto);

	/**
	 * 提交预约（v2）
	 * @param dto 座位、日期、时段与定位
	 * @return 预约结果
	 */
	@PostRequest(url = "/mp/reserve/v2/seat/confirm")
	StudyApiResult<StudyReserveConfirmResp> v2ConfirmSeat(@JSONBody StudyReserveV2SeatConfirmReq dto);

	/**
	 * 他人预约校验
	 * @param userReserveId 预约记录ID
	 * @return 校验结果
	 */
	@GetRequest(url = "/mp/reserve/another/check")
	StudyApiResult<StudyReserveAnotherResp> checkAnother(@Query("userReserveId") Long userReserveId);

	/**
	 * 我的预约列表
	 * @return 预约记录列表
	 */
	@GetRequest(url = "/mp/user/userReserve/list")
	StudyApiResult<StudyListResp<StudyUserReserveResp>> userReserveList();

	/**
	 * 取消预约前置提示
	 * @param userReserveId 预约记录ID
	 * @return 提示文案
	 */
	@GetRequest(url = "/mp/user/userReserve/cancel/tip")
	StudyApiResult<StudyCancelTipResp> cancelTip(@Query("userReserveId") Long userReserveId);

	/**
	 * 取消预约
	 * @param dto 预约记录ID
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/user/userReserve/cancel")
	StudyApiResult<Void> cancel(@JSONBody StudyUserReserveCancelReq dto);

}
