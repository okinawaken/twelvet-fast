package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.study.api.domain.resp.StudyConfigResp;
import com.twelvet.study.server.service.IStudyCommonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序公共接口中转
 */
@Tag(description = "StudyCommonController", name = "自习室-公共接口")
@RestController
@RequestMapping("/study/common")
public class StudyCommonController extends TWTController {

	@Autowired
	private IStudyCommonService iStudyCommonService;

	/**
	 * 小程序全局配置
	 * @return 客服、预约规则、页面背景等配置
	 */
	@Operation(summary = "小程序全局配置")
	@GetMapping("/config")
	@SaCheckPermission("study:common:config")
	public JsonResult<StudyConfigResp> config() {
		return JsonResult.success(iStudyCommonService.config());
	}

	/**
	 * 上传图片
	 * @param file 图片文件
	 * @return 图片地址集合
	 */
	@Operation(summary = "上传图片")
	@PostMapping("/image/upload")
	@SaCheckPermission("study:common:upload")
	public JsonResult<List<String>> uploadImage(@RequestPart("file") MultipartFile file) {
		return JsonResult.success(iStudyCommonService.uploadImage(file));
	}

}
