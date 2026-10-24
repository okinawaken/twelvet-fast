package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.req.StudyBindMobileReq;
import com.twelvet.study.api.domain.req.StudyHeadImgReq;
import com.twelvet.study.api.domain.req.StudyWechatCodeReq;
import com.twelvet.study.api.domain.resp.StudyLoginResp;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序登录授权服务
 */
public interface IStudyAuthService {

	/**
	 * 微信登录
	 * @param dto 微信登录凭证
	 * @return 登录信息
	 */
	StudyLoginResp login(StudyWechatCodeReq dto);

	/**
	 * 授权手机号并登录
	 * @param dto 凭证与手机号加密数据
	 * @return 登录信息
	 */
	StudyLoginResp bindMobile(StudyBindMobileReq dto);

	/**
	 * 刷新 sessionKey
	 * @param dto 微信登录凭证
	 */
	void refreshSessionKey(StudyWechatCodeReq dto);

	/**
	 * 保存微信头像昵称
	 * @param dto 昵称与头像地址
	 */
	void authorizeHeadImg(StudyHeadImgReq dto);

	/**
	 * 上传微信头像
	 * @param file 头像文件
	 * @return 头像地址
	 */
	String uploadHeadImg(MultipartFile file);

	/**
	 * 注销账号
	 */
	void cancel();

}
