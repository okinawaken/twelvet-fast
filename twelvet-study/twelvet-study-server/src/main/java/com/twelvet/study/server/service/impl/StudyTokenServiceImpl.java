package com.twelvet.study.server.service.impl;

import com.twelvet.framework.security.domain.LoginUser;
import com.twelvet.framework.security.utils.SecurityUtils;
import com.twelvet.study.api.domain.StudyTokenBinding;
import com.twelvet.study.api.domain.vo.StudyTokenBindVO;
import com.twelvet.study.api.domain.vo.StudyTokenBindingVO;
import com.twelvet.study.server.client.StudyUserClient;
import com.twelvet.study.server.mapper.StudyTokenBindingMapper;
import com.twelvet.study.server.service.IStudyTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序令牌服务实现
 */
@Service
public class StudyTokenServiceImpl implements IStudyTokenService {

	@Autowired
	private StudyTokenBindingMapper bindingMapper;

	@Autowired
	private StudyUserClient studyUserClient;

	@Override
	public StudyTokenBindingVO bind(StudyTokenBindVO vo) {
		return null;
	}

	@Override
	public StudyTokenBindingVO getBinding() {
		LoginUser loginUser = SecurityUtils.getLoginUser();
		if (Objects.isNull(loginUser)){
			return null;
		}
		StudyTokenBinding binding = bindingMapper.selectBindingByUserId(loginUser.getUserId());
		if (Objects.isNull(binding)) {
			return null;
		}

		StudyTokenBindingVO vo = new StudyTokenBindingVO();
		vo.setUserId(binding.getUserId());
		vo.setToken(binding.getAccessToken());
		vo.setTokenStatus(binding.getTokenStatus());
		vo.setBindTime(binding.getCreateTime());
		vo.setUpdateTime(binding.getUpdateTime());
		return vo;
	}

	@Override
	public StudyTokenBindingVO verify() {
		return null;
	}

	@Override
	public void unbind() {

	}

}
