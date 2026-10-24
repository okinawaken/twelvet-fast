package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 授权头像昵称请求参数
 */
@Schema(description = "授权头像昵称请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyHeadImgReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 微信昵称
	 */
	@Schema(description = "微信昵称")
	private String nickName;

	/**
	 * 微信头像地址
	 */
	@Schema(description = "微信头像地址")
	private String headImg;

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
