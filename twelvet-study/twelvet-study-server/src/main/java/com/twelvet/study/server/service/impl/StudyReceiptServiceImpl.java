package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyReceiptConsumeReq;
import com.twelvet.study.server.client.StudyReceiptClient;
import com.twelvet.study.server.service.IStudyReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序团购核销服务实现
 */
@Service
public class StudyReceiptServiceImpl implements IStudyReceiptService {

	@Autowired
	private StudyReceiptClient receiptClient;

	@Override
	public void consume(StudyReceiptConsumeReq dto) {
		receiptClient.consume(dto).getDataOrThrow();
	}

	@Override
	public void douYinConsume(StudyReceiptConsumeReq dto) {
		receiptClient.douYinConsume(dto).getDataOrThrow();
	}

}
