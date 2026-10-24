package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyReceiptConsumeReq;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

/**
 * 时不我待小程序 - 团购券核销接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyReceiptClient {

	/**
	 * 美团团购券核销
	 * @param dto 门店与券码
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/receipt/consume")
	StudyApiResult<Void> consume(@JSONBody StudyReceiptConsumeReq dto);

	/**
	 * 抖音团购券核销
	 * @param dto 门店与券码
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/douYin/certificate/prepareAndVerify")
	StudyApiResult<Void> douYinConsume(@JSONBody StudyReceiptConsumeReq dto);

}
