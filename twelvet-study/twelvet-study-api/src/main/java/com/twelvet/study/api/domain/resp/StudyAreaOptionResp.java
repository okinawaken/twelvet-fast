package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 区域选项
 */
@Schema(description = "区域选项")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyAreaOptionResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 区域ID
	 */
	@Schema(description = "区域ID")
	private Long id;

	/**
	 * 区域名称
	 */
	@Schema(description = "区域名称")
	private String areaName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}
