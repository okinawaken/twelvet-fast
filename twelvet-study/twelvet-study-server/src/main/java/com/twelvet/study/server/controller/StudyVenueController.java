package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.study.api.domain.req.StudyLocationQueryReq;
import com.twelvet.study.api.domain.resp.StudyAreaListResp;
import com.twelvet.study.api.domain.resp.StudyDouYinVenueListResp;
import com.twelvet.study.api.domain.resp.StudyNoticeResp;
import com.twelvet.study.api.domain.resp.StudySeatVenueResp;
import com.twelvet.study.api.domain.resp.StudyVenueListResp;
import com.twelvet.study.server.service.IStudyVenueService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序门店与公告中转
 */
@Tag(description = "StudyVenueController", name = "自习室-门店公告")
@RestController
@RequestMapping("/study/venue")
public class StudyVenueController extends TWTController {

	@Autowired
	private IStudyVenueService iStudyVenueService;

	/**
	 * 附近门店
	 * @param dto 定位
	 * @return 门店列表
	 */
	@Operation(summary = "附近门店")
	@GetMapping("/select")
	@SaCheckPermission("study:venue:list")
	public JsonResult<StudyVenueListResp> nearbyVenues(StudyLocationQueryReq dto) {
		return JsonResult.success(iStudyVenueService.nearbyVenues(dto));
	}

	/**
	 * 可预约门店
	 * @return 门店列表
	 */
	@Operation(summary = "可预约门店")
	@GetMapping("/reserve/select")
	@SaCheckPermission("study:venue:list")
	public JsonResult<StudyVenueListResp> reserveVenues() {
		return JsonResult.success(iStudyVenueService.reserveVenues());
	}

	/**
	 * 可预约门店详情
	 * @param venueId 门店ID
	 * @return 门店详情
	 */
	@Operation(summary = "可预约门店详情")
	@GetMapping("/reserve/detail")
	@SaCheckPermission("study:venue:query")
	public JsonResult<StudySeatVenueResp> reserveVenueDetail(@RequestParam Long venueId) {
		return JsonResult.success(iStudyVenueService.reserveVenueDetail(venueId));
	}

	/**
	 * 可预约区域
	 * @return 区域列表
	 */
	@Operation(summary = "可预约区域")
	@GetMapping("/reserve/area/select")
	@SaCheckPermission("study:venue:area")
	public JsonResult<StudyAreaListResp> reserveAreas() {
		return JsonResult.success(iStudyVenueService.reserveAreas());
	}

	/**
	 * 团购核销门店
	 * @param dto 定位
	 * @return 门店列表
	 */
	@Operation(summary = "团购核销门店")
	@GetMapping("/receipt/select")
	@SaCheckPermission("study:venue:list")
	public JsonResult<StudyVenueListResp> receiptVenues(StudyLocationQueryReq dto) {
		return JsonResult.success(iStudyVenueService.receiptVenues(dto));
	}

	/**
	 * 抖音核销门店
	 * @param dto 定位
	 * @return 门店列表
	 */
	@Operation(summary = "抖音核销门店")
	@GetMapping("/douYin/select")
	@SaCheckPermission("study:venue:list")
	public JsonResult<StudyDouYinVenueListResp> douYinVenues(StudyLocationQueryReq dto) {
		return JsonResult.success(iStudyVenueService.douYinVenues(dto));
	}

	/**
	 * 门店公告
	 * @param venueId 门店ID
	 * @return 公告
	 */
	@Operation(summary = "门店公告")
	@GetMapping("/notice")
	@SaCheckPermission("study:venue:notice")
	public JsonResult<StudyNoticeResp> noticeBoard(@RequestParam Long venueId) {
		return JsonResult.success(iStudyVenueService.noticeBoard(venueId));
	}

}
