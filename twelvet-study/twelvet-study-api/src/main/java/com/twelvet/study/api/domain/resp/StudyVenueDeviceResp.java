package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 门店详情地图上的设备图标
 */
@Schema(description = "门店详情地图上的设备图标")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyVenueDeviceResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 图标图片地址
	 */
	@Schema(description = "图标图片地址")
	private String icon;

	/**
	 * 图标文案
	 */
	@Schema(description = "图标文案")
	private String title;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
