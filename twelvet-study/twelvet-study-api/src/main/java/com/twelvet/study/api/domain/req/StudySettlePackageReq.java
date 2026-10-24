package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 结算套餐查询请求参数
 */
@Schema(description = "结算套餐查询请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudySettlePackageReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 学习记录ID
	 */
	@Schema(description = "学习记录ID")
	private Long userSignId;

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public Long getUserSignId() {
		return userSignId;
	}

	public void setUserSignId(Long userSignId) {
		this.userSignId = userSignId;
	}

}
