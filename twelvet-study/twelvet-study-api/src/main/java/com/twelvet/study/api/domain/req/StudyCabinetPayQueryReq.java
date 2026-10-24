package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 柜子续租支付参数
 */
@Schema(description = "柜子续租支付参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyCabinetPayQueryReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 租用记录ID
	 */
	@Schema(description = "租用记录ID")
	private Long leaseId;

	/**
	 * wx.login 返回的 code
	 */
	@Schema(description = "wx.login 返回的 code")
	private String userCode;

	public Long getLeaseId() {
		return leaseId;
	}

	public void setLeaseId(Long leaseId) {
		this.leaseId = leaseId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

}
