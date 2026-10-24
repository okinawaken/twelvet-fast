package com.twelvet.study.server.handler;

import cn.dev33.satoken.exception.NotPermissionException;
import com.dtflys.forest.exceptions.ForestNetworkException;
import com.dtflys.forest.exceptions.ForestRuntimeException;
import com.twelvet.framework.core.application.domain.JsonResult;
import com.twelvet.study.api.constant.StudyApiCodeConstants;
import com.twelvet.study.api.exception.StudyApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 自习室模块异常处理，只作用于 com.twelvet.study 下的控制器
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice(basePackages = "com.twelvet.study")
public class StudyExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(StudyExceptionHandler.class);

	/**
	 * 小程序接口业务异常
	 * @param e 异常
	 * @return 统一结果
	 */
	@ExceptionHandler(StudyApiException.class)
	public JsonResult<String> handleStudyApi(StudyApiException e) {
		String message = StringUtils.hasText(e.getMessage()) ? e.getMessage() : "自习室服务处理失败";
		if (StudyApiCodeConstants.CODE_UNAUTHORIZED.equals(e.getCode())) {
			return JsonResult.error(HttpStatus.UNAUTHORIZED.value(), message);
		}
		log.warn("自习室接口业务异常, code={}, message={}", e.getCode(), message);
		return JsonResult.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
	}

	/**
	 * 无操作权限
	 * @param e 异常
	 * @return 统一结果
	 */
	@ExceptionHandler(NotPermissionException.class)
	public JsonResult<String> handleNotPermission(NotPermissionException e) {
		log.warn("无自习室操作权限: {}", e.getPermission());
		return JsonResult.error(HttpStatus.FORBIDDEN.value(), "没有该操作权限，请联系管理员授权");
	}

	/**
	 * 小程序接口网络异常
	 * @param e 异常
	 * @return 统一结果
	 */
	@ExceptionHandler(ForestNetworkException.class)
	public JsonResult<String> handleForestNetwork(ForestNetworkException e) {
		log.error("自习室接口网络异常", e);
		return JsonResult.error(HttpStatus.SERVICE_UNAVAILABLE.value(), "自习室服务连接失败，请稍后重试");
	}

	/**
	 * 小程序接口调用异常
	 * @param e 异常
	 * @return 统一结果
	 */
	@ExceptionHandler(ForestRuntimeException.class)
	public JsonResult<String> handleForest(ForestRuntimeException e) {
		log.error("自习室接口调用异常", e);
		return JsonResult.error(HttpStatus.BAD_GATEWAY.value(), "自习室接口调用异常");
	}

}
