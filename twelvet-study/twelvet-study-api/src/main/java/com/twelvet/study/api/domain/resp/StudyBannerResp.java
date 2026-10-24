package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 轮播图 / 背景图
 */
@Schema(description = "轮播图 / 背景图")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyBannerResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 文件标识
	 */
	@Schema(description = "文件标识")
	private String fileKey;

	/**
	 * 图片地址
	 */
	@Schema(description = "图片地址")
	private String fileUrl;

	/**
	 * 跳转方式：0-无跳转 1-网页
	 */
	@Schema(description = "跳转方式：0-无跳转 1-网页")
	private Integer linkHtmlType;

	/**
	 * 跳转地址
	 */
	@Schema(description = "跳转地址")
	private String linkHtmlUrl;

	public String getFileKey() {
		return fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Integer getLinkHtmlType() {
		return linkHtmlType;
	}

	public void setLinkHtmlType(Integer linkHtmlType) {
		this.linkHtmlType = linkHtmlType;
	}

	public String getLinkHtmlUrl() {
		return linkHtmlUrl;
	}

	public void setLinkHtmlUrl(String linkHtmlUrl) {
		this.linkHtmlUrl = linkHtmlUrl;
	}

}
