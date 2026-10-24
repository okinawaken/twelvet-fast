package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.Query;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyLocationQueryReq;
import com.twelvet.study.api.domain.resp.StudyAreaListResp;
import com.twelvet.study.api.domain.resp.StudyDouYinVenueListResp;
import com.twelvet.study.api.domain.resp.StudyNoticeResp;
import com.twelvet.study.api.domain.resp.StudySeatVenueResp;
import com.twelvet.study.api.domain.resp.StudyVenueListResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

/**
 * 时不我待小程序 - 门店与公告接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyVenueClient {

	/**
	 * 附近门店（学习页 / 报修页使用）
	 * @param dto 当前定位
	 * @return 门店列表
	 */
	@GetRequest(url = "/mp/venue/select")
	StudyApiResult<StudyVenueListResp> nearbyVenues(@Query StudyLocationQueryReq dto);

	/**
	 * 预约门店列表
	 * @return 门店列表
	 */
	@GetRequest(url = "/mp/reserve/venue/select")
	StudyApiResult<StudyVenueListResp> reserveVenues();

	/**
	 * 预约门店详情
	 * @param venueId 门店ID
	 * @return 门店详情
	 */
	@GetRequest(url = "/mp/reserve/venue/detail")
	StudyApiResult<StudySeatVenueResp> reserveVenueDetail(@Query("venueId") Long venueId);

	/**
	 * 预约区域列表
	 * @return 区域列表（areaList）
	 */
	@GetRequest(url = "/mp/reserve/area/select")
	StudyApiResult<StudyAreaListResp> reserveAreas();

	/**
	 * 团购核销门店列表
	 * @param dto 当前定位
	 * @return 门店列表
	 */
	@GetRequest(url = "/mp/receipt/venue/select")
	StudyApiResult<StudyVenueListResp> receiptVenues(@Query StudyLocationQueryReq dto);

	/**
	 * 抖音核销门店列表
	 * @param dto 当前定位
	 * @return 门店列表
	 */
	@GetRequest(url = "/mp/douYin/venue/select")
	StudyApiResult<StudyDouYinVenueListResp> douYinVenues(@Query StudyLocationQueryReq dto);

	/**
	 * 门店公告弹窗
	 * @param venueId 门店ID，0 表示全局公告
	 * @return 公告内容
	 */
	@GetRequest(url = "/mp/notice/board/info")
	StudyApiResult<StudyNoticeResp> noticeBoard(@Query("venueId") Long venueId);

}
