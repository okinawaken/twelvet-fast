package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 进入请假页数据
 */
@Schema(description = "进入请假页数据")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyEnterLeaveResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户套餐ID
	 */
	@Schema(description = "用户套餐ID")
	private Long userPackageId;

	/**
	 * 今日学习状态：0-未学习 1-已学习
	 */
	@Schema(description = "今日学习状态：0-未学习 1-已学习")
	private Integer todayStudyState;

	/**
	 * 剩余可请假天数
	 */
	@Schema(description = "剩余可请假天数")
	private Integer leftLeaveDays;

	/**
	 * 是否可请假：0-否 1-是
	 */
	@Schema(description = "是否可请假：0-否 1-是")
	private Integer canLeaveState;

	/**
	 * 不可请假的原因
	 */
	@Schema(description = "不可请假的原因")
	private String canNotLeaveMsg;

	/**
	 * 请假历史
	 */
	@Schema(description = "请假历史")
	private List<StudyLeaveRecordResp> leaveList;

	public Long getUserPackageId() {
		return userPackageId;
	}

	public void setUserPackageId(Long userPackageId) {
		this.userPackageId = userPackageId;
	}

	public Integer getTodayStudyState() {
		return todayStudyState;
	}

	public void setTodayStudyState(Integer todayStudyState) {
		this.todayStudyState = todayStudyState;
	}

	public Integer getLeftLeaveDays() {
		return leftLeaveDays;
	}

	public void setLeftLeaveDays(Integer leftLeaveDays) {
		this.leftLeaveDays = leftLeaveDays;
	}

	public Integer getCanLeaveState() {
		return canLeaveState;
	}

	public void setCanLeaveState(Integer canLeaveState) {
		this.canLeaveState = canLeaveState;
	}

	public String getCanNotLeaveMsg() {
		return canNotLeaveMsg;
	}

	public void setCanNotLeaveMsg(String canNotLeaveMsg) {
		this.canNotLeaveMsg = canNotLeaveMsg;
	}

	public List<StudyLeaveRecordResp> getLeaveList() {
		return leaveList;
	}

	public void setLeaveList(List<StudyLeaveRecordResp> leaveList) {
		this.leaveList = leaveList;
	}

}
