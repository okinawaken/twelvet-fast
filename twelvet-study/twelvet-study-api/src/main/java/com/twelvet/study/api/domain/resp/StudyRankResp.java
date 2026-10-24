package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 学习排行榜
 */
@Schema(description = "学习排行榜")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyRankResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 榜单数据
	 */
	@Schema(description = "榜单数据")
	private List<StudyRankUserResp> rankUserList;

	public List<StudyRankUserResp> getRankUserList() {
		return rankUserList;
	}

	public void setRankUserList(List<StudyRankUserResp> rankUserList) {
		this.rankUserList = rankUserList;
	}

}
