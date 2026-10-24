package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 修改用户资料请求参数
 */
@Schema(description = "修改用户资料请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyUserUpdateReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 姓名
	 */
	@Schema(description = "姓名")
	private String userName;

	/**
	 * 昵称
	 */
	@Schema(description = "昵称")
	private String nickName;

	/**
	 * 性别
	 */
	@Schema(description = "性别")
	private Integer gender;

	/**
	 * 排行榜展示状态
	 */
	@Schema(description = "排行榜展示状态")
	private Integer rankUserState;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getRankUserState() {
		return rankUserState;
	}

	public void setRankUserState(Integer rankUserState) {
		this.rankUserState = rankUserState;
	}

}
