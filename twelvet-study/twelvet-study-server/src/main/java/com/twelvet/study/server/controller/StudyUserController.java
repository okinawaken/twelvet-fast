package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.req.StudyLeaveConfirmReq;
import com.twelvet.study.api.domain.req.StudyUserLeaveCancelReq;
import com.twelvet.study.api.domain.req.StudyUserUpdateReq;
import com.twelvet.study.api.domain.resp.StudyEnterLeaveResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyUserFeeResp;
import com.twelvet.study.api.domain.resp.StudyUserOrderResp;
import com.twelvet.study.api.domain.resp.StudyUserPackageListResp;
import com.twelvet.study.api.domain.resp.StudyUserResp;
import com.twelvet.study.server.service.IStudyUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序用户中心中转
 */
@Tag(description = "StudyUserController", name = "自习室-用户中心")
@RestController
@RequestMapping("/study/user")
public class StudyUserController extends TWTController {

	@Autowired
	private IStudyUserService iStudyUserService;

	/**
	 * 用户首页
	 * @return 用户信息
	 */
	@Operation(summary = "用户首页")
	@GetMapping("/index")
	@SaCheckPermission("study:user:index")
	public JsonResult<StudyUserResp> index() {
		return JsonResult.success(iStudyUserService.index());
	}

	/**
	 * 用户详情
	 * @return 用户信息
	 */
	@Operation(summary = "用户详情")
	@GetMapping("/detailInfo")
	@SaCheckPermission("study:user:query")
	public JsonResult<StudyUserResp> detailInfo() {
		return JsonResult.success(iStudyUserService.detailInfo());
	}

	/**
	 * 修改用户资料
	 * @param dto 用户资料
	 * @return 影响行数
	 */
	@Operation(summary = "修改用户资料")
	@Log(service = "自习室", businessType = BusinessType.UPDATE)
	@PostMapping("/updateInfo")
	@SaCheckPermission("study:user:update")
	public JsonResult<Integer> updateInfo(@Validated @RequestBody StudyUserUpdateReq dto) {
		return JsonResult.success(iStudyUserService.updateInfo(dto));
	}

	/**
	 * 用户费用信息
	 * @return 费用信息
	 */
	@Operation(summary = "用户费用信息")
	@GetMapping("/info/fee")
	@SaCheckPermission("study:user:fee")
	public JsonResult<StudyUserFeeResp> feeInfo() {
		return JsonResult.success(iStudyUserService.feeInfo());
	}

	/**
	 * 用户套餐列表
	 * @return 套餐列表
	 */
	@Operation(summary = "用户套餐列表")
	@GetMapping("/userPackage/list")
	@SaCheckPermission("study:user:package")
	public JsonResult<StudyUserPackageListResp> userPackageList() {
		return JsonResult.success(iStudyUserService.userPackageList());
	}

	/**
	 * 用户订单列表
	 * @return 订单列表
	 */
	@Operation(summary = "用户订单列表")
	@GetMapping("/userOrder/list")
	@SaCheckPermission("study:user:order")
	public JsonResult<StudyListResp<StudyUserOrderResp>> userOrderList() {
		return JsonResult.success(iStudyUserService.userOrderList());
	}

	/**
	 * 请假进出信息
	 * @param userPackageId 用户套餐ID
	 * @return 进出信息
	 */
	@Operation(summary = "请假进出信息")
	@GetMapping("/userLeave/enterLeave")
	@SaCheckPermission("study:user:leave")
	public JsonResult<StudyEnterLeaveResp> enterLeave(@RequestParam Long userPackageId) {
		return JsonResult.success(iStudyUserService.enterLeave(userPackageId));
	}

	/**
	 * 确认请假
	 * @param dto 请假参数
	 * @return 操作结果
	 */
	@Operation(summary = "确认请假")
	@Log(service = "自习室", businessType = BusinessType.UPDATE)
	@PostMapping("/userLeave/confirmLeave")
	@SaCheckPermission("study:user:leave")
	public JsonResult<String> confirmLeave(@Validated @RequestBody StudyLeaveConfirmReq dto) {
		iStudyUserService.confirmLeave(dto);
		return JsonResult.success();
	}

	/**
	 * 取消请假
	 * @param dto 请假参数
	 * @return 操作结果
	 */
	@Operation(summary = "取消请假")
	@Log(service = "自习室", businessType = BusinessType.UPDATE)
	@PostMapping("/userLeave/cancelLeave")
	@SaCheckPermission("study:user:leave")
	public JsonResult<String> cancelLeave(@Validated @RequestBody StudyUserLeaveCancelReq dto) {
		iStudyUserService.cancelLeave(dto);
		return JsonResult.success();
	}

}
