package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 排行榜条目
 */
@Schema(description = "排行榜条目")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyRankUserResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 榜单名次
	 */
	@Schema(description = "榜单名次")
	private Integer rankIndex;

	/**
	 * 用户ID
	 */
	@Schema(description = "用户ID")
	private Long userId;

	/**
	 * 真实姓名
	 */
	@Schema(description = "真实姓名")
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
	 * 手机号（已脱敏）
	 */
	@Schema(description = "手机号（已脱敏）")
	private String mobile;

	/**
	 * 学习天数
	 */
	@Schema(description = "学习天数")
	private Integer studyDayNum;

	/**
	 * 学习分钟数
	 */
	@Schema(description = "学习分钟数")
	private Integer studyMinuteNum;

	/**
	 * 学习时长描述
	 */
	@Schema(description = "学习时长描述")
	private String studyMinuteStr;

	/**
	 * 名次变化数
	 */
	@Schema(description = "名次变化数")
	private Integer changeNum;

	/**
	 * 名次变化类型：up-上升 down-下降 fix-不变 new-新上榜
	 */
	@Schema(description = "名次变化类型：up-上升 down-下降 fix-不变 new-新上榜")
	private String changeType;

	public Integer getRankIndex() {
		return rankIndex;
	}

	public void setRankIndex(Integer rankIndex) {
		this.rankIndex = rankIndex;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getStudyDayNum() {
		return studyDayNum;
	}

	public void setStudyDayNum(Integer studyDayNum) {
		this.studyDayNum = studyDayNum;
	}

	public Integer getStudyMinuteNum() {
		return studyMinuteNum;
	}

	public void setStudyMinuteNum(Integer studyMinuteNum) {
		this.studyMinuteNum = studyMinuteNum;
	}

	public String getStudyMinuteStr() {
		return studyMinuteStr;
	}

	public void setStudyMinuteStr(String studyMinuteStr) {
		this.studyMinuteStr = studyMinuteStr;
	}

	public Integer getChangeNum() {
		return changeNum;
	}

	public void setChangeNum(Integer changeNum) {
		this.changeNum = changeNum;
	}

	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

}
