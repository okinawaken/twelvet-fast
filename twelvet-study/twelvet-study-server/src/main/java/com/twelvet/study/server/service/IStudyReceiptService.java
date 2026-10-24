package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.req.StudyReceiptConsumeReq;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序团购核销服务
 */
public interface IStudyReceiptService {

	/**
	 * 团购券核销
	 * @param dto 核销参数
	 */
	void consume(StudyReceiptConsumeReq dto);

	/**
	 * 抖音券核销
	 * @param dto 核销参数
	 */
	void douYinConsume(StudyReceiptConsumeReq dto);

}
