package com.twelvet.study.api.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 手动绑定小程序令牌入参
 */
@Schema(description = "手动绑定小程序令牌入参")
public class StudyTokenBindVO implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 小程序登录令牌，从抓包或小程序端获取
	 */
	@Schema(description = "小程序登录令牌")
	private String token;

	/**
	 * 令牌只允许可见字符，避免 CR/LF 拼进 HTTP 请求头造成 header 注入
	 * @return 小程序登录令牌
	 */
	@NotBlank(message = "小程序令牌不能为空")
	@Size(max = 512, message = "小程序令牌长度不能超过512个字符")
	@Pattern(regexp = "[A-Za-z0-9._\\-]+", message = "小程序令牌格式不正确")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
