package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 微信支付参数
 */
@Schema(description = "微信支付参数")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyPayResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 时间戳
	 */
	@Schema(description = "时间戳")
	private String timeStamp;

	/**
	 * 随机字符串
	 */
	@Schema(description = "随机字符串")
	private String nonceStr;

	/**
	 * prepay_id，对应 wx.requestPayment 的 package
	 */
	@Schema(description = "prepay_id，对应 wx.requestPayment 的 package")
	private String packageValue;

	/**
	 * 签名类型
	 */
	@Schema(description = "签名类型")
	private String signType;

	/**
	 * 支付签名
	 */
	@Schema(description = "支付签名")
	private String paySign;

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getPackageValue() {
		return packageValue;
	}

	public void setPackageValue(String packageValue) {
		this.packageValue = packageValue;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getPaySign() {
		return paySign;
	}

	public void setPaySign(String paySign) {
		this.paySign = paySign;
	}

}
