package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.req.StudyCabinetPayQueryReq;
import com.twelvet.study.api.domain.resp.StudyCabinetOrderResp;
import com.twelvet.study.api.domain.resp.StudyCabinetPayResp;
import com.twelvet.study.api.domain.resp.StudyListResp;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序储物柜服务
 */
public interface IStudyCabinetService {

	/**
	 * 储物柜订单列表
	 * @return 订单列表
	 */
	StudyListResp<StudyCabinetOrderResp> orderList();

	/**
	 * 储物柜续租支付
	 * @param dto 支付参数
	 * @return 支付信息
	 */
	StudyCabinetPayResp pay(StudyCabinetPayQueryReq dto);

}
