package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.req.StudyReserveIndexQueryReq;
import com.twelvet.study.api.domain.req.StudyReserveSeatConfirmReq;
import com.twelvet.study.api.domain.req.StudyReserveSeatQueryReq;
import com.twelvet.study.api.domain.req.StudyReserveV2SeatConfirmReq;
import com.twelvet.study.api.domain.req.StudyReserveV2SeatQueryReq;
import com.twelvet.study.api.domain.req.StudyUserReserveCancelReq;
import com.twelvet.study.api.domain.resp.StudyCancelTipResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyReserveAnotherResp;
import com.twelvet.study.api.domain.resp.StudyReserveCheckResp;
import com.twelvet.study.api.domain.resp.StudyReserveConfirmResp;
import com.twelvet.study.api.domain.resp.StudyReserveDateResp;
import com.twelvet.study.api.domain.resp.StudyReserveIndexResp;
import com.twelvet.study.api.domain.resp.StudySeatMapResp;
import com.twelvet.study.api.domain.resp.StudyUserReserveResp;
import com.twelvet.study.server.service.IStudyReserveService;
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
 * @Description: 自习室小程序座位预约中转
 */
@Tag(description = "StudyReserveController", name = "自习室-座位预约")
@RestController
@RequestMapping("/study/reserve")
public class StudyReserveController extends TWTController {

	@Autowired
	private IStudyReserveService iStudyReserveService;

	/**
	 * 预约首页
	 * @param dto 定位、关键字、渠道与区域
	 * @return 预约首页数据
	 */
	@Operation(summary = "预约首页")
	@GetMapping("/index")
	@SaCheckPermission("study:reserve:index")
	public JsonResult<StudyReserveIndexResp> index(StudyReserveIndexQueryReq dto) {
		return JsonResult.success(iStudyReserveService.index(dto));
	}

	/**
	 * 预约前置校验
	 * @return 校验结果
	 */
	@Operation(summary = "预约前置校验")
	@GetMapping("/check")
	@SaCheckPermission("study:reserve:check")
	public JsonResult<StudyReserveCheckResp> check() {
		return JsonResult.success(iStudyReserveService.check());
	}

	/**
	 * 可预约座位列表（旧版）
	 * @param dto 门店与时间段
	 * @return 座位图
	 */
	@Operation(summary = "可预约座位列表")
	@PostMapping("/seat/list")
	@SaCheckPermission("study:reserve:seat")
	public JsonResult<StudySeatMapResp> seatList(@Validated @RequestBody StudyReserveSeatQueryReq dto) {
		return JsonResult.success(iStudyReserveService.seatList(dto));
	}

	/**
	 * 提交预约（旧版）
	 * @param dto 座位与时间段
	 * @return 预约结果
	 */
	@Operation(summary = "提交预约")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/seat/confirm")
	@SaCheckPermission("study:reserve:confirm")
	public JsonResult<StudyReserveConfirmResp> confirmSeat(@Validated @RequestBody StudyReserveSeatConfirmReq dto) {
		return JsonResult.success(iStudyReserveService.confirmSeat(dto));
	}

	/**
	 * 可预约日期列表（v2）
	 * @param venueId 门店ID
	 * @return 可预约日期
	 */
	@Operation(summary = "可预约日期列表(v2)")
	@GetMapping("/v2/date/select")
	@SaCheckPermission("study:reserve:date")
	public JsonResult<StudyReserveDateResp> dateList(@RequestParam Long venueId) {
		return JsonResult.success(iStudyReserveService.dateList(venueId));
	}

	/**
	 * 可预约座位列表（v2）
	 * @param dto 门店、日期与时段
	 * @return 座位图
	 */
	@Operation(summary = "可预约座位列表(v2)")
	@PostMapping("/v2/seat/list")
	@SaCheckPermission("study:reserve:seat")
	public JsonResult<StudySeatMapResp> v2SeatList(@Validated @RequestBody StudyReserveV2SeatQueryReq dto) {
		return JsonResult.success(iStudyReserveService.v2SeatList(dto));
	}

	/**
	 * 提交预约（v2）
	 * @param dto 座位、日期、时段与定位
	 * @return 预约结果
	 */
	@Operation(summary = "提交预约(v2)")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/v2/seat/confirm")
	@SaCheckPermission("study:reserve:confirm")
	public JsonResult<StudyReserveConfirmResp> v2ConfirmSeat(@Validated @RequestBody StudyReserveV2SeatConfirmReq dto) {
		return JsonResult.success(iStudyReserveService.v2ConfirmSeat(dto));
	}

	/**
	 * 他人预约校验
	 * @param userReserveId 预约记录ID
	 * @return 校验结果
	 */
	@Operation(summary = "他人预约校验")
	@GetMapping("/another/check")
	@SaCheckPermission("study:reserve:check")
	public JsonResult<StudyReserveAnotherResp> checkAnother(@RequestParam Long userReserveId) {
		return JsonResult.success(iStudyReserveService.checkAnother(userReserveId));
	}

	/**
	 * 我的预约列表
	 * @return 预约记录列表
	 */
	@Operation(summary = "我的预约列表")
	@GetMapping("/userReserve/list")
	@SaCheckPermission("study:reserve:query")
	public JsonResult<StudyListResp<StudyUserReserveResp>> userReserveList() {
		return JsonResult.success(iStudyReserveService.userReserveList());
	}

	/**
	 * 取消预约前置提示
	 * @param userReserveId 预约记录ID
	 * @return 提示文案
	 */
	@Operation(summary = "取消预约前置提示")
	@GetMapping("/userReserve/cancel/tip")
	@SaCheckPermission("study:reserve:cancel")
	public JsonResult<StudyCancelTipResp> cancelTip(@RequestParam Long userReserveId) {
		return JsonResult.success(iStudyReserveService.cancelTip(userReserveId));
	}

	/**
	 * 取消预约
	 * @param dto 预约记录ID
	 * @return 操作结果
	 */
	@Operation(summary = "取消预约")
	@Log(service = "自习室", businessType = BusinessType.DELETE)
	@PostMapping("/userReserve/cancel")
	@SaCheckPermission("study:reserve:cancel")
	public JsonResult<String> cancel(@Validated @RequestBody StudyUserReserveCancelReq dto) {
		iStudyReserveService.cancel(dto);
		return JsonResult.success();
	}

}
