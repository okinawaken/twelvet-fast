package com.twelvet.study.server.controller;

import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.vo.StudyTokenBindVO;
import com.twelvet.study.api.domain.vo.StudyTokenBindingVO;
import com.twelvet.study.server.service.IStudyTokenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序令牌绑定
 */
@Tag(description = "StudyTokenController", name = "自习室令牌绑定")
@RestController
@RequestMapping("/study/token")
public class StudyTokenController extends TWTController {

	@Autowired
	private IStudyTokenService iStudyTokenService;

	/**
	 * 绑定小程序令牌
	 * @param vo 绑定请求
	 * @return 绑定信息
	 */
	@Operation(summary = "绑定小程序令牌")
	@Log(service = "自习室", businessType = BusinessType.INSERT, isSaveRequestData = false)
	@PostMapping("/bind")
	public JsonResult<StudyTokenBindingVO> bind(@Validated @RequestBody StudyTokenBindVO vo) {
		return JsonResult.success(iStudyTokenService.bind(vo));
	}

	/**
	 * 查询当前绑定信息
	 * @return 绑定信息
	 */
	@Operation(summary = "查询当前绑定信息")
	@GetMapping("/binding")
	public JsonResult<StudyTokenBindingVO> binding() {
		return JsonResult.success(iStudyTokenService.getBinding());
	}

	/**
	 * 重新校验当前绑定令牌
	 * @return 绑定信息
	 */
	@Operation(summary = "重新校验当前绑定令牌")
	@PostMapping("/verify")
	public JsonResult<StudyTokenBindingVO> verify() {
		return JsonResult.success(iStudyTokenService.verify());
	}

	/**
	 * 解绑小程序令牌
	 * @return 操作结果
	 */
	@Operation(summary = "解绑小程序令牌")
	@Log(service = "自习室", businessType = BusinessType.DELETE)
	@DeleteMapping("/binding")
	public JsonResult<String> unbind() {
		iStudyTokenService.unbind();
		return JsonResult.success();
	}

}
