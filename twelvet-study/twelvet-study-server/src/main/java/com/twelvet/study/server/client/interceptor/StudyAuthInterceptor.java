package com.twelvet.study.server.client.interceptor;

import com.dtflys.forest.http.ForestRequest;
import com.dtflys.forest.interceptor.ForestInterceptor;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.vo.StudyTokenBindingVO;
import com.twelvet.study.server.service.IStudyTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 小程序接口鉴权拦截器，统一注入 appid 与 token 请求头
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@Component
public class StudyAuthInterceptor implements ForestInterceptor {

	@Autowired
	private IStudyTokenService tokenService;

	@Override
	public boolean beforeExecute(ForestRequest request) {
		request.addHeader(StudyApiConstants.HEADER_APPID, StudyApiConstants.APPID);
		StudyTokenBindingVO binding = tokenService.getBinding();
		if (Objects.nonNull(binding)) {
			request.addHeader(StudyApiConstants.HEADER_TOKEN, binding.getToken());
		}
		return true;
	}

}
