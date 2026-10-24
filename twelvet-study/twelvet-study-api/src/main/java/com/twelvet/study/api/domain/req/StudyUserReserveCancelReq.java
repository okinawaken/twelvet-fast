package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 取消预约请求参数
 */
@Schema(description = "取消预约请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyUserReserveCancelReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 预约记录ID
	 */
	@Schema(description = "预约记录ID")
	private Long userReserveId;

	public Long getUserReserveId() {
		return userReserveId;
	}

	public void setUserReserveId(Long userReserveId) {
		this.userReserveId = userReserveId;
	}

}
