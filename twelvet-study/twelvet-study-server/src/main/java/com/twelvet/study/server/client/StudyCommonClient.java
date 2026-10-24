package com.twelvet.study.server.client;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.DataFile;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.PostRequest;
import com.twelvet.study.api.constant.StudyApiConstants;
import com.twelvet.study.api.domain.StudyApiResult;
import com.twelvet.study.api.domain.resp.StudyConfigResp;
import com.twelvet.study.server.client.interceptor.StudyAuthInterceptor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 时不我待小程序 - 公共接口
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@BaseRequest(baseURL = StudyApiConstants.BASE_URL, contentType = "application/json",
		interceptor = StudyAuthInterceptor.class)
public interface StudyCommonClient {

	/**
	 * 小程序全局配置（无需登录）
	 * @return 客服、预约规则、页面背景等配置
	 */
	@GetRequest(url = "/mp/sys/config/data")
	StudyApiResult<StudyConfigResp> config();

	/**
	 * 上传图片，返回图片地址集合
	 * @param file 图片文件，表单字段名 files
	 * @return 图片地址集合
	 */
	@PostRequest(url = "/mp/image/upload", contentType = "multipart/form-data")
	StudyApiResult<List<String>> uploadImage(@DataFile("files") MultipartFile file);

}
