package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import com.dtflys.forest.annotation.Query;
import com.dtflys.forest.annotation.Var;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
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
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

import java.util.Map;

/**
 * 时不我待小程序 - 套餐购买接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyPackageClient {

	/**
	 * 套餐列表（旧版，按区域分组）
	 * @return 区域套餐列表
	 */
	@GetRequest(url = "/mp/buy/package/list")
	StudyApiResult<StudyPackageAreaListResp> packageList();

	/**
	 * 套餐购买页介绍内容（旧版）
	 * <p>
	 * 小程序未使用该返回值，响应结构无从核对，先以 Map 原样承接，待抓到真实报文后再细化模型。
	 * @return 介绍内容
	 */
	@GetRequest(url = "/mp/buy/package/introduce")
	StudyApiResult<Map<String, Object>> introduce();

	/**
	 * 座位类型筛选列表（v2）
	 * @param venueId 门店ID
	 * @return 座位类型列表
	 */
	@GetRequest(url = "/mp/buy/v2/package/label/selectList")
	StudyApiResult<StudySeatAreaListResp> seatAreaList(@Query("venueId") Long venueId);

	/**
	 * 套餐类型、标签筛选项（v2）
	 * @param dto 当前定位
	 * @return 筛选项
	 */
	@GetRequest(url = "/mp/buy/v2/package/optList")
	StudyApiResult<StudyPackageOptionResp> options(@Query StudyLocationQueryReq dto);

	/**
	 * 套餐列表（v2）
	 * @param dto 类型、标签、门店与座位区域
	 * @return 套餐列表
	 */
	@PostRequest(url = "/mp/buy/v2/package/list")
	StudyApiResult<StudyPackageListResp> v2PackageList(@JSONBody StudyPackageQueryReq dto);

	/**
	 * 套餐详情（v2）
	 * @param id 套餐ID
	 * @return 套餐详情
	 */
	@GetRequest(url = "/mp/buy/v2/package/detail/${id}")
	StudyApiResult<StudyPackageResp> detail(@Var("id") Long id);

	/**
	 * 套餐下单（v2）
	 * @param dto 套餐、门店、数量与定位
	 * @return 用户订单ID
	 */
	@PostRequest(url = "/mp/buy/v2/package/confirm")
	StudyApiResult<StudyOrderResp> confirmV2(@JSONBody StudyPackageConfirmV2Req dto);

	/**
	 * 套餐下单（旧版）
	 * @param dto 套餐、数量、价格与定位
	 * @return 用户订单ID
	 */
	@PostRequest(url = "/mp/buy/package/confirm")
	StudyApiResult<StudyOrderResp> confirm(@JSONBody StudyPackageConfirmReq dto);

	/**
	 * 订单支付，返回微信支付参数
	 * @param dto 用户订单ID
	 * @return 微信支付参数
	 */
	@PostRequest(url = "/mp/buy/package/payOrder")
	StudyApiResult<StudyPayResp> payOrder(@JSONBody StudyPayOrderReq dto);

}
