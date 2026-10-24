package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 请假提交请求参数
 */
@Schema(description = "请假提交请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyLeaveConfirmReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 用户套餐ID
	 */
	@Schema(description = "用户套餐ID")
	private Long userPackageId;

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
	 * 请假原因
	 */
	@Schema(description = "请假原因")
	private String leaveReason;

	public Long getUserPackageId() {
		return userPackageId;
	}

	public void setUserPackageId(Long userPackageId) {
		this.userPackageId = userPackageId;
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

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

}
