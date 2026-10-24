package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐区域
 */
@Schema(description = "套餐区域")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyPackageAreaResp implements Serializable {

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

	/**
	 * 区域图片
	 */
	@Schema(description = "区域图片")
	private String areaImgUrl;

	/**
	 * 区域下的套餐列表
	 */
	@Schema(description = "区域下的套餐列表")
	private List<StudyPackageResp> packageList;

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

	public String getAreaImgUrl() {
		return areaImgUrl;
	}

	public void setAreaImgUrl(String areaImgUrl) {
		this.areaImgUrl = areaImgUrl;
	}

	public List<StudyPackageResp> getPackageList() {
		return packageList;
	}

	public void setPackageList(List<StudyPackageResp> packageList) {
		this.packageList = packageList;
	}

}
