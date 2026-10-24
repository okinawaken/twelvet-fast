package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 门店房间介绍
 */
@Schema(description = "门店房间介绍")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyVenueRoomResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 房间名称
	 */
	@Schema(description = "房间名称")
	private String title;

	/**
	 * 房间图片地址
	 */
	@Schema(description = "房间图片地址")
	private String imagePath;

	/**
	 * 房间提示列表
	 */
	@Schema(description = "房间提示列表")
	private List<StudyVenueRoomTipResp> areaTipsList;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public List<StudyVenueRoomTipResp> getAreaTipsList() {
		return areaTipsList;
	}

	public void setAreaTipsList(List<StudyVenueRoomTipResp> areaTipsList) {
		this.areaTipsList = areaTipsList;
	}

}
