package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 签退离座请求参数
 */
@Schema(description = "签退离座请求参数")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudySignOutReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店二维码内容，无需扫码时传空串
	 */
	@Schema(description = "门店二维码内容，无需扫码时传空串")
	private String qrCode;

	/**
	 * 当前经度
	 */
	@Schema(description = "当前经度")
	private BigDecimal currentLng;

	/**
	 * 当前纬度
	 */
	@Schema(description = "当前纬度")
	private BigDecimal currentLat;

	/**
	 * 结算使用的用户套餐ID
	 */
	@Schema(description = "结算使用的用户套餐ID")
	private Long settleUserPackageId;

	/**
	 * 学习记录ID
	 */
	@Schema(description = "学习记录ID")
	private Long userSignId;

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public BigDecimal getCurrentLng() {
		return currentLng;
	}

	public void setCurrentLng(BigDecimal currentLng) {
		this.currentLng = currentLng;
	}

	public BigDecimal getCurrentLat() {
		return currentLat;
	}

	public void setCurrentLat(BigDecimal currentLat) {
		this.currentLat = currentLat;
	}

	public Long getSettleUserPackageId() {
		return settleUserPackageId;
	}

	public void setSettleUserPackageId(Long settleUserPackageId) {
		this.settleUserPackageId = settleUserPackageId;
	}

	public Long getUserSignId() {
		return userSignId;
	}

	public void setUserSignId(Long userSignId) {
		this.userSignId = userSignId;
	}

}
