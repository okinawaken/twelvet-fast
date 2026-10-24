package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.vo.StudyTokenBindVO;
import com.twelvet.study.api.domain.vo.StudyTokenBindingVO;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序令牌服务，统一维护令牌读取与后台用户绑定
 */
public interface IStudyTokenService {

	/**
	 * 校验并绑定小程序令牌
	 * @param vo 绑定请求
	 * @return 绑定信息（令牌已脱敏）
	 */
	StudyTokenBindingVO bind(StudyTokenBindVO vo);

	/**
	 * 查询当前后台用户的绑定信息
	 * @return 绑定信息，未绑定时返回 null
	 */
	StudyTokenBindingVO getBinding();

	/**
	 * 使用当前绑定的令牌重新校验有效性
	 * @return 绑定信息
	 */
	StudyTokenBindingVO verify();

	/**
	 * 解绑当前后台用户的小程序令牌
	 */
	void unbind();

}
