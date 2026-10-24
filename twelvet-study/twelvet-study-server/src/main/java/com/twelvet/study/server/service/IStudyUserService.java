package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.req.StudyLeaveConfirmReq;
import com.twelvet.study.api.domain.req.StudyUserLeaveCancelReq;
import com.twelvet.study.api.domain.req.StudyUserUpdateReq;
import com.twelvet.study.api.domain.resp.StudyEnterLeaveResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyUserFeeResp;
import com.twelvet.study.api.domain.resp.StudyUserOrderResp;
import com.twelvet.study.api.domain.resp.StudyUserPackageListResp;
import com.twelvet.study.api.domain.resp.StudyUserResp;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序用户中心服务
 */
public interface IStudyUserService {

	/**
	 * 用户首页
	 * @return 用户信息
	 */
	StudyUserResp index();

	/**
	 * 用户详情
	 * @return 用户信息
	 */
	StudyUserResp detailInfo();

	/**
	 * 修改用户资料
	 * @param dto 用户资料
	 * @return 影响行数
	 */
	Integer updateInfo(StudyUserUpdateReq dto);

	/**
	 * 用户费用信息
	 * @return 费用信息
	 */
	StudyUserFeeResp feeInfo();

	/**
	 * 用户套餐列表
	 * @return 套餐列表
	 */
	StudyUserPackageListResp userPackageList();

	/**
	 * 用户订单列表
	 * @return 订单列表
	 */
	StudyListResp<StudyUserOrderResp> userOrderList();

	/**
	 * 请假进出信息
	 * @param userPackageId 用户套餐ID
	 * @return 进出信息
	 */
	StudyEnterLeaveResp enterLeave(Long userPackageId);

	/**
	 * 确认请假
	 * @param dto 请假参数
	 */
	void confirmLeave(StudyLeaveConfirmReq dto);

	/**
	 * 取消请假
	 * @param dto 请假参数
	 */
	void cancelLeave(StudyUserLeaveCancelReq dto);

}
