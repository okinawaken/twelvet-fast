package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.DataFile;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.PostRequest;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.req.StudyBindMobileReq;
import com.twelvet.study.api.domain.req.StudyHeadImgReq;
import com.twelvet.study.api.domain.req.StudyWechatCodeReq;
import com.twelvet.study.api.domain.resp.StudyLoginResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;
import org.springframework.web.multipart.MultipartFile;

/**
 * 时不我待小程序 - 登录授权接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyAuthClient {

	/**
	 * 微信登录，成功后返回 token
	 * @param dto 微信登录凭证
	 * @return token、绑定手机号状态
	 */
	@PostRequest(url = "/mp/user/login")
	StudyApiResult<StudyLoginResp> login(@JSONBody StudyWechatCodeReq dto);

	/**
	 * 授权手机号并登录
	 * @param dto 微信登录凭证 + 手机号加密数据
	 * @return 登录信息
	 */
	@PostRequest(url = "/mp/user/authorize/bindMobile")
	StudyApiResult<StudyLoginResp> bindMobile(@JSONBody StudyBindMobileReq dto);

	/**
	 * 刷新 sessionKey
	 * @param dto 微信登录凭证
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/user/refresh/sessionKey")
	StudyApiResult<Void> refreshSessionKey(@JSONBody StudyWechatCodeReq dto);

	/**
	 * 保存微信头像昵称
	 * @param dto 昵称与头像地址
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/user/authorize/headImg")
	StudyApiResult<Void> authorizeHeadImg(@JSONBody StudyHeadImgReq dto);

	/**
	 * 上传微信头像
	 * @param file 头像文件，表单字段名 files
	 * @return 上传后的头像地址
	 */
	@PostRequest(url = "/mp/user/authorize/headImg/upload", contentType = "multipart/form-data")
	StudyApiResult<String> uploadHeadImg(@DataFile("files") MultipartFile file);

	/**
	 * 注销账号
	 * @return 无业务数据
	 */
	@PostRequest(url = "/mp/user/authorize/cancel")
	StudyApiResult<Void> cancel();

}
