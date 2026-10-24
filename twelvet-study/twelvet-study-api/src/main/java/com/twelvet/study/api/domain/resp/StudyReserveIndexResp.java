package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 预约首页响应（门店列表、轮播图）
 */
@Schema(description = "预约首页响应（门店列表、轮播图）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyReserveIndexResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 是否展示区域筛选：true-是 false-否
	 */
	@Schema(description = "是否展示区域筛选：true-是 false-否")
	private String areaIdBtn;

	/**
	 * 是否展示渠道来源筛选：true-是 false-否
	 */
	@Schema(description = "是否展示渠道来源筛选：true-是 false-否")
	private String channelBiliBtn;

	/**
	 * 是否展示门店名称筛选：true-是 false-否
	 */
	@Schema(description = "是否展示门店名称筛选：true-是 false-否")
	private String venueNameBtn;

	/**
	 * 背景图
	 */
	@Schema(description = "背景图")
	private List<StudyBannerResp> backImgList;

	/**
	 * 轮播图
	 */
	@Schema(description = "轮播图")
	private List<StudyBannerResp> bannerImgList;

	/**
	 * 门店列表
	 */
	@Schema(description = "门店列表")
	private List<StudySeatVenueResp> venueList;

	public String getAreaIdBtn() {
		return areaIdBtn;
	}

	public void setAreaIdBtn(String areaIdBtn) {
		this.areaIdBtn = areaIdBtn;
	}

	public String getChannelBiliBtn() {
		return channelBiliBtn;
	}

	public void setChannelBiliBtn(String channelBiliBtn) {
		this.channelBiliBtn = channelBiliBtn;
	}

	public List<StudyBannerResp> getBackImgList() {
		return backImgList;
	}

	public void setBackImgList(List<StudyBannerResp> backImgList) {
		this.backImgList = backImgList;
	}

	public List<StudyBannerResp> getBannerImgList() {
		return bannerImgList;
	}

	public void setBannerImgList(List<StudyBannerResp> bannerImgList) {
		this.bannerImgList = bannerImgList;
	}

	public String getVenueNameBtn() {
		return venueNameBtn;
	}

	public void setVenueNameBtn(String venueNameBtn) {
		this.venueNameBtn = venueNameBtn;
	}

	public List<StudySeatVenueResp> getVenueList() {
		return venueList;
	}

	public void setVenueList(List<StudySeatVenueResp> venueList) {
		this.venueList = venueList;
	}

}
