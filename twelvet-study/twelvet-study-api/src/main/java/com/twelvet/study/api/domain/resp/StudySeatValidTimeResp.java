package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 座位可预约时段
 */
@Schema(description = "座位可预约时段")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySeatValidTimeResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 可预约开始时刻 HH:mm
	 */
	@Schema(description = "可预约开始时刻 HH:mm")
	private String validStartTimeStr;

	/**
	 * 可预约结束时刻 HH:mm
	 */
	@Schema(description = "可预约结束时刻 HH:mm")
	private String validEndTimeStr;

	/**
	 * 可预约时段 HH:mm-HH:mm，无可用时段时为空串
	 */
	@Schema(description = "可预约时段 HH:mm-HH:mm，无可用时段时为空串")
	private String validTimeStr;

	/**
	 * 可预约时长描述
	 */
	@Schema(description = "可预约时长描述")
	private String validMinuteStr;

	public String getValidStartTimeStr() {
		return validStartTimeStr;
	}

	public void setValidStartTimeStr(String validStartTimeStr) {
		this.validStartTimeStr = validStartTimeStr;
	}

	public String getValidEndTimeStr() {
		return validEndTimeStr;
	}

	public void setValidEndTimeStr(String validEndTimeStr) {
		this.validEndTimeStr = validEndTimeStr;
	}

	public String getValidTimeStr() {
		return validTimeStr;
	}

	public void setValidTimeStr(String validTimeStr) {
		this.validTimeStr = validTimeStr;
	}

	public String getValidMinuteStr() {
		return validMinuteStr;
	}

	public void setValidMinuteStr(String validMinuteStr) {
		this.validMinuteStr = validMinuteStr;
	}

}
