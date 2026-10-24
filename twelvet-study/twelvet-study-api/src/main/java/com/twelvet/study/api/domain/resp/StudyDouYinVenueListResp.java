package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 抖音核销门店列表响应
 */
@Schema(description = "抖音核销门店列表响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyDouYinVenueListResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店列表
	 */
	@Schema(description = "门店列表")
	private List<StudyDouYinVenueResp> venueList;

	public List<StudyDouYinVenueResp> getVenueList() {
		return venueList;
	}

	public void setVenueList(List<StudyDouYinVenueResp> venueList) {
		this.venueList = venueList;
	}

}
