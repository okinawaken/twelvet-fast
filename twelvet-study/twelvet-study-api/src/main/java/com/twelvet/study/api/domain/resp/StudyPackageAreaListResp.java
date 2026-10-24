package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐列表响应（旧版，按区域分组）
 */
@Schema(description = "套餐列表响应（旧版，按区域分组）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyPackageAreaListResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 区域套餐列表
	 */
	@Schema(description = "区域套餐列表")
	private List<StudyPackageAreaResp> venueAreaList;

	public List<StudyPackageAreaResp> getVenueAreaList() {
		return venueAreaList;
	}

	public void setVenueAreaList(List<StudyPackageAreaResp> venueAreaList) {
		this.venueAreaList = venueAreaList;
	}

}
