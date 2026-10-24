package com.twelvet.study.server.service.impl;

import com.twelvet.study.api.domain.resp.StudyConfigResp;
import com.twelvet.study.server.client.StudyCommonClient;
import com.twelvet.study.server.service.IStudyCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序公共接口服务实现
 */
@Service
public class StudyCommonServiceImpl implements IStudyCommonService {

	@Autowired
	private StudyCommonClient commonClient;

	@Override
	public StudyConfigResp config() {
		return commonClient.config().getDataOrThrow();
	}

	@Override
	public List<String> uploadImage(MultipartFile file) {
		return commonClient.uploadImage(file).getDataOrThrow();
	}

}
