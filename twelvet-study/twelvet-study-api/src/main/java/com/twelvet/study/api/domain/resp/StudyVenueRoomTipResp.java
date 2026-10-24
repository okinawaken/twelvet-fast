package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 门店房间介绍中的一条提示
 */
@Schema(description = "门店房间介绍中的一条提示")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyVenueRoomTipResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 是否可用：1-允许 其他-不允许（决定展示对号还是叉号图标）
	 */
	@Schema(description = "是否可用：1-允许 其他-不允许（决定展示对号还是叉号图标）")
	private Integer allowType;

	/**
	 * 提示文案
	 */
	@Schema(description = "提示文案")
	private String content;

	public Integer getAllowType() {
		return allowType;
	}

	public void setAllowType(Integer allowType) {
		this.allowType = allowType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
