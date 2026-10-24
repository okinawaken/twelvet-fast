package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 可预约日期响应
 */
@Schema(description = "可预约日期响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyReserveDateResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 可预约日期集合 yyyy-MM-dd
	 */
	@Schema(description = "可预约日期集合 yyyy-MM-dd")
	private List<String> reserveDateList;

	public List<String> getReserveDateList() {
		return reserveDateList;
	}

	public void setReserveDateList(List<String> reserveDateList) {
		this.reserveDateList = reserveDateList;
	}

}
