package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 扫码签到查询座位请求参数
 */
@Schema(description = "扫码签到查询座位请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudySignSeatQueryReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店二维码内容，无需扫码时传空串
	 */
	@Schema(description = "门店二维码内容，无需扫码时传空串")
	private String qrCode;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 签到使用的用户套餐ID
	 */
	@Schema(description = "签到使用的用户套餐ID")
	private Long signInUserPackageId;

	/**
	 * 是否为他人签到：0-否 1-是
	 */
	@Schema(description = "是否为他人签到：0-否 1-是")
	private Integer signAnotherFlag;

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public Long getSignInUserPackageId() {
		return signInUserPackageId;
	}

	public void setSignInUserPackageId(Long signInUserPackageId) {
		this.signInUserPackageId = signInUserPackageId;
	}

	public Integer getSignAnotherFlag() {
		return signAnotherFlag;
	}

	public void setSignAnotherFlag(Integer signAnotherFlag) {
		this.signAnotherFlag = signAnotherFlag;
	}

}
