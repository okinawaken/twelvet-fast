package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
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
import com.twelvet.study.server.service.IStudySignService;
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

import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序签到学习中转
 */
@Tag(description = "StudySignController", name = "自习室-签到学习")
@RestController
@RequestMapping("/study/sign")
public class StudySignController extends TWTController {

	@Autowired
	private IStudySignService iStudySignService;

	/**
	 * 学习首页
	 * @param dto 定位与门店参数
	 * @return 学习首页数据
	 */
	@Operation(summary = "学习首页")
	@GetMapping("/index")
	@SaCheckPermission("study:sign:index")
	public JsonResult<StudyVenueResp> index(StudySignIndexQueryReq dto) {
		return JsonResult.success(iStudySignService.index(dto));
	}

	/**
	 * 签到座位列表
	 * @param dto 门店与座位参数
	 * @return 座位图
	 */
	@Operation(summary = "签到座位列表")
	@PostMapping("/seat/list")
	@SaCheckPermission("study:sign:seat")
	public JsonResult<StudySignSeatMapResp> seatList(@Validated @RequestBody StudySignSeatQueryReq dto) {
		return JsonResult.success(iStudySignService.seatList(dto));
	}

	/**
	 * 签退
	 * @param dto 签退参数
	 * @return 签退结果
	 */
	@Operation(summary = "签退")
	@Log(service = "自习室", businessType = BusinessType.UPDATE)
	@PostMapping("/signOut")
	@SaCheckPermission("study:sign:out")
	public JsonResult<StudySignOutResp> signOut(@Validated @RequestBody StudySignOutReq dto) {
		return JsonResult.success(iStudySignService.signOut(dto));
	}

	/**
	 * 换座可选座位
	 * @param dto 换座参数
	 * @return 座位图
	 */
	@Operation(summary = "换座可选座位")
	@PostMapping("/change/seat/list")
	@SaCheckPermission("study:sign:change")
	public JsonResult<StudySeatMapResp> changeSeatList(@Validated @RequestBody StudyUserSignReq dto) {
		return JsonResult.success(iStudySignService.changeSeatList(dto));
	}

	/**
	 * 他人签到校验
	 * @param venueId 门店ID
	 * @return 校验结果
	 */
	@Operation(summary = "他人签到校验")
	@GetMapping("/signAnother/check")
	@SaCheckPermission("study:sign:check")
	public JsonResult<StudySignAnotherResp> checkSignAnother(@RequestParam Long venueId) {
		return JsonResult.success(iStudySignService.checkSignAnother(venueId));
	}

	/**
	 * 结算套餐可选列表
	 * @param dto 结算参数
	 * @return 套餐列表
	 */
	@Operation(summary = "结算套餐可选列表")
	@PostMapping("/settlePackage/select")
	@SaCheckPermission("study:sign:settle")
	public JsonResult<List<StudySettlePackageResp>> settlePackages(@Validated @RequestBody StudySettlePackageReq dto) {
		return JsonResult.success(iStudySignService.settlePackages(dto));
	}

	/**
	 * 学习榜单
	 * @param dto 榜单查询参数
	 * @return 榜单
	 */
	@Operation(summary = "学习榜单")
	@PostMapping("/rank/index")
	@SaCheckPermission("study:sign:rank")
	public JsonResult<StudyRankResp> rank(@Validated @RequestBody StudyRankQueryReq dto) {
		return JsonResult.success(iStudySignService.rank(dto));
	}

}
