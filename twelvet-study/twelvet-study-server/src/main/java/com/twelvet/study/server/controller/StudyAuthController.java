package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.req.StudyBindMobileReq;
import com.twelvet.study.api.domain.req.StudyHeadImgReq;
import com.twelvet.study.api.domain.req.StudyWechatCodeReq;
import com.twelvet.study.api.domain.resp.StudyLoginResp;
import com.twelvet.study.server.service.IStudyAuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序登录授权
 */
@Deprecated
@Tag(description = "StudyAuthController", name = "自习室-登录授权")
@RestController
@RequestMapping("/study/auth")
public class StudyAuthController extends TWTController {

	@Autowired
	private IStudyAuthService iStudyAuthService;

	/**
	 * 微信登录
	 * @param dto 微信登录凭证
	 * @return 登录信息
	 */
	@Operation(summary = "微信登录（需小程序端实时生成 wechatCode）")
	@PostMapping("/login")
	@SaCheckPermission("study:auth:login")
	public JsonResult<StudyLoginResp> login(@Validated @RequestBody StudyWechatCodeReq dto) {
		return JsonResult.success(iStudyAuthService.login(dto));
	}

	/**
	 * 授权手机号并登录
	 * @param dto 凭证与手机号加密数据
	 * @return 登录信息
	 */
	@Operation(summary = "授权手机号并登录（需小程序端实时生成 wechatCode）")
	@PostMapping("/bindMobile")
	@SaCheckPermission("study:auth:bindMobile")
	public JsonResult<StudyLoginResp> bindMobile(@Validated @RequestBody StudyBindMobileReq dto) {
		return JsonResult.success(iStudyAuthService.bindMobile(dto));
	}

	/**
	 * 刷新 sessionKey
	 * @param dto 微信登录凭证
	 * @return 操作结果
	 */
	@Operation(summary = "刷新sessionKey（需小程序端实时生成 wechatCode）")
	@PostMapping("/refreshSessionKey")
	@SaCheckPermission("study:auth:refreshSession")
	public JsonResult<String> refreshSessionKey(@Validated @RequestBody StudyWechatCodeReq dto) {
		iStudyAuthService.refreshSessionKey(dto);
		return JsonResult.success();
	}

	/**
	 * 保存微信头像昵称
	 * @param dto 昵称与头像地址
	 * @return 操作结果
	 */
	@Operation(summary = "保存微信头像昵称")
	@Log(service = "自习室", businessType = BusinessType.UPDATE)
	@PostMapping("/headImg")
	@SaCheckPermission("study:auth:headImg")
	public JsonResult<String> authorizeHeadImg(@Validated @RequestBody StudyHeadImgReq dto) {
		iStudyAuthService.authorizeHeadImg(dto);
		return JsonResult.success();
	}

	/**
	 * 上传微信头像
	 * @param file 头像文件
	 * @return 头像地址
	 */
	@Operation(summary = "上传微信头像")
	@PostMapping("/headImg/upload")
	@SaCheckPermission("study:auth:headImg")
	public JsonResult<String> uploadHeadImg(@RequestPart("file") MultipartFile file) {
		return JsonResult.success(iStudyAuthService.uploadHeadImg(file));
	}

	/**
	 * 注销账号
	 * @return 操作结果
	 */
	@Operation(summary = "注销小程序账号")
	@Log(service = "自习室", businessType = BusinessType.DELETE)
	@PostMapping("/cancel")
	@SaCheckPermission("study:auth:cancel")
	public JsonResult<String> cancel() {
		iStudyAuthService.cancel();
		return JsonResult.success();
	}

}
