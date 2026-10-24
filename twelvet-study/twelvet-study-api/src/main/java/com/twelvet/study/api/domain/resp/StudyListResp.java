package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 通用列表响应（data 为 { "list": [...] } 的接口）
 * @param <T> 列表元素类型
 */
@Schema(description = "通用列表响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyListResp<T> implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 列表数据
	 */
	@Schema(description = "列表数据")
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
