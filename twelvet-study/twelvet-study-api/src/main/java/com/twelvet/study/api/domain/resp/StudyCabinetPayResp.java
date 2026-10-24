package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 柜子续租支付响应
 */
@Schema(description = "柜子续租支付响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyCabinetPayResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 微信支付参数
	 */
	@Schema(description = "微信支付参数")
	private StudyPayResp payParam;

	public StudyPayResp getPayParam() {
		return payParam;
	}

	public void setPayParam(StudyPayResp payParam) {
		this.payParam = payParam;
	}

}
