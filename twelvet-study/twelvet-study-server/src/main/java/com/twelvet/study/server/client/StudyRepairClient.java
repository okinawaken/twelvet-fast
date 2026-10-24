package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import com.dtflys.forest.annotation.Var;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyRepairSubmitReq;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyRepairResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

/**
 * 时不我待小程序 - 报修接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyRepairClient {

	/**
	 * 提交报修
	 * @param dto 门店、描述与图片地址
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/userRepair/submit")
	StudyApiResult<Void> submit(@JSONBody StudyRepairSubmitReq dto);

	/**
	 * 我的报修记录
	 * @return 报修记录列表
	 */
	@GetRequest(url = "/mp/userRepair/list")
	StudyApiResult<StudyListResp<StudyRepairResp>> list();

	/**
	 * 报修详情
	 * @param id 报修记录ID
	 * @return 报修详情
	 */
	@GetRequest(url = "/mp/userRepair/detail/${id}")
	StudyApiResult<StudyRepairResp> detail(@Var("id") Long id);

}
