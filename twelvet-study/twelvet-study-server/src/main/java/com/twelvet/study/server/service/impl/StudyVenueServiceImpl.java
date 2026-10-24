package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyLocationQueryReq;
import com.twelvet.study.api.domain.resp.StudyAreaListResp;
import com.twelvet.study.api.domain.resp.StudyDouYinVenueListResp;
import com.twelvet.study.api.domain.resp.StudyNoticeResp;
import com.twelvet.study.api.domain.resp.StudySeatVenueResp;
import com.twelvet.study.api.domain.resp.StudyVenueListResp;
import com.twelvet.study.server.client.StudyVenueClient;
import com.twelvet.study.server.service.IStudyVenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序门店与公告服务实现
 */
@Service
public class StudyVenueServiceImpl implements IStudyVenueService {

	@Autowired
	private StudyVenueClient venueClient;

	@Override
	public StudyVenueListResp nearbyVenues(StudyLocationQueryReq dto) {
		return venueClient.nearbyVenues(dto).getDataOrThrow();
	}

	@Override
	public StudyVenueListResp reserveVenues() {
		return venueClient.reserveVenues().getDataOrThrow();
	}

	@Override
	public StudySeatVenueResp reserveVenueDetail(Long venueId) {
		return venueClient.reserveVenueDetail(venueId).getDataOrThrow();
	}

	@Override
	public StudyAreaListResp reserveAreas() {
		return venueClient.reserveAreas().getDataOrThrow();
	}

	@Override
	public StudyVenueListResp receiptVenues(StudyLocationQueryReq dto) {
		return venueClient.receiptVenues(dto).getDataOrThrow();
	}

	@Override
	public StudyDouYinVenueListResp douYinVenues(StudyLocationQueryReq dto) {
		return venueClient.douYinVenues(dto).getDataOrThrow();
	}

	@Override
	public StudyNoticeResp noticeBoard(Long venueId) {
		return venueClient.noticeBoard(venueId).getDataOrThrow();
	}

}
