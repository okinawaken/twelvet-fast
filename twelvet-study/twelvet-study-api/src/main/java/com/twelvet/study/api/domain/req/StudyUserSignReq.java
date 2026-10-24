package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 换座查询请求参数
 */
@Schema(description = "换座查询请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyUserSignReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 学习记录ID
	 */
	@Schema(description = "学习记录ID")
	private Long userSignId;

	public Long getUserSignId() {
		return userSignId;
	}

	public void setUserSignId(Long userSignId) {
		this.userSignId = userSignId;
	}

}
