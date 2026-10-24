package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 订单支付请求参数
 */
@Schema(description = "订单支付请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyPayOrderReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户订单ID
	 */
	@Schema(description = "用户订单ID")
	private Long userOrderId;

	public Long getUserOrderId() {
		return userOrderId;
	}

	public void setUserOrderId(Long userOrderId) {
		this.userOrderId = userOrderId;
	}

}
