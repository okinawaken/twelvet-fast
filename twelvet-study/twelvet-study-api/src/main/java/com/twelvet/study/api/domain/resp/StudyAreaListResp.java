package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 预约区域列表响应
 */
@Schema(description = "预约区域列表响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyAreaListResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 区域列表
	 */
	@Schema(description = "区域列表")
	private List<StudyAreaOptionResp> areaList;

	public List<StudyAreaOptionResp> getAreaList() {
		return areaList;
	}

	public void setAreaList(List<StudyAreaOptionResp> areaList) {
		this.areaList = areaList;
	}

}
