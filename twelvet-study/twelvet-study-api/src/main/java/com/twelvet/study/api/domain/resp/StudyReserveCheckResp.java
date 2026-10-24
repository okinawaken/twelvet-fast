package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 预约前置校验响应
 */
@Schema(description = "预约前置校验响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyReserveCheckResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 预约状态：0-可预约 1-不可预约 2-需购买套餐
	 */
	@Schema(description = "预约状态：0-可预约 1-不可预约 2-需购买套餐")
	private Integer reserveState;

	/**
	 * 状态提示文案
	 */
	@Schema(description = "状态提示文案")
	private String reserveStateMsg;

	/**
	 * 可用于预约的用户套餐列表
	 */
	@Schema(description = "可用于预约的用户套餐列表")
	private List<StudyUserPackageEntityResp> canReservePackageList;

	public Integer getReserveState() {
		return reserveState;
	}

	public void setReserveState(Integer reserveState) {
		this.reserveState = reserveState;
	}

	public String getReserveStateMsg() {
		return reserveStateMsg;
	}

	public void setReserveStateMsg(String reserveStateMsg) {
		this.reserveStateMsg = reserveStateMsg;
	}

	public List<StudyUserPackageEntityResp> getCanReservePackageList() {
		return canReservePackageList;
	}

	public void setCanReservePackageList(List<StudyUserPackageEntityResp> canReservePackageList) {
		this.canReservePackageList = canReservePackageList;
	}

}
