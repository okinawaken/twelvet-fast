package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 座位类型筛选响应
 */
@Schema(description = "座位类型筛选响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySeatAreaListResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 座位类型列表
	 */
	@Schema(description = "座位类型列表")
	private List<StudyOptionResp> seatAreaList;

	/**
	 * 套餐标签列表
	 */
	@Schema(description = "套餐标签列表")
	private List<StudyOptionResp> packageLabelList;

	public List<StudyOptionResp> getSeatAreaList() {
		return seatAreaList;
	}

	public void setSeatAreaList(List<StudyOptionResp> seatAreaList) {
		this.seatAreaList = seatAreaList;
	}

	public List<StudyOptionResp> getPackageLabelList() {
		return packageLabelList;
	}

	public void setPackageLabelList(List<StudyOptionResp> packageLabelList) {
		this.packageLabelList = packageLabelList;
	}

}
