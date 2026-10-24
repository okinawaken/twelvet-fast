package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.PostRequest;
import com.dtflys.forest.annotation.Query;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyCabinetPayQueryReq;
import com.twelvet.study.api.domain.resp.StudyCabinetOrderResp;
import com.twelvet.study.api.domain.resp.StudyCabinetPayResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

/**
 * 时不我待小程序 - 储物柜接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyCabinetClient {

	/**
	 * 柜子租用订单列表
	 * @return 订单列表
	 */
	@PostRequest(url = "/mp/cabinetGrip/v2/lease/order/list")
	StudyApiResult<StudyListResp<StudyCabinetOrderResp>> orderList();

	/**
	 * 柜子续租支付
	 * @param dto 租用记录ID 与 wx.login 返回的 code
	 * @return 微信支付参数
	 */
	@PostRequest(url = "/mp/cabinetGrip/v2/lease/pay")
	StudyApiResult<StudyCabinetPayResp> pay(@Query StudyCabinetPayQueryReq dto);

}
