package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 请假记录
 */
@Schema(description = "请假记录")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyLeaveRecordResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 请假记录ID
	 */
	@Schema(description = "请假记录ID")
	private Long id;

	/**
	 * 请假开始日期 yyyy-MM-dd
	 */
	@Schema(description = "请假开始日期 yyyy-MM-dd")
	private String leaveStartTimeStr;

	/**
	 * 请假结束日期 yyyy-MM-dd
	 */
	@Schema(description = "请假结束日期 yyyy-MM-dd")
	private String leaveEndTimeStr;

	/**
	 * 实际恢复日期（展示用，与结束日期可能不同）
	 */
	@Schema(description = "实际恢复日期（展示用，与结束日期可能不同）")
	private String leaveRealEndTimeStr;

	/**
	 * 请假天数描述
	 */
	@Schema(description = "请假天数描述")
	private String leaveDaysStr;

	/**
	 * 请假原因
	 */
	@Schema(description = "请假原因")
	private String leaveReason;

	/**
	 * 申请时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "申请时间 yyyy-MM-dd HH:mm:ss")
	private String createTimeStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLeaveStartTimeStr() {
		return leaveStartTimeStr;
	}

	public void setLeaveStartTimeStr(String leaveStartTimeStr) {
		this.leaveStartTimeStr = leaveStartTimeStr;
	}

	public String getLeaveEndTimeStr() {
		return leaveEndTimeStr;
	}

	public void setLeaveEndTimeStr(String leaveEndTimeStr) {
		this.leaveEndTimeStr = leaveEndTimeStr;
	}

	public String getLeaveRealEndTimeStr() {
		return leaveRealEndTimeStr;
	}

	public void setLeaveRealEndTimeStr(String leaveRealEndTimeStr) {
		this.leaveRealEndTimeStr = leaveRealEndTimeStr;
	}

	public String getLeaveDaysStr() {
		return leaveDaysStr;
	}

	public void setLeaveDaysStr(String leaveDaysStr) {
		this.leaveDaysStr = leaveDaysStr;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

}
