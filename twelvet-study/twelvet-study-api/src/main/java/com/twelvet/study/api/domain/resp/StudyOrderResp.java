package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐下单响应
 */
@Schema(description = "套餐下单响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyOrderResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户订单ID，用于发起支付
	 */
	@Schema(description = "用户订单ID，用于发起支付")
	private Long userOrderId;

	public Long getUserOrderId() {
		return userOrderId;
	}

	public void setUserOrderId(Long userOrderId) {
		this.userOrderId = userOrderId;
	}

}
