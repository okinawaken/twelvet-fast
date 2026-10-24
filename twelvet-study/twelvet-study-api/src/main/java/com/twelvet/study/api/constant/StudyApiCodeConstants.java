package com.twelvet.study.api.constant;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 时不我待自习室小程序响应码常量
 */
public class StudyApiCodeConstants {

	/**
	 * 业务成功
	 */
	public static final String CODE_SUCCESS = "200";

	/**
	 * 未登录 / 令牌失效
	 */
	public static final String CODE_UNAUTHORIZED = "401";

	/**
	 * 业务校验失败（参数不合法、座位不可用等），content 为可直接展示的提示文案
	 */
	public static final String CODE_PARAM_ERROR = "SV00000";

	/**
	 * 业务异常，content 为提示文案
	 */
	public static final String CODE_BIZ_ERROR = "SV0001";

	/**
	 * 系统异常，content 为提示文案（小程序据此弹出「账号异常」提示）
	 */
	public static final String CODE_SYSTEM_ERROR = "SV99999";

}
