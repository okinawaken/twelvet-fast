package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 登录 / 绑定手机号响应
 */
@Schema(description = "登录 / 绑定手机号响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyLoginResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 登录令牌，后续请求放在请求头 token 中
	 */
	@Schema(description = "登录令牌，后续请求放在请求头 token 中")
	private String token;

	/**
	 * 是否已绑定手机号：0-否 1-是
	 */
	@Schema(description = "是否已绑定手机号：0-否 1-是")
	private Integer bindMobile;

	/**
	 * 手机号
	 */
	@Schema(description = "手机号")
	private String mobile;

	/**
	 * 真实姓名
	 */
	@Schema(description = "真实姓名")
	private String trueName;

	/**
	 * 用户角色
	 */
	@Schema(description = "用户角色")
	private String role;

	/**
	 * 昵称
	 */
	@Schema(description = "昵称")
	private String nickName;

	/**
	 * 头像地址
	 */
	@Schema(description = "头像地址")
	private String headImg;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getBindMobile() {
		return bindMobile;
	}

	public void setBindMobile(Integer bindMobile) {
		this.bindMobile = bindMobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

}
