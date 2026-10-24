package com.twelvet.study.server.service;

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

import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序签到学习服务
 */
public interface IStudySignService {

	/**
	 * 学习首页
	 * @param dto 定位与门店参数
	 * @return 学习首页数据
	 */
	StudyVenueResp index(StudySignIndexQueryReq dto);

	/**
	 * 签到座位列表
	 * @param dto 门店与座位参数
	 * @return 座位图
	 */
	StudySignSeatMapResp seatList(StudySignSeatQueryReq dto);

	/**
	 * 签退
	 * @param dto 签退参数
	 * @return 签退结果
	 */
	StudySignOutResp signOut(StudySignOutReq dto);

	/**
	 * 换座可选座位
	 * @param dto 换座参数
	 * @return 座位图
	 */
	StudySeatMapResp changeSeatList(StudyUserSignReq dto);

	/**
	 * 他人签到校验
	 * @param venueId 门店ID
	 * @return 校验结果
	 */
	StudySignAnotherResp checkSignAnother(Long venueId);

	/**
	 * 结算套餐可选列表
	 * @param dto 结算参数
	 * @return 套餐列表
	 */
	List<StudySettlePackageResp> settlePackages(StudySettlePackageReq dto);

	/**
	 * 学习榜单
	 * @param dto 榜单查询参数
	 * @return 榜单
	 */
	StudyRankResp rank(StudyRankQueryReq dto);

}
