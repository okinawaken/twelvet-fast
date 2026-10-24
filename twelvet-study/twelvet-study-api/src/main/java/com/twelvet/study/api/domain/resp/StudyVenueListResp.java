package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 门店列表响应
 */
@Schema(description = "门店列表响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyVenueListResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店列表
	 */
	@Schema(description = "门店列表")
	private List<StudyVenueItemResp> venueList;

	public List<StudyVenueItemResp> getVenueList() {
		return venueList;
	}

	public void setVenueList(List<StudyVenueItemResp> venueList) {
		this.venueList = venueList;
	}

}
