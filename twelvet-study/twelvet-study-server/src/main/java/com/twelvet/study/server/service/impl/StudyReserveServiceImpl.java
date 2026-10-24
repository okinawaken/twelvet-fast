package com.twelvet.study.server.service.impl;

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
import com.twelvet.study.server.client.StudyReserveClient;
import com.twelvet.study.server.service.IStudyReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序座位预约服务实现
 */
@Service
public class StudyReserveServiceImpl implements IStudyReserveService {

	@Autowired
	private StudyReserveClient reserveClient;

	@Override
	public StudyReserveIndexResp index(StudyReserveIndexQueryReq dto) {
		return reserveClient.index(dto).getDataOrThrow();
	}

	@Override
	public StudyReserveCheckResp check() {
		return reserveClient.check().getDataOrThrow();
	}

	@Override
	public StudySeatMapResp seatList(StudyReserveSeatQueryReq dto) {
		return reserveClient.seatList(dto).getDataOrThrow();
	}

	@Override
	public StudyReserveConfirmResp confirmSeat(StudyReserveSeatConfirmReq dto) {
		return reserveClient.confirmSeat(dto).getDataOrThrow();
	}

	@Override
	public StudyReserveDateResp dateList(Long venueId) {
		return reserveClient.dateList(venueId).getDataOrThrow();
	}

	@Override
	public StudySeatMapResp v2SeatList(StudyReserveV2SeatQueryReq dto) {
		return reserveClient.v2SeatList(dto).getDataOrThrow();
	}

	@Override
	public StudyReserveConfirmResp v2ConfirmSeat(StudyReserveV2SeatConfirmReq dto) {
		return reserveClient.v2ConfirmSeat(dto).getDataOrThrow();
	}

	@Override
	public StudyReserveAnotherResp checkAnother(Long userReserveId) {
		return reserveClient.checkAnother(userReserveId).getDataOrThrow();
	}

	@Override
	public StudyListResp<StudyUserReserveResp> userReserveList() {
		return reserveClient.userReserveList().getDataOrThrow();
	}

	@Override
	public StudyCancelTipResp cancelTip(Long userReserveId) {
		return reserveClient.cancelTip(userReserveId).getDataOrThrow();
	}

	@Override
	public void cancel(StudyUserReserveCancelReq dto) {
		reserveClient.cancel(dto).getDataOrThrow();
	}

}
