package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyLocationQueryReq;
import com.twelvet.study.api.domain.req.StudyPackageConfirmReq;
import com.twelvet.study.api.domain.req.StudyPackageConfirmV2Req;
import com.twelvet.study.api.domain.req.StudyPackageQueryReq;
import com.twelvet.study.api.domain.req.StudyPayOrderReq;
import com.twelvet.study.api.domain.resp.StudyOrderResp;
import com.twelvet.study.api.domain.resp.StudyPackageAreaListResp;
import com.twelvet.study.api.domain.resp.StudyPackageListResp;
import com.twelvet.study.api.domain.resp.StudyPackageOptionResp;
import com.twelvet.study.api.domain.resp.StudyPackageResp;
import com.twelvet.study.api.domain.resp.StudyPayResp;
import com.twelvet.study.api.domain.resp.StudySeatAreaListResp;
import com.twelvet.study.server.client.StudyPackageClient;
import com.twelvet.study.server.service.IStudyPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序套餐购买服务实现
 */
@Service
public class StudyPackageServiceImpl implements IStudyPackageService {

	@Autowired
	private StudyPackageClient packageClient;

	@Override
	public StudyPackageAreaListResp packageList() {
		return packageClient.packageList().getDataOrThrow();
	}

	@Override
	public Map<String, Object> introduce() {
		return packageClient.introduce().getDataOrThrow();
	}

	@Override
	public StudySeatAreaListResp seatAreaList(Long venueId) {
		return packageClient.seatAreaList(venueId).getDataOrThrow();
	}

	@Override
	public StudyPackageOptionResp options(StudyLocationQueryReq dto) {
		return packageClient.options(dto).getDataOrThrow();
	}

	@Override
	public StudyPackageListResp v2PackageList(StudyPackageQueryReq dto) {
		return packageClient.v2PackageList(dto).getDataOrThrow();
	}

	@Override
	public StudyPackageResp detail(Long id) {
		return packageClient.detail(id).getDataOrThrow();
	}

	@Override
	public StudyOrderResp confirmV2(StudyPackageConfirmV2Req dto) {
		return packageClient.confirmV2(dto).getDataOrThrow();
	}

	@Override
	public StudyOrderResp confirm(StudyPackageConfirmReq dto) {
		return packageClient.confirm(dto).getDataOrThrow();
	}

	@Override
	public StudyPayResp payOrder(StudyPayOrderReq dto) {
		return packageClient.payOrder(dto).getDataOrThrow();
	}

}
