package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 小程序全局配置响应
 */
@Schema(description = "小程序全局配置响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyConfigResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 黑名单提示文案
	 */
	@Schema(description = "黑名单提示文案")
	private String blackUserTipText;

	/**
	 * 预约保留分钟数
	 */
	@Schema(description = "预约保留分钟数")
	private Integer reserveHoldMinutes;

	/**
	 * 最多可提前预约天数
	 */
	@Schema(description = "最多可提前预约天数")
	private Integer reserveMaxDays;

	/**
	 * 最少预约小时数
	 */
	@Schema(description = "最少预约小时数")
	private Integer reserveMinHours;

	/**
	 * 预约订阅消息模板ID
	 */
	@Schema(description = "预约订阅消息模板ID")
	private String subscribeReserveTemplateId;

	/**
	 * 柜子订阅消息模板ID
	 */
	@Schema(description = "柜子订阅消息模板ID")
	private String subscribeCabinetTemplateId;

	/**
	 * 学习页背景图
	 */
	@Schema(description = "学习页背景图")
	private String studyBackImg;

	/**
	 * 预约页背景图
	 */
	@Schema(description = "预约页背景图")
	private String reserveBackImg;

	/**
	 * 关于我们图片
	 */
	@Schema(description = "关于我们图片")
	private String aboutImg;

	/**
	 * 客服电话
	 */
	@Schema(description = "客服电话")
	private String contractPhone;

	/**
	 * 客服文案
	 */
	@Schema(description = "客服文案")
	private String contractText;

	/**
	 * 是否开启在线客服
	 */
	@Schema(description = "是否开启在线客服")
	private Integer customerServiceOpen;

	/**
	 * 套餐购买页模板标识
	 */
	@Schema(description = "套餐购买页模板标识")
	private String packageBuyHtml;

	/**
	 * 套餐是否按区域筛选
	 */
	@Schema(description = "套餐是否按区域筛选")
	private Boolean showPackageAreaOpt;

	/**
	 * 是否展示登录协议
	 */
	@Schema(description = "是否展示登录协议")
	private Boolean showLoginAgreement;

	/**
	 * 学习公约标题
	 */
	@Schema(description = "学习公约标题")
	private String studyAgreeTitle;

	/**
	 * 是否展示退费规则
	 */
	@Schema(description = "是否展示退费规则")
	private Boolean studyRefundShow;

	/**
	 * 请假提示文案
	 */
	@Schema(description = "请假提示文案")
	private String leaveTipText;

	/**
	 * 是否展示多套餐签到
	 */
	@Schema(description = "是否展示多套餐签到")
	private Integer moreUserSignListOpen;

	/**
	 * 是否开启报修入口
	 */
	@Schema(description = "是否开启报修入口")
	private Integer userRepairEnterOpen;

	/**
	 * 是否开启报修记录
	 */
	@Schema(description = "是否开启报修记录")
	private Integer userRepairListOpen;

	/**
	 * 是否开启抖音核销
	 */
	@Schema(description = "是否开启抖音核销")
	private String douYinOpen;

	/**
	 * 是否开启美团结算
	 */
	@Schema(description = "是否开启美团结算")
	private String meiTuanOpen;

	/**
	 * 是否支持灯光控制
	 */
	@Schema(description = "是否支持灯光控制")
	private String lightOnline;

	/**
	 * 是否开启门禁
	 */
	@Schema(description = "是否开启门禁")
	private String guardOnline;

	/**
	 * 企业微信 corpId
	 */
	@Schema(description = "企业微信 corpId")
	private String corpId;

	/**
	 * 在线客服地址
	 */
	@Schema(description = "在线客服地址")
	private String customerServiceUrl;

	/**
	 * 客服在线时间文案
	 */
	@Schema(description = "客服在线时间文案")
	private String contractTimeStr;

	/**
	 * 客服微信号
	 */
	@Schema(description = "客服微信号")
	private String contractWechat;

	/**
	 * 客服二维码
	 */
	@Schema(description = "客服二维码")
	private String contractLogo;

	/**
	 * 新版客服二维码
	 */
	@Schema(description = "新版客服二维码")
	private String contractNewLogo;

	/**
	 * 新版客服主标题
	 */
	@Schema(description = "新版客服主标题")
	private String contractNewMainTitle;

	/**
	 * 新版客服副标题
	 */
	@Schema(description = "新版客服副标题")
	private String contractNewSubTitle;

	/**
	 * 客服联系电话列表
	 */
	@Schema(description = "客服联系电话列表")
	private List<StudyContractMobileResp> contractMobileArray;

	/**
	 * 是否展示新版客服入口：true-是 false-否
	 */
	@Schema(description = "是否展示新版客服入口：true-是 false-否")
	private String menuContractNewShow;

	/**
	 * 是否展示旧版客服入口：true-是 false-否
	 */
	@Schema(description = "是否展示旧版客服入口：true-是 false-否")
	private String menuContractOldShow;

	/**
	 * 是否展示软件服务入口：true-是 false-否
	 */
	@Schema(description = "是否展示软件服务入口：true-是 false-否")
	private String menuSoftShow;

	/**
	 * 小程序标题
	 */
	@Schema(description = "小程序标题")
	private String miniAppTitle;

	/**
	 * 授权页背景图
	 */
	@Schema(description = "授权页背景图")
	private String miniAppAuthImg;

	/**
	 * 用户协议弹窗文案
	 */
	@Schema(description = "用户协议弹窗文案")
	private String showLoginAgreementTitle;

	/**
	 * 学习公约展示方式：html-富文本 url-页面地址
	 */
	@Schema(description = "学习公约展示方式：html-富文本 url-页面地址")
	private String studyAgreeBtn;

	/**
	 * 学习公约富文本
	 */
	@Schema(description = "学习公约富文本")
	private String studyAgreeDescPageHtml;

	/**
	 * 学习公约页面地址
	 */
	@Schema(description = "学习公约页面地址")
	private String studyAgreeDescPageUrl;

	/**
	 * 学习公约图片
	 */
	@Schema(description = "学习公约图片")
	private String studyAgreeImg;

	/**
	 * 退费规则富文本
	 */
	@Schema(description = "退费规则富文本")
	private String studyRefundDescPageHtml;

	/**
	 * 退费规则页面地址
	 */
	@Schema(description = "退费规则页面地址")
	private String studyRefundDescPageUrl;

	/**
	 * 退费规则标题
	 */
	@Schema(description = "退费规则标题")
	private String studyRefundTitle;

	/**
	 * 通用说明页富文本
	 */
	@Schema(description = "通用说明页富文本")
	private String descPageHtml;

	/**
	 * 通用说明页地址
	 */
	@Schema(description = "通用说明页地址")
	private String descPageUrl;

	/**
	 * 预约成功页图片
	 */
	@Schema(description = "预约成功页图片")
	private String reserveSuccessImg;

	/**
	 * 预约成功页提示文案
	 */
	@Schema(description = "预约成功页提示文案")
	private String reserveSuccessTip;

	/**
	 * 预约门店 Logo
	 */
	@Schema(description = "预约门店 Logo")
	private String reserveVenueLogo;

	/**
	 * 区域封面展示方式：true-文字 false-封面图
	 */
	@Schema(description = "区域封面展示方式：true-文字 false-封面图")
	private String reserveAreaCoverType;

	/**
	 * 签到成功页图片
	 */
	@Schema(description = "签到成功页图片")
	private String studySuccessImg;

	/**
	 * 套餐购买页背景图
	 */
	@Schema(description = "套餐购买页背景图")
	private String packageBackImg;

	/**
	 * 套餐购买页插图
	 */
	@Schema(description = "套餐购买页插图")
	private String packageBuyImg;

	/**
	 * 套餐购买页按钮文案
	 */
	@Schema(description = "套餐购买页按钮文案")
	private String packagePayBtn;

	/**
	 * 套餐购买页用户协议
	 */
	@Schema(description = "套餐购买页用户协议")
	private String packageUserPaper;

	/**
	 * 团购 Logo
	 */
	@Schema(description = "团购 Logo")
	private String tuanGouLogo;

	/**
	 * 储物柜协议富文本
	 */
	@Schema(description = "储物柜协议富文本")
	private String cabinetAgreeHtml;

	/**
	 * 储物柜说明富文本
	 */
	@Schema(description = "储物柜说明富文本")
	private String cabinetDescHtml;

	/**
	 * 是否展示储物柜加购入口
	 */
	@Schema(description = "是否展示储物柜加购入口")
	private Boolean cabinetPlusShow;

	public String getBlackUserTipText() {
		return blackUserTipText;
	}

	public void setBlackUserTipText(String blackUserTipText) {
		this.blackUserTipText = blackUserTipText;
	}

	public Integer getReserveHoldMinutes() {
		return reserveHoldMinutes;
	}

	public void setReserveHoldMinutes(Integer reserveHoldMinutes) {
		this.reserveHoldMinutes = reserveHoldMinutes;
	}

	public Integer getReserveMaxDays() {
		return reserveMaxDays;
	}

	public void setReserveMaxDays(Integer reserveMaxDays) {
		this.reserveMaxDays = reserveMaxDays;
	}

	public Integer getReserveMinHours() {
		return reserveMinHours;
	}

	public void setReserveMinHours(Integer reserveMinHours) {
		this.reserveMinHours = reserveMinHours;
	}

	public String getSubscribeReserveTemplateId() {
		return subscribeReserveTemplateId;
	}

	public void setSubscribeReserveTemplateId(String subscribeReserveTemplateId) {
		this.subscribeReserveTemplateId = subscribeReserveTemplateId;
	}

	public String getSubscribeCabinetTemplateId() {
		return subscribeCabinetTemplateId;
	}

	public void setSubscribeCabinetTemplateId(String subscribeCabinetTemplateId) {
		this.subscribeCabinetTemplateId = subscribeCabinetTemplateId;
	}

	public String getStudyBackImg() {
		return studyBackImg;
	}

	public void setStudyBackImg(String studyBackImg) {
		this.studyBackImg = studyBackImg;
	}

	public String getReserveBackImg() {
		return reserveBackImg;
	}

	public void setReserveBackImg(String reserveBackImg) {
		this.reserveBackImg = reserveBackImg;
	}

	public String getAboutImg() {
		return aboutImg;
	}

	public void setAboutImg(String aboutImg) {
		this.aboutImg = aboutImg;
	}

	public String getContractPhone() {
		return contractPhone;
	}

	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}

	public String getContractText() {
		return contractText;
	}

	public void setContractText(String contractText) {
		this.contractText = contractText;
	}

	public Integer getCustomerServiceOpen() {
		return customerServiceOpen;
	}

	public void setCustomerServiceOpen(Integer customerServiceOpen) {
		this.customerServiceOpen = customerServiceOpen;
	}

	public String getPackageBuyHtml() {
		return packageBuyHtml;
	}

	public void setPackageBuyHtml(String packageBuyHtml) {
		this.packageBuyHtml = packageBuyHtml;
	}

	public Boolean getShowPackageAreaOpt() {
		return showPackageAreaOpt;
	}

	public void setShowPackageAreaOpt(Boolean showPackageAreaOpt) {
		this.showPackageAreaOpt = showPackageAreaOpt;
	}

	public Boolean getShowLoginAgreement() {
		return showLoginAgreement;
	}

	public void setShowLoginAgreement(Boolean showLoginAgreement) {
		this.showLoginAgreement = showLoginAgreement;
	}

	public String getStudyAgreeTitle() {
		return studyAgreeTitle;
	}

	public void setStudyAgreeTitle(String studyAgreeTitle) {
		this.studyAgreeTitle = studyAgreeTitle;
	}

	public Boolean getStudyRefundShow() {
		return studyRefundShow;
	}

	public void setStudyRefundShow(Boolean studyRefundShow) {
		this.studyRefundShow = studyRefundShow;
	}

	public String getLeaveTipText() {
		return leaveTipText;
	}

	public void setLeaveTipText(String leaveTipText) {
		this.leaveTipText = leaveTipText;
	}

	public Integer getMoreUserSignListOpen() {
		return moreUserSignListOpen;
	}

	public void setMoreUserSignListOpen(Integer moreUserSignListOpen) {
		this.moreUserSignListOpen = moreUserSignListOpen;
	}

	public Integer getUserRepairEnterOpen() {
		return userRepairEnterOpen;
	}

	public void setUserRepairEnterOpen(Integer userRepairEnterOpen) {
		this.userRepairEnterOpen = userRepairEnterOpen;
	}

	public Integer getUserRepairListOpen() {
		return userRepairListOpen;
	}

	public void setUserRepairListOpen(Integer userRepairListOpen) {
		this.userRepairListOpen = userRepairListOpen;
	}

	public String getDouYinOpen() {
		return douYinOpen;
	}

	public void setDouYinOpen(String douYinOpen) {
		this.douYinOpen = douYinOpen;
	}

	public String getMeiTuanOpen() {
		return meiTuanOpen;
	}

	public void setMeiTuanOpen(String meiTuanOpen) {
		this.meiTuanOpen = meiTuanOpen;
	}

	public String getLightOnline() {
		return lightOnline;
	}

	public void setLightOnline(String lightOnline) {
		this.lightOnline = lightOnline;
	}

	public String getGuardOnline() {
		return guardOnline;
	}

	public void setGuardOnline(String guardOnline) {
		this.guardOnline = guardOnline;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCustomerServiceUrl() {
		return customerServiceUrl;
	}

	public void setCustomerServiceUrl(String customerServiceUrl) {
		this.customerServiceUrl = customerServiceUrl;
	}

	public String getContractTimeStr() {
		return contractTimeStr;
	}

	public void setContractTimeStr(String contractTimeStr) {
		this.contractTimeStr = contractTimeStr;
	}

	public String getContractWechat() {
		return contractWechat;
	}

	public void setContractWechat(String contractWechat) {
		this.contractWechat = contractWechat;
	}

	public String getContractLogo() {
		return contractLogo;
	}

	public void setContractLogo(String contractLogo) {
		this.contractLogo = contractLogo;
	}

	public String getContractNewLogo() {
		return contractNewLogo;
	}

	public void setContractNewLogo(String contractNewLogo) {
		this.contractNewLogo = contractNewLogo;
	}

	public String getContractNewMainTitle() {
		return contractNewMainTitle;
	}

	public void setContractNewMainTitle(String contractNewMainTitle) {
		this.contractNewMainTitle = contractNewMainTitle;
	}

	public String getContractNewSubTitle() {
		return contractNewSubTitle;
	}

	public void setContractNewSubTitle(String contractNewSubTitle) {
		this.contractNewSubTitle = contractNewSubTitle;
	}

	public List<StudyContractMobileResp> getContractMobileArray() {
		return contractMobileArray;
	}

	public void setContractMobileArray(List<StudyContractMobileResp> contractMobileArray) {
		this.contractMobileArray = contractMobileArray;
	}

	public String getMenuContractNewShow() {
		return menuContractNewShow;
	}

	public void setMenuContractNewShow(String menuContractNewShow) {
		this.menuContractNewShow = menuContractNewShow;
	}

	public String getMenuContractOldShow() {
		return menuContractOldShow;
	}

	public void setMenuContractOldShow(String menuContractOldShow) {
		this.menuContractOldShow = menuContractOldShow;
	}

	public String getMenuSoftShow() {
		return menuSoftShow;
	}

	public void setMenuSoftShow(String menuSoftShow) {
		this.menuSoftShow = menuSoftShow;
	}

	public String getMiniAppTitle() {
		return miniAppTitle;
	}

	public void setMiniAppTitle(String miniAppTitle) {
		this.miniAppTitle = miniAppTitle;
	}

	public String getMiniAppAuthImg() {
		return miniAppAuthImg;
	}

	public void setMiniAppAuthImg(String miniAppAuthImg) {
		this.miniAppAuthImg = miniAppAuthImg;
	}

	public String getShowLoginAgreementTitle() {
		return showLoginAgreementTitle;
	}

	public void setShowLoginAgreementTitle(String showLoginAgreementTitle) {
		this.showLoginAgreementTitle = showLoginAgreementTitle;
	}

	public String getStudyAgreeBtn() {
		return studyAgreeBtn;
	}

	public void setStudyAgreeBtn(String studyAgreeBtn) {
		this.studyAgreeBtn = studyAgreeBtn;
	}

	public String getStudyAgreeDescPageHtml() {
		return studyAgreeDescPageHtml;
	}

	public void setStudyAgreeDescPageHtml(String studyAgreeDescPageHtml) {
		this.studyAgreeDescPageHtml = studyAgreeDescPageHtml;
	}

	public String getStudyAgreeDescPageUrl() {
		return studyAgreeDescPageUrl;
	}

	public void setStudyAgreeDescPageUrl(String studyAgreeDescPageUrl) {
		this.studyAgreeDescPageUrl = studyAgreeDescPageUrl;
	}

	public String getStudyAgreeImg() {
		return studyAgreeImg;
	}

	public void setStudyAgreeImg(String studyAgreeImg) {
		this.studyAgreeImg = studyAgreeImg;
	}

	public String getStudyRefundDescPageHtml() {
		return studyRefundDescPageHtml;
	}

	public void setStudyRefundDescPageHtml(String studyRefundDescPageHtml) {
		this.studyRefundDescPageHtml = studyRefundDescPageHtml;
	}

	public String getStudyRefundDescPageUrl() {
		return studyRefundDescPageUrl;
	}

	public void setStudyRefundDescPageUrl(String studyRefundDescPageUrl) {
		this.studyRefundDescPageUrl = studyRefundDescPageUrl;
	}

	public String getStudyRefundTitle() {
		return studyRefundTitle;
	}

	public void setStudyRefundTitle(String studyRefundTitle) {
		this.studyRefundTitle = studyRefundTitle;
	}

	public String getDescPageHtml() {
		return descPageHtml;
	}

	public void setDescPageHtml(String descPageHtml) {
		this.descPageHtml = descPageHtml;
	}

	public String getDescPageUrl() {
		return descPageUrl;
	}

	public void setDescPageUrl(String descPageUrl) {
		this.descPageUrl = descPageUrl;
	}

	public String getReserveSuccessImg() {
		return reserveSuccessImg;
	}

	public void setReserveSuccessImg(String reserveSuccessImg) {
		this.reserveSuccessImg = reserveSuccessImg;
	}

	public String getReserveSuccessTip() {
		return reserveSuccessTip;
	}

	public void setReserveSuccessTip(String reserveSuccessTip) {
		this.reserveSuccessTip = reserveSuccessTip;
	}

	public String getReserveVenueLogo() {
		return reserveVenueLogo;
	}

	public void setReserveVenueLogo(String reserveVenueLogo) {
		this.reserveVenueLogo = reserveVenueLogo;
	}

	public String getReserveAreaCoverType() {
		return reserveAreaCoverType;
	}

	public void setReserveAreaCoverType(String reserveAreaCoverType) {
		this.reserveAreaCoverType = reserveAreaCoverType;
	}

	public String getStudySuccessImg() {
		return studySuccessImg;
	}

	public void setStudySuccessImg(String studySuccessImg) {
		this.studySuccessImg = studySuccessImg;
	}

	public String getPackageBackImg() {
		return packageBackImg;
	}

	public void setPackageBackImg(String packageBackImg) {
		this.packageBackImg = packageBackImg;
	}

	public String getPackageBuyImg() {
		return packageBuyImg;
	}

	public void setPackageBuyImg(String packageBuyImg) {
		this.packageBuyImg = packageBuyImg;
	}

	public String getPackagePayBtn() {
		return packagePayBtn;
	}

	public void setPackagePayBtn(String packagePayBtn) {
		this.packagePayBtn = packagePayBtn;
	}

	public String getPackageUserPaper() {
		return packageUserPaper;
	}

	public void setPackageUserPaper(String packageUserPaper) {
		this.packageUserPaper = packageUserPaper;
	}

	public String getTuanGouLogo() {
		return tuanGouLogo;
	}

	public void setTuanGouLogo(String tuanGouLogo) {
		this.tuanGouLogo = tuanGouLogo;
	}

	public String getCabinetAgreeHtml() {
		return cabinetAgreeHtml;
	}

	public void setCabinetAgreeHtml(String cabinetAgreeHtml) {
		this.cabinetAgreeHtml = cabinetAgreeHtml;
	}

	public String getCabinetDescHtml() {
		return cabinetDescHtml;
	}

	public void setCabinetDescHtml(String cabinetDescHtml) {
		this.cabinetDescHtml = cabinetDescHtml;
	}

	public Boolean getCabinetPlusShow() {
		return cabinetPlusShow;
	}

	public void setCabinetPlusShow(Boolean cabinetPlusShow) {
		this.cabinetPlusShow = cabinetPlusShow;
	}

}
