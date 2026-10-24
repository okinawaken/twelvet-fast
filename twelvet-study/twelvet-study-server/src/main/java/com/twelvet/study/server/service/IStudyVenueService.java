package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.req.StudyLocationQueryReq;
import com.twelvet.study.api.domain.resp.StudyAreaListResp;
import com.twelvet.study.api.domain.resp.StudyDouYinVenueListResp;
import com.twelvet.study.api.domain.resp.StudyNoticeResp;
import com.twelvet.study.api.domain.resp.StudySeatVenueResp;
import com.twelvet.study.api.domain.resp.StudyVenueListResp;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序门店与公告服务
 */
public interface IStudyVenueService {

	/**
	 * 附近门店
	 * @param dto 定位
	 * @return 门店列表
	 */
	StudyVenueListResp nearbyVenues(StudyLocationQueryReq dto);

	/**
	 * 可预约门店
	 * @return 门店列表
	 */
	StudyVenueListResp reserveVenues();

	/**
	 * 可预约门店详情
	 * @param venueId 门店ID
	 * @return 门店详情
	 */
	StudySeatVenueResp reserveVenueDetail(Long venueId);

	/**
	 * 可预约区域
	 * @return 区域列表
	 */
	StudyAreaListResp reserveAreas();

	/**
	 * 团购核销门店
	 * @param dto 定位
	 * @return 门店列表
	 */
	StudyVenueListResp receiptVenues(StudyLocationQueryReq dto);

	/**
	 * 抖音核销门店
	 * @param dto 定位
	 * @return 门店列表
	 */
	StudyDouYinVenueListResp douYinVenues(StudyLocationQueryReq dto);

	/**
	 * 门店公告
	 * @param venueId 门店ID
	 * @return 公告
	 */
	StudyNoticeResp noticeBoard(Long venueId);

}
