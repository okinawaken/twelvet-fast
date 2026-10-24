package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyRepairSubmitReq;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyRepairResp;
import com.twelvet.study.server.client.StudyRepairClient;
import com.twelvet.study.server.service.IStudyRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序报修服务实现
 */
@Service
public class StudyRepairServiceImpl implements IStudyRepairService {

	@Autowired
	private StudyRepairClient repairClient;

	@Override
	public void submit(StudyRepairSubmitReq dto) {
		repairClient.submit(dto).getDataOrThrow();
	}

	@Override
	public StudyListResp<StudyRepairResp> list() {
		return repairClient.list().getDataOrThrow();
	}

	@Override
	public StudyRepairResp detail(Long id) {
		return repairClient.detail(id).getDataOrThrow();
	}

}
