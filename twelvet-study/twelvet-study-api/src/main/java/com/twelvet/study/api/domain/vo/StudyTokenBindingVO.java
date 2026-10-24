package com.twelvet.study.api.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序令牌绑定信息
 */
@Schema(description = "小程序令牌绑定信息")
public class StudyTokenBindingVO implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 后台用户ID
	 */
	@Schema(description = "后台用户ID")
	private Long userId;

	/**
	 * 脱敏后的令牌
	 */
	@Schema(description = "脱敏后的令牌")
	private String token;

	/**
	 * 令牌状态：0-有效 1-失效
	 */
	@Schema(description = "令牌状态：0-有效 1-失效")
	private Integer tokenStatus;

	/**
	 * 绑定时间
	 */
	@Schema(description = "绑定时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime bindTime;

	/**
	 * 最近更新时间（即最近一次校验时间）
	 */
	@Schema(description = "最近更新时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updateTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getTokenStatus() {
		return tokenStatus;
	}

	public void setTokenStatus(Integer tokenStatus) {
		this.tokenStatus = tokenStatus;
	}

	public LocalDateTime getBindTime() {
		return bindTime;
	}

	public void setBindTime(LocalDateTime bindTime) {
		this.bindTime = bindTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

}
