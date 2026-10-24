package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 取消请假请求参数
 */
@Schema(description = "取消请假请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyUserLeaveCancelReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 请假记录ID
	 */
	@Schema(description = "请假记录ID")
	private Long userLeaveId;

	public Long getUserLeaveId() {
		return userLeaveId;
	}

	public void setUserLeaveId(Long userLeaveId) {
		this.userLeaveId = userLeaveId;
	}

}
