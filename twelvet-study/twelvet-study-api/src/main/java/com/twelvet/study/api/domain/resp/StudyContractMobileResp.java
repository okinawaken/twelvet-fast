package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 客服联系电话
 */
@Schema(description = "客服联系电话")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyContractMobileResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 电话说明
	 */
	@Schema(description = "电话说明")
	private String contractDesc;

	/**
	 * 联系电话
	 */
	@Schema(description = "联系电话")
	private String contractMobile;

	public String getContractDesc() {
		return contractDesc;
	}

	public void setContractDesc(String contractDesc) {
		this.contractDesc = contractDesc;
	}

	public String getContractMobile() {
		return contractMobile;
	}

	public void setContractMobile(String contractMobile) {
		this.contractMobile = contractMobile;
	}

}
