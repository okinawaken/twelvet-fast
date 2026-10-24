package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyCabinetPayQueryReq;
import com.twelvet.study.api.domain.resp.StudyCabinetOrderResp;
import com.twelvet.study.api.domain.resp.StudyCabinetPayResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.server.client.StudyCabinetClient;
import com.twelvet.study.server.service.IStudyCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序储物柜服务实现
 */
@Service
public class StudyCabinetServiceImpl implements IStudyCabinetService {

	@Autowired
	private StudyCabinetClient cabinetClient;

	@Override
	public StudyListResp<StudyCabinetOrderResp> orderList() {
		return cabinetClient.orderList().getDataOrThrow();
	}

	@Override
	public StudyCabinetPayResp pay(StudyCabinetPayQueryReq dto) {
		return cabinetClient.pay(dto).getDataOrThrow();
	}

}
