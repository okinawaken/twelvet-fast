package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐列表查询请求参数（v2）
 */
@Schema(description = "套餐列表查询请求参数（v2）")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyPackageQueryReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐类型ID
	 */
	@Schema(description = "套餐类型ID")
	private Integer packageType;

	/**
	 * 套餐标签ID集合
	 */
	@Schema(description = "套餐标签ID集合")
	private List<Long> packageLabelIds;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 座位区域ID
	 */
	@Schema(description = "座位区域ID")
	private Long seatAreaId;

	public Integer getPackageType() {
		return packageType;
	}

	public void setPackageType(Integer packageType) {
		this.packageType = packageType;
	}

	public List<Long> getPackageLabelIds() {
		return packageLabelIds;
	}

	public void setPackageLabelIds(List<Long> packageLabelIds) {
		this.packageLabelIds = packageLabelIds;
	}

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public Long getSeatAreaId() {
		return seatAreaId;
	}

	public void setSeatAreaId(Long seatAreaId) {
		this.seatAreaId = seatAreaId;
	}

}
