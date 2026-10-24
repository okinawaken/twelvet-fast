package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 未购买的套餐类型
 */
@Schema(description = "未购买的套餐类型")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyNotBuyPackageResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐名称
	 */
	@Schema(description = "套餐名称")
	private String packageName;

	/**
	 * 套餐简介
	 */
	@Schema(description = "套餐简介")
	private String packageIntroDesc;

	/**
	 * 套餐类型
	 */
	@Schema(description = "套餐类型")
	private Integer packageType;

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageIntroDesc() {
		return packageIntroDesc;
	}

	public void setPackageIntroDesc(String packageIntroDesc) {
		this.packageIntroDesc = packageIntroDesc;
	}

	public Integer getPackageType() {
		return packageType;
	}

	public void setPackageType(Integer packageType) {
		this.packageType = packageType;
	}

}
