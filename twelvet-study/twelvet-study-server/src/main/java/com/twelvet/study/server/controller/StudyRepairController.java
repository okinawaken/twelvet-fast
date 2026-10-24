package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.req.StudyRepairSubmitReq;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyRepairResp;
import com.twelvet.study.server.service.IStudyRepairService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序报修中转
 */
@Tag(description = "StudyRepairController", name = "自习室-报修")
@RestController
@RequestMapping("/study/repair")
public class StudyRepairController extends TWTController {

	@Autowired
	private IStudyRepairService iStudyRepairService;

	/**
	 * 提交报修
	 * @param dto 报修参数
	 * @return 操作结果
	 */
	@Operation(summary = "提交报修")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/submit")
	@SaCheckPermission("study:repair:submit")
	public JsonResult<String> submit(@Validated @RequestBody StudyRepairSubmitReq dto) {
		iStudyRepairService.submit(dto);
		return JsonResult.success();
	}

	/**
	 * 报修列表
	 * @return 报修列表
	 */
	@Operation(summary = "报修列表")
	@GetMapping("/list")
	@SaCheckPermission("study:repair:list")
	public JsonResult<StudyListResp<StudyRepairResp>> list() {
		return JsonResult.success(iStudyRepairService.list());
	}

	/**
	 * 报修详情
	 * @param id 报修ID
	 * @return 报修详情
	 */
	@Operation(summary = "报修详情")
	@GetMapping("/{id}")
	@SaCheckPermission("study:repair:query")
	public JsonResult<StudyRepairResp> detail(@PathVariable Long id) {
		return JsonResult.success(iStudyRepairService.detail(id));
	}

}
