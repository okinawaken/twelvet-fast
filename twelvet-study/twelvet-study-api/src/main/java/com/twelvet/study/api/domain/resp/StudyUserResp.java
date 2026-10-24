package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 用户信息
 */
@Schema(description = "用户信息")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyUserResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@Schema(description = "用户ID")
	private Long id;

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
	 * 头像地址
	 */
	@Schema(description = "头像地址")
	private String headImg;

	/**
	 * 头像是否授权：0-否 1-是
	 */
	@Schema(description = "头像是否授权：0-否 1-是")
	private Integer headImgAuth;

	/**
	 * 性别
	 */
	@Schema(description = "性别")
	private Integer gender;

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
	 * 是否参与榜单：0-否 1-是
	 */
	@Schema(description = "是否参与榜单：0-否 1-是")
	private Integer rankUserState;

	/**
	 * 累计签到次数
	 */
	@Schema(description = "累计签到次数")
	private Integer signTotalNum;

	/**
	 * 是否开启学习榜单：true-是 false-否
	 */
	@Schema(description = "是否开启学习榜单：true-是 false-否")
	private String studyRankOpen;

	/**
	 * 累计学习时长
	 */
	@Schema(description = "累计学习时长")
	private String studyTotalTimeStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Integer getHeadImgAuth() {
		return headImgAuth;
	}

	public void setHeadImgAuth(Integer headImgAuth) {
		this.headImgAuth = headImgAuth;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
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

	public Integer getRankUserState() {
		return rankUserState;
	}

	public void setRankUserState(Integer rankUserState) {
		this.rankUserState = rankUserState;
	}

	public Integer getSignTotalNum() {
		return signTotalNum;
	}

	public void setSignTotalNum(Integer signTotalNum) {
		this.signTotalNum = signTotalNum;
	}

	public String getStudyRankOpen() {
		return studyRankOpen;
	}

	public void setStudyRankOpen(String studyRankOpen) {
		this.studyRankOpen = studyRankOpen;
	}

	public String getStudyTotalTimeStr() {
		return studyTotalTimeStr;
	}

	public void setStudyTotalTimeStr(String studyTotalTimeStr) {
		this.studyTotalTimeStr = studyTotalTimeStr;
	}

}
