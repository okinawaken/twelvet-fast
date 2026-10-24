package com.twelvet.study.api.enums;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室小程序令牌状态，对应绑定表 token_status 字段
 */
public enum StudyTokenStatusEnum {

	/**
	 * 有效，调用小程序接口时携带该令牌
	 */
	VALID(0, "有效"),

	/**
	 * 失效，需要重新绑定
	 */
	INVALID(1, "失效");

	private final Integer code;

	private final String description;

	StudyTokenStatusEnum(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

}
