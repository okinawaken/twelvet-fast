package com.twelvet.study.server.service;

import com.twelvet.study.api.domain.req.StudyLocationQueryReq;
import com.twelvet.study.api.domain.req.StudyPackageConfirmReq;
import com.twelvet.study.api.domain.req.StudyPackageConfirmV2Req;
import com.twelvet.study.api.domain.req.StudyPackageQueryReq;
import com.twelvet.study.api.domain.req.StudyPayOrderReq;
import com.twelvet.study.api.domain.resp.StudyOrderResp;
import com.twelvet.study.api.domain.resp.StudyPackageAreaListResp;
import com.twelvet.study.api.domain.resp.StudyPackageListResp;
import com.twelvet.study.api.domain.resp.StudyPackageOptionResp;
import com.twelvet.study.api.domain.resp.StudyPackageResp;
import com.twelvet.study.api.domain.resp.StudyPayResp;
import com.twelvet.study.api.domain.resp.StudySeatAreaListResp;

import java.util.Map;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序套餐购买服务
 */
public interface IStudyPackageService {

	/**
	 * 套餐区域列表（旧版）
	 * @return 区域列表
	 */
	StudyPackageAreaListResp packageList();

	/**
	 * 套餐介绍
	 * @return 套餐介绍
	 */
	Map<String, Object> introduce();

	/**
	 * 门店可选区域
	 * @param venueId 门店ID
	 * @return 区域列表
	 */
	StudySeatAreaListResp seatAreaList(Long venueId);

	/**
	 * 套餐筛选选项
	 * @param dto 定位
	 * @return 选项
	 */
	StudyPackageOptionResp options(StudyLocationQueryReq dto);

	/**
	 * 套餐列表（v2）
	 * @param dto 查询条件
	 * @return 套餐列表
	 */
	StudyPackageListResp v2PackageList(StudyPackageQueryReq dto);

	/**
	 * 套餐详情
	 * @param id 套餐ID
	 * @return 套餐详情
	 */
	StudyPackageResp detail(Long id);

	/**
	 * 套餐下单（v2）
	 * @param dto 下单参数
	 * @return 订单
	 */
	StudyOrderResp confirmV2(StudyPackageConfirmV2Req dto);

	/**
	 * 套餐下单（旧版）
	 * @param dto 下单参数
	 * @return 订单
	 */
	StudyOrderResp confirm(StudyPackageConfirmReq dto);

	/**
	 * 套餐支付
	 * @param dto 支付参数
	 * @return 支付信息
	 */
	StudyPayResp payOrder(StudyPayOrderReq dto);

}
