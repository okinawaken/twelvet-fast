package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import com.dtflys.forest.annotation.Query;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyRankQueryReq;
import com.twelvet.study.api.domain.req.StudySettlePackageReq;
import com.twelvet.study.api.domain.req.StudySignIndexQueryReq;
import com.twelvet.study.api.domain.req.StudySignOutReq;
import com.twelvet.study.api.domain.req.StudySignSeatQueryReq;
import com.twelvet.study.api.domain.req.StudyUserSignReq;
import com.twelvet.study.api.domain.resp.StudyRankResp;
import com.twelvet.study.api.domain.resp.StudySeatMapResp;
import com.twelvet.study.api.domain.resp.StudySettlePackageResp;
import com.twelvet.study.api.domain.resp.StudySignAnotherResp;
import com.twelvet.study.api.domain.resp.StudySignOutResp;
import com.twelvet.study.api.domain.resp.StudySignSeatMapResp;
import com.twelvet.study.api.domain.resp.StudyVenueResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

import java.util.List;

/**
 * 时不我待小程序 - 学习 / 签到接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudySignClient {

	/**
	 * 学习首页（当前在座、可签到套餐、附近门店）
	 * @param dto 定位、WiFi 信息与门店ID
	 * @return 学习首页数据
	 */
	@GetRequest(url = "/mp/study/index")
	StudyApiResult<StudyVenueResp> index(@Query StudySignIndexQueryReq dto);

	/**
	 * 扫码签到查询可选座位
	 * @param dto 二维码、门店与签到套餐
	 * @return 签到座位图
	 */
	@PostRequest(url = "/mp/study/seat/list")
	StudyApiResult<StudySignSeatMapResp> seatList(@JSONBody StudySignSeatQueryReq dto);

	/**
	 * 签退离座（结算）
	 * @param dto 二维码、定位、结算套餐与学习记录
	 * @return 结算结果
	 */
	@PostRequest(url = "/mp/study/signOut")
	StudyApiResult<StudySignOutResp> signOut(@JSONBody StudySignOutReq dto);

	/**
	 * 换座可选座位列表
	 * @param dto 学习记录ID
	 * @return 座位图
	 */
	@PostRequest(url = "/mp/study/change/seat/list")
	StudyApiResult<StudySeatMapResp> changeSeatList(@JSONBody StudyUserSignReq dto);

	/**
	 * 他人签到校验
	 * @param venueId 门店ID
	 * @return 可用套餐列表
	 */
	@GetRequest(url = "/mp/study/signAnother/check")
	StudyApiResult<StudySignAnotherResp> checkSignAnother(@Query("venueId") Long venueId);

	/**
	 * 签退时可选结算套餐
	 * @param dto 门店与学习记录
	 * @return 结算套餐列表
	 */
	@PostRequest(url = "/mp/study/settlePackage/select")
	StudyApiResult<List<StudySettlePackageResp>> settlePackages(@JSONBody StudySettlePackageReq dto);

	/**
	 * 学习排行榜
	 * @param dto 门店与榜单类型
	 * @return 榜单数据
	 */
	@PostRequest(url = "/mp/study/rank/index")
	StudyApiResult<StudyRankResp> rank(@JSONBody StudyRankQueryReq dto);

}
