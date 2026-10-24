package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 公告弹窗响应
 */
@Schema(description = "公告弹窗响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyNoticeResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 是否展示：0-否 1-是
	 */
	@Schema(description = "是否展示：0-否 1-是")
	private Integer showFlag;

	/**
	 * 公告标题
	 */
	@Schema(description = "公告标题")
	private String title;

	/**
	 * 公告内容
	 */
	@Schema(description = "公告内容")
	private String noticeMsg;

	/**
	 * 按钮文案
	 */
	@Schema(description = "按钮文案")
	private String buttonText;

	/**
	 * 门店名称，全局公告为「首页」
	 */
	@Schema(description = "门店名称，全局公告为「首页」")
	private String venueName;

	public Integer getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(Integer showFlag) {
		this.showFlag = showFlag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNoticeMsg() {
		return noticeMsg;
	}

	public void setNoticeMsg(String noticeMsg) {
		this.noticeMsg = noticeMsg;
	}

	public String getButtonText() {
		return buttonText;
	}

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

}
