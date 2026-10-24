package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐列表响应（v2）
 */
@Schema(description = "套餐列表响应（v2）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyPackageListResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐列表
	 */
	@Schema(description = "套餐列表")
	private List<StudyPackageResp> packageList;

	public List<StudyPackageResp> getPackageList() {
		return packageList;
	}

	public void setPackageList(List<StudyPackageResp> packageList) {
		this.packageList = packageList;
	}

}
