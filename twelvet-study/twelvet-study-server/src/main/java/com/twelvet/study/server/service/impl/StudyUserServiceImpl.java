package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyLeaveConfirmReq;
import com.twelvet.study.api.domain.req.StudyUserLeaveCancelReq;
import com.twelvet.study.api.domain.req.StudyUserUpdateReq;
import com.twelvet.study.api.domain.resp.StudyEnterLeaveResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyUserFeeResp;
import com.twelvet.study.api.domain.resp.StudyUserOrderResp;
import com.twelvet.study.api.domain.resp.StudyUserPackageListResp;
import com.twelvet.study.api.domain.resp.StudyUserResp;
import com.twelvet.study.server.client.StudyUserClient;
import com.twelvet.study.server.service.IStudyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序用户中心服务实现
 */
@Service
public class StudyUserServiceImpl implements IStudyUserService {

	@Autowired
	private StudyUserClient userClient;

	@Override
	public StudyUserResp index() {
		return userClient.index().getDataOrThrow();
	}

	@Override
	public StudyUserResp detailInfo() {
		return userClient.detailInfo().getDataOrThrow();
	}

	@Override
	public Integer updateInfo(StudyUserUpdateReq dto) {
		return userClient.updateInfo(dto).getDataOrThrow();
	}

	@Override
	public StudyUserFeeResp feeInfo() {
		return userClient.feeInfo().getDataOrThrow();
	}

	@Override
	public StudyUserPackageListResp userPackageList() {
		return userClient.userPackageList().getDataOrThrow();
	}

	@Override
	public StudyListResp<StudyUserOrderResp> userOrderList() {
		return userClient.userOrderList().getDataOrThrow();
	}

	@Override
	public StudyEnterLeaveResp enterLeave(Long userPackageId) {
		return userClient.enterLeave(userPackageId).getDataOrThrow();
	}

	@Override
	public void confirmLeave(StudyLeaveConfirmReq dto) {
		userClient.confirmLeave(dto).getDataOrThrow();
	}

	@Override
	public void cancelLeave(StudyUserLeaveCancelReq dto) {
		userClient.cancelLeave(dto).getDataOrThrow();
	}

}
