package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 我的套餐响应
 */
@Schema(description = "我的套餐响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyUserPackageListResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 已购买的套餐
	 */
	@Schema(description = "已购买的套餐")
	private List<StudyUserPackageResp> list;

	/**
	 * 未购买的套餐类型
	 */
	@Schema(description = "未购买的套餐类型")
	private List<StudyNotBuyPackageResp> notBuyList;

	public List<StudyUserPackageResp> getList() {
		return list;
	}

	public void setList(List<StudyUserPackageResp> list) {
		this.list = list;
	}

	public List<StudyNotBuyPackageResp> getNotBuyList() {
		return notBuyList;
	}

	public void setNotBuyList(List<StudyNotBuyPackageResp> notBuyList) {
		this.notBuyList = notBuyList;
	}

}
