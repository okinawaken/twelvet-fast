package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyRankQueryReq;
import com.twelvet.study.api.domain.req.StudySettlePackageReq;
import com.twelvet.study.api.domain.req.StudySignIndexQueryReq;
import com.twelvet.study.api.domain.req.StudySignOutReq;
import com.twelvet.study.api.domain.req.StudySignSeatQueryReq;
import com.twelvet.study.api.domain.req.StudyUserSignReq;
import com.twelvet.study.api.domain.resp.StudyRankResp;
import com.twelvet.study.api.domain.resp.StudySeatMapResp;
import com.twelvet.study.api.domain.resp.StudySettlePackageResp;
import com.twelvet.study.api.domain.resp.StudySignAnotherResp;
import com.twelvet.study.api.domain.resp.StudySignOutResp;
import com.twelvet.study.api.domain.resp.StudySignSeatMapResp;
import com.twelvet.study.api.domain.resp.StudyVenueResp;
import com.twelvet.study.server.client.StudySignClient;
import com.twelvet.study.server.service.IStudySignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序签到学习服务实现
 */
@Service
public class StudySignServiceImpl implements IStudySignService {

	@Autowired
	private StudySignClient signClient;

	@Override
	public StudyVenueResp index(StudySignIndexQueryReq dto) {
		return signClient.index(dto).getDataOrThrow();
	}

	@Override
	public StudySignSeatMapResp seatList(StudySignSeatQueryReq dto) {
		return signClient.seatList(dto).getDataOrThrow();
	}

	@Override
	public StudySignOutResp signOut(StudySignOutReq dto) {
		return signClient.signOut(dto).getDataOrThrow();
	}

	@Override
	public StudySeatMapResp changeSeatList(StudyUserSignReq dto) {
		return signClient.changeSeatList(dto).getDataOrThrow();
	}

	@Override
	public StudySignAnotherResp checkSignAnother(Long venueId) {
		return signClient.checkSignAnother(venueId).getDataOrThrow();
	}

	@Override
	public List<StudySettlePackageResp> settlePackages(StudySettlePackageReq dto) {
		return signClient.settlePackages(dto).getDataOrThrow();
	}

	@Override
	public StudyRankResp rank(StudyRankQueryReq dto) {
		return signClient.rank(dto).getDataOrThrow();
	}

}
