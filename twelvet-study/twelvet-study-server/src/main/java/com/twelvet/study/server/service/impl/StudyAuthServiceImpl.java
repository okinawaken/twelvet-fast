package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.req.StudyBindMobileReq;
import com.twelvet.study.api.domain.req.StudyHeadImgReq;
import com.twelvet.study.api.domain.req.StudyWechatCodeReq;
import com.twelvet.study.api.domain.resp.StudyLoginResp;
import com.twelvet.study.server.client.StudyAuthClient;
import com.twelvet.study.server.service.IStudyAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序登录授权服务实现
 *
 * <p>
 * 认证直接调用小程序原接口完成：登录、绑定手机号、刷新 sessionKey 本身不需要令牌， 请求头 appid
 * 与已绑定的令牌由拦截器统一注入。原接口返回的令牌随结果原样透传给调用方， 服务端不保存，需要调用其它接口时仍通过「绑定令牌」让该令牌生效。
 */
@Service
@Deprecated
public class StudyAuthServiceImpl implements IStudyAuthService {

	@Autowired
	private StudyAuthClient authClient;

	@Override
	public StudyLoginResp login(StudyWechatCodeReq dto) {
		return authClient.login(dto).getDataOrThrow();
	}

	@Override
	public StudyLoginResp bindMobile(StudyBindMobileReq dto) {
		return authClient.bindMobile(dto).getDataOrThrow();
	}

	@Override
	public void refreshSessionKey(StudyWechatCodeReq dto) {
		authClient.refreshSessionKey(dto).getDataOrThrow();
	}

	@Override
	public void authorizeHeadImg(StudyHeadImgReq dto) {
		authClient.authorizeHeadImg(dto).getDataOrThrow();
	}

	@Override
	public String uploadHeadImg(MultipartFile file) {
		return authClient.uploadHeadImg(file).getDataOrThrow();
	}

	@Override
	public void cancel() {
		authClient.cancel().getDataOrThrow();
	}

}
