package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 学习排行榜查询请求参数
 */
@Schema(description = "学习排行榜查询请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyRankQueryReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 排行榜类型：week-周榜 month-月榜 all-总榜
	 */
	@Schema(description = "排行榜类型：week-周榜 month-月榜 all-总榜")
	private String rankType;

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public String getRankType() {
		return rankType;
	}

	public void setRankType(String rankType) {
		this.rankType = rankType;
	}

}
