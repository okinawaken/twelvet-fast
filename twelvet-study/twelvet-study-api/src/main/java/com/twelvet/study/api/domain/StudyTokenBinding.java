package com.twelvet.study.api.domain;

import com.twelvet.framework.core.application.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序令牌绑定，仅维护后台用户与小程序令牌的对应关系
 */
@Schema(description = "自习室小程序令牌绑定")
public class StudyTokenBinding extends BaseEntity {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@Schema(description = "主键ID")
	private Long id;

	/**
	 * 后台用户ID
	 */
	@Schema(description = "后台用户ID")
	private Long userId;

	/**
	 * 小程序登录令牌
	 */
	@Schema(description = "小程序登录令牌")
	private String accessToken;

	/**
	 * 令牌状态：0-有效 1-失效
	 */
	@Schema(description = "令牌状态：0-有效 1-失效")
	private Integer tokenStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getTokenStatus() {
		return tokenStatus;
	}

	public void setTokenStatus(Integer tokenStatus) {
		this.tokenStatus = tokenStatus;
	}

}
