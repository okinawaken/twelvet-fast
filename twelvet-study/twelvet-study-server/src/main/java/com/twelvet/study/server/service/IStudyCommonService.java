package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.resp.StudyConfigResp;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序公共接口服务
 */
public interface IStudyCommonService {

	/**
	 * 小程序全局配置（无需登录）
	 * @return 客服、预约规则、页面背景等配置
	 */
	StudyConfigResp config();

	/**
	 * 上传图片
	 * @param file 图片文件
	 * @return 图片地址集合
	 */
	List<String> uploadImage(MultipartFile file);

}
