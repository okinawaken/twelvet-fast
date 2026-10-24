package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 取消预约提示响应
 */
@Schema(description = "取消预约提示响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyCancelTipResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 取消提示文案
	 */
	@Schema(description = "取消提示文案")
	private String tipDesc;

	public String getTipDesc() {
		return tipDesc;
	}

	public void setTipDesc(String tipDesc) {
		this.tipDesc = tipDesc;
	}

}
