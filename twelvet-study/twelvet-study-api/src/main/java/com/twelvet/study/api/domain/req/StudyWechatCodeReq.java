package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 微信登录/刷新 session 请求参数
 */
@Schema(description = "微信登录/刷新 session 请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyWechatCodeReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * wx.login 返回的临时登录凭证 code
	 */
	@Schema(description = "wx.login 返回的临时登录凭证 code")
	private String wechatCode;

	public String getWechatCode() {
		return wechatCode;
	}

	public void setWechatCode(String wechatCode) {
		this.wechatCode = wechatCode;
	}

}
