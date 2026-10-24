package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 报修提交请求参数
 */
@Schema(description = "报修提交请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyRepairSubmitReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 报修描述
	 */
	@Schema(description = "报修描述")
	private String repairDesc;

	/**
	 * 报修图片地址集合
	 */
	@Schema(description = "报修图片地址集合")
	private List<String> repairImgList;

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public String getRepairDesc() {
		return repairDesc;
	}

	public void setRepairDesc(String repairDesc) {
		this.repairDesc = repairDesc;
	}

	public List<String> getRepairImgList() {
		return repairImgList;
	}

	public void setRepairImgList(List<String> repairImgList) {
		this.repairImgList = repairImgList;
	}

}
