package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 通用下拉选项
 */
@Schema(description = "通用下拉选项")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyOptionResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 选项ID
	 */
	@Schema(description = "选项ID")
	private Long id;

	/**
	 * 选项名称
	 */
	@Schema(description = "选项名称")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
