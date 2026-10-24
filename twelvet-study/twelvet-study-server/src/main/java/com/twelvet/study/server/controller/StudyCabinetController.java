package com.twelvet.study.server.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.twelvet.framework.core.application.controller.TWTController;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.framework.log.annotation.Log;
import com.twelvet.framework.log.enums.BusinessType;
import com.twelvet.study.api.domain.req.StudyCabinetPayQueryReq;
import com.twelvet.study.api.domain.resp.StudyCabinetOrderResp;
import com.twelvet.study.api.domain.resp.StudyCabinetPayResp;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.server.service.IStudyCabinetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序储物柜中转
 */
@Tag(description = "StudyCabinetController", name = "自习室-储物柜")
@RestController
@RequestMapping("/study/cabinet")
public class StudyCabinetController extends TWTController {

	@Autowired
	private IStudyCabinetService iStudyCabinetService;

	/**
	 * 储物柜订单列表
	 * @return 订单列表
	 */
	@Operation(summary = "储物柜订单列表")
	@PostMapping("/v2/lease/order/list")
	@SaCheckPermission("study:cabinet:list")
	public JsonResult<StudyListResp<StudyCabinetOrderResp>> orderList() {
		return JsonResult.success(iStudyCabinetService.orderList());
	}

	/**
	 * 储物柜续租支付
	 * @param dto 支付参数，上游使用 query 传参
	 * @return 支付信息
	 */
	@Operation(summary = "储物柜续租支付")
	@Log(service = "自习室", businessType = BusinessType.INSERT)
	@PostMapping("/v2/lease/pay")
	@SaCheckPermission("study:cabinet:pay")
	public JsonResult<StudyCabinetPayResp> pay(StudyCabinetPayQueryReq dto) {
		return JsonResult.success(iStudyCabinetService.pay(dto));
	}

}
