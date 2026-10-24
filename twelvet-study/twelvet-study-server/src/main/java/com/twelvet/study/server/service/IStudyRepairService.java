package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.req.StudyRepairSubmitReq;
import com.twelvet.study.api.domain.resp.StudyListResp;
import com.twelvet.study.api.domain.resp.StudyRepairResp;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序报修服务
 */
public interface IStudyRepairService {

	/**
	 * 提交报修
	 * @param dto 报修参数
	 */
	void submit(StudyRepairSubmitReq dto);

	/**
	 * 报修列表
	 * @return 报修列表
	 */
	StudyListResp<StudyRepairResp> list();

	/**
	 * 报修详情
	 * @param id 报修ID
	 * @return 报修详情
	 */
	StudyRepairResp detail(Long id);

}
