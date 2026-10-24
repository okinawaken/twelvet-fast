package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import com.dtflys.forest.annotation.Query;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyLeaveConfirmReq;
import com.twelvet.study.api.domain.req.StudyUserLeaveCancelReq;
import com.twelvet.study.api.domain.req.StudyUserUpdateReq;
import com.twelvet.study.api.domain.resp.StudyEnterLeaveResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyUserFeeResp;
import com.twelvet.study.api.domain.resp.StudyUserOrderResp;
import com.twelvet.study.api.domain.resp.StudyUserPackageListResp;
import com.twelvet.study.api.domain.resp.StudyUserResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;

/**
 * 时不我待小程序 - 用户中心接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyUserClient {

	/**
	 * 个人中心首页
	 * @return 用户信息与统计数据
	 */
	@GetRequest(url = "/mp/user/index")
	StudyApiResult<StudyUserResp> index();

	/**
	 * 用户详情
	 * @return 用户信息
	 */
	@GetRequest(url = "/mp/user/detailInfo")
	StudyApiResult<StudyUserResp> detailInfo();

	/**
	 * 修改用户资料
	 * @param dto 姓名、昵称、性别、榜单展示状态
	 * @return 受影响行数，成功时为 1
	 */
	@PostRequest(url = "/mp/user/updateInfo")
	StudyApiResult<Integer> updateInfo(@JSONBody StudyUserUpdateReq dto);

	/**
	 * 是否存在待结算费用
	 * @return 费用状态
	 */
	@GetRequest(url = "/mp/user/info/fee")
	StudyApiResult<StudyUserFeeResp> feeInfo();

	/**
	 * 我的套餐
	 * @return 已购买与未购买套餐
	 */
	@GetRequest(url = "/mp/user/userPackage/list")
	StudyApiResult<StudyUserPackageListResp> userPackageList();

	/**
	 * 我的订单
	 * @return 订单列表
	 */
	@GetRequest(url = "/mp/user/userOrder/list")
	StudyApiResult<StudyListResp<StudyUserOrderResp>> userOrderList();

	/**
	 * 进入请假页
	 * @param userPackageId 用户套餐ID
	 * @return 请假可选天数等信息
	 */
	@GetRequest(url = "/mp/user/userLeave/enterLeave")
	StudyApiResult<StudyEnterLeaveResp> enterLeave(@Query("userPackageId") Long userPackageId);

	/**
	 * 提交请假
	 * @param dto 套餐、起止日期与原因
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/user/userLeave/confirmLeave")
	StudyApiResult<Void> confirmLeave(@JSONBody StudyLeaveConfirmReq dto);

	/**
	 * 取消请假
	 * @param dto 请假记录ID
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/user/userLeave/cancelLeave")
	StudyApiResult<Void> cancelLeave(@JSONBody StudyUserLeaveCancelReq dto);

}
