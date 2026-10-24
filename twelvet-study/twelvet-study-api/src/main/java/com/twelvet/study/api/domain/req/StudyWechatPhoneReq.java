package com.twelvet.study.api.domain.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: wx.getPhoneNumber 返回的加密数据
 * <p>
 * 新版客户端只返回 code，旧版返回 encryptedData + iv，按实际取到的值原样透传给服务端。
 */
@Schema(description = "wx.getPhoneNumber 返回的加密数据")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudyWechatPhoneReq implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 手机号获取凭证（新版客户端）
	 */
	@Schema(description = "手机号获取凭证（新版客户端）")
	private String code;

	/**
	 * 加密的手机号数据（旧版客户端）
	 */
	@Schema(description = "加密的手机号数据（旧版客户端）")
	private String encryptedData;

	/**
	 * 加密算法的初始向量（旧版客户端）
	 */
	@Schema(description = "加密算法的初始向量（旧版客户端）")
	private String iv;

	/**
	 * 错误信息，成功时为 ok
	 */
	@Schema(description = "错误信息，成功时为 ok")
	@JsonProperty("errMsg")
	private String errMsg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEncryptedData() {
		return encryptedData;
	}

	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}

	public String getIv() {
		return iv;
	}

	public void setIv(String iv) {
		this.iv = iv;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
