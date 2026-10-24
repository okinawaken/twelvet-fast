package com.twelvet.study.api.exception;

import java.io.Serial;

/**
 * 自习室小程序接口调用异常
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
public class StudyApiException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 接口返回码
	 */
	private final String code;

	public StudyApiException(String code, String message) {
		super(message);
		this.code = code;
	}

	public StudyApiException(String message, Throwable cause) {
		super(message, cause);
		this.code = null;
	}

	public String getCode() {
		return code;
	}

}
