package com.twelvet.study.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.twelvet.study.api.constant.StudyApiCodeConstants;
import com.twelvet.study.api.exception.StudyApiException;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 时不我待小程序统一响应结构 <pre>
 *               {
 *                 "code": "200",
 *                 "content": "",
 *                 "data": {},
 *                 "subData": null
 *               }
 *               </pre>
 */
@Schema(description = "时不我待小程序统一响应结构")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyApiResult<T> implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 返回码：200-成功 401-未登录 SV0001-业务异常 SV99999-系统异常
	 */
	@Schema(description = "返回码：200-成功 401-未登录 SV0001-业务异常 SV99999-系统异常")
	private String code;

	/**
	 * 提示文案，成功时通常为空
	 */
	@Schema(description = "提示文案，成功时通常为空")
	private String content;

	/**
	 * 业务数据
	 */
	@Schema(description = "业务数据")
	private T data;

	/**
	 * 附加数据，目前恒为 null
	 */
	@Schema(description = "附加数据，目前恒为 null")
	private Object subData;

	/**
	 * 是否业务成功
	 * @return true 表示 code 为 200
	 */
	public boolean isSuccess() {
		return StudyApiCodeConstants.CODE_SUCCESS.equals(code);
	}

	/**
	 * 是否未登录 / 令牌失效
	 * @return true 表示需要重新登录
	 */
	public boolean isUnauthorized() {
		return StudyApiCodeConstants.CODE_UNAUTHORIZED.equals(code);
	}

	/**
	 * 获取业务数据，非成功状态直接抛出异常
	 * @return 业务数据
	 */
	public T getDataOrThrow() {
		if (!isSuccess()) {
			throw new StudyApiException(code, content);
		}
		return data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Object getSubData() {
		return subData;
	}

	public void setSubData(Object subData) {
		this.subData = subData;
	}

	@Override
	public String toString() {
		return "StudyApiResult{" + "code='" + code + '\'' + ", content='" + content + '\'' + ", data=" + data
				+ ", subData=" + subData + '}';
	}

}
