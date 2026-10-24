package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.req.StudyLocationQueryReq;
import com.twelvet.study.api.domain.req.StudyPackageConfirmReq;
import com.twelvet.study.api.domain.req.StudyPackageConfirmV2Req;
import com.twelvet.study.api.domain.req.StudyPackageQueryReq;
import com.twelvet.study.api.domain.req.StudyPayOrderReq;
import com.twelvet.study.api.domain.resp.StudyOrderResp;
import com.twelvet.study.api.domain.resp.StudyPackageAreaListResp;
import com.twelvet.study.api.domain.resp.StudyPackageListResp;
import com.twelvet.study.api.domain.resp.StudyPackageOptionResp;
import com.twelvet.study.api.domain.resp.StudyPackageResp;
import com.twelvet.study.api.domain.resp.StudyPayResp;
import com.twelvet.study.api.domain.resp.StudySeatAreaListResp;
import com.twelvet.study.server.service.IStudyPackageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序套餐购买中转
 */
@Tag(description = "StudyPackageController", name = "自习室-套餐购买")
@RestController
@RequestMapping("/study/package")
public class StudyPackageController extends TWTController {

	@Autowired
	private IStudyPackageService iStudyPackageService;

	/**
	 * 套餐区域列表（旧版）
	 * @return 区域列表
	 */
	@Operation(summary = "套餐区域列表")
	@GetMapping("/list")
	@SaCheckPermission("study:package:list")
	public JsonResult<StudyPackageAreaListResp> packageList() {
		return JsonResult.success(iStudyPackageService.packageList());
	}

	/**
	 * 套餐介绍
	 * @return 套餐介绍
	 */
	@Operation(summary = "套餐介绍")
	@GetMapping("/introduce")
	@SaCheckPermission("study:package:query")
	public JsonResult<Map<String, Object>> introduce() {
		return JsonResult.success(iStudyPackageService.introduce());
	}

	/**
	 * 门店可选区域
	 * @param venueId 门店ID
	 * @return 区域列表
	 */
	@Operation(summary = "门店可选区域")
	@GetMapping("/v2/label/selectList")
	@SaCheckPermission("study:package:label")
	public JsonResult<StudySeatAreaListResp> seatAreaList(@RequestParam Long venueId) {
		return JsonResult.success(iStudyPackageService.seatAreaList(venueId));
	}

	/**
	 * 套餐筛选选项
	 * @param dto 定位
	 * @return 选项
	 */
	@Operation(summary = "套餐筛选选项")
	@GetMapping("/v2/optList")
	@SaCheckPermission("study:package:label")
	public JsonResult<StudyPackageOptionResp> options(StudyLocationQueryReq dto) {
		return JsonResult.success(iStudyPackageService.options(dto));
	}

	/**
	 * 套餐列表（v2）
	 * @param dto 查询条件
	 * @return 套餐列表
	 */
	@Operation(summary = "套餐列表(v2)")
	@PostMapping("/v2/list")
	@SaCheckPermission("study:package:list")
	public JsonResult<StudyPackageListResp> v2PackageList(@Validated @RequestBody StudyPackageQueryReq dto) {
		return JsonResult.success(iStudyPackageService.v2PackageList(dto));
	}

	/**
	 * 套餐详情
	 * @param id 套餐ID
	 * @return 套餐详情
	 */
	@Operation(summary = "套餐详情")
	@GetMapping("/v2/{id}")
	@SaCheckPermission("study:package:query")
	public JsonResult<StudyPackageResp> detail(@PathVariable Long id) {
		return JsonResult.success(iStudyPackageService.detail(id));
	}

	/**
	 * 套餐下单（v2）
	 * @param dto 下单参数
	 * @return 订单
	 */
	@Operation(summary = "套餐下单(v2)")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/v2/confirm")
	@SaCheckPermission("study:package:confirm")
	public JsonResult<StudyOrderResp> confirmV2(@Validated @RequestBody StudyPackageConfirmV2Req dto) {
		return JsonResult.success(iStudyPackageService.confirmV2(dto));
	}

	/**
	 * 套餐下单（旧版）
	 * @param dto 下单参数
	 * @return 订单
	 */
	@Operation(summary = "套餐下单")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/confirm")
	@SaCheckPermission("study:package:confirm")
	public JsonResult<StudyOrderResp> confirm(@Validated @RequestBody StudyPackageConfirmReq dto) {
		return JsonResult.success(iStudyPackageService.confirm(dto));
	}

	/**
	 * 套餐支付
	 * @param dto 支付参数
	 * @return 支付信息
	 */
	@Operation(summary = "套餐支付")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/payOrder")
	@SaCheckPermission("study:package:pay")
	public JsonResult<StudyPayResp> payOrder(@Validated @RequestBody StudyPayOrderReq dto) {
		return JsonResult.success(iStudyPackageService.payOrder(dto));
	}

}
