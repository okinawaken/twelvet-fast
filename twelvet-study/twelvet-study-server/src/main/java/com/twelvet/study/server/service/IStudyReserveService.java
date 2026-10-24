package com.twelvet.study.server.service;

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

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序座位预约服务
 */
public interface IStudyReserveService {

	/**
	 * 预约首页（门店列表、轮播图）
	 * @param dto 定位、关键字、渠道与区域
	 * @return 预约首页数据
	 */
	StudyReserveIndexResp index(StudyReserveIndexQueryReq dto);

	/**
	 * 预约前置校验
	 * @return 校验结果
	 */
	StudyReserveCheckResp check();

	/**
	 * 可预约座位列表（旧版）
	 * @param dto 门店与时间段
	 * @return 座位图
	 */
	StudySeatMapResp seatList(StudyReserveSeatQueryReq dto);

	/**
	 * 提交预约（旧版）
	 * @param dto 座位与时间段
	 * @return 预约结果
	 */
	StudyReserveConfirmResp confirmSeat(StudyReserveSeatConfirmReq dto);

	/**
	 * 可预约日期列表（v2）
	 * @param venueId 门店ID
	 * @return 可预约日期
	 */
	StudyReserveDateResp dateList(Long venueId);

	/**
	 * 可预约座位列表（v2）
	 * @param dto 门店、日期与时段
	 * @return 座位图
	 */
	StudySeatMapResp v2SeatList(StudyReserveV2SeatQueryReq dto);

	/**
	 * 提交预约（v2）
	 * @param dto 座位、日期、时段与定位
	 * @return 预约结果
	 */
	StudyReserveConfirmResp v2ConfirmSeat(StudyReserveV2SeatConfirmReq dto);

	/**
	 * 他人预约校验
	 * @param userReserveId 预约记录ID
	 * @return 校验结果
	 */
	StudyReserveAnotherResp checkAnother(Long userReserveId);

	/**
	 * 我的预约列表
	 * @return 预约记录列表
	 */
	StudyListResp<StudyUserReserveResp> userReserveList();

	/**
	 * 取消预约前置提示
	 * @param userReserveId 预约记录ID
	 * @return 提示文案
	 */
	StudyCancelTipResp cancelTip(Long userReserveId);

	/**
	 * 取消预约
	 * @param dto 预约记录ID
	 */
	void cancel(StudyUserReserveCancelReq dto);

}
