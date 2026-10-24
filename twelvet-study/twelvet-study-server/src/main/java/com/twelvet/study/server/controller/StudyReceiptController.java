package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.req.StudyReceiptConsumeReq;
import com.twelvet.study.server.service.IStudyReceiptService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序团购核销中转
 */
@Tag(description = "StudyReceiptController", name = "自习室-团购核销")
@RestController
@RequestMapping("/study/receipt")
public class StudyReceiptController extends TWTController {

	@Autowired
	private IStudyReceiptService iStudyReceiptService;

	/**
	 * 团购券核销
	 * @param dto 核销参数
	 * @return 操作结果
	 */
	@Operation(summary = "团购券核销")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/consume")
	@SaCheckPermission("study:receipt:consume")
	public JsonResult<String> consume(@Validated @RequestBody StudyReceiptConsumeReq dto) {
		iStudyReceiptService.consume(dto);
		return JsonResult.success();
	}

	/**
	 * 抖音券核销
	 * @param dto 核销参数
	 * @return 操作结果
	 */
	@Operation(summary = "抖音券核销")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/douYin/verify")
	@SaCheckPermission("study:receipt:consume")
	public JsonResult<String> douYinConsume(@Validated @RequestBody StudyReceiptConsumeReq dto) {
		iStudyReceiptService.douYinConsume(dto);
		return JsonResult.success();
	}

}
