package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 门店 / 学习首页门店信息
 */
@Schema(description = "门店 / 学习首页门店信息")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyVenueResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 学习页背景图
	 */
	@Schema(description = "学习页背景图")
	private String studyBackImg;

	/**
	 * 附近是否有门店：0-否 1-是
	 */
	@Schema(description = "附近是否有门店：0-否 1-是")
	private Integer hasVenue;

	/**
	 * 是否已签到入座：0-否 1-是
	 */
	@Schema(description = "是否已签到入座：0-否 1-是")
	private Integer hasSeat;

	/**
	 * 是否有可用套餐：0-否 1-是
	 */
	@Schema(description = "是否有可用套餐：0-否 1-是")
	private Integer hasUserPackage;

	/**
	 * 是否需要扫码签到：true-是 false-否
	 */
	@Schema(description = "是否需要扫码签到：true-是 false-否")
	private String qrCodeNeedSignIn;

	/**
	 * 是否需要扫码签退：true-是 false-否
	 */
	@Schema(description = "是否需要扫码签退：true-是 false-否")
	private String qrCodeNeedSignOut;

	/**
	 * 是否可换座：0-否 1-是
	 */
	@Schema(description = "是否可换座：0-否 1-是")
	private Integer canChangeSeat;

	/**
	 * 是否可为他人签到：0-否 1-是
	 */
	@Schema(description = "是否可为他人签到：0-否 1-是")
	private Integer canSignAnother;

	/**
	 * 是否展示为他人签到按钮：true-是 false-否
	 */
	@Schema(description = "是否展示为他人签到按钮：true-是 false-否")
	private String signAnotherBtn;

	/**
	 * 是否开启门禁：true-是 false-否
	 */
	@Schema(description = "是否开启门禁：true-是 false-否")
	private String guardOnline;

	/**
	 * 是否支持灯光控制：true-是 false-否
	 */
	@Schema(description = "是否支持灯光控制：true-是 false-否")
	private String lightOnline;

	/**
	 * 是否开启储物柜：true-是 false-否
	 */
	@Schema(description = "是否开启储物柜：true-是 false-否")
	private String cabinetOnline;

	/**
	 * 是否展示 WiFi 连接按钮：true-是 false-否
	 */
	@Schema(description = "是否展示 WiFi 连接按钮：true-是 false-否")
	private String wifiConnBtn;

	/**
	 * 是否展示最长可用时长
	 */
	@Schema(description = "是否展示最长可用时长")
	private Boolean showMaxStudyTime;

	/**
	 * 累计学习天数
	 */
	@Schema(description = "累计学习天数")
	private Integer studyDays;

	/**
	 * 当前学习记录ID
	 */
	@Schema(description = "当前学习记录ID")
	private Long userSignId;

	/**
	 * 签到中套餐数量
	 */
	@Schema(description = "签到中套餐数量")
	private Integer userSignInfoNum;

	/**
	 * 预约中记录数量
	 */
	@Schema(description = "预约中记录数量")
	private Integer userReserveInfoNum;

	/**
	 * 当前座位
	 */
	@Schema(description = "当前座位")
	private StudySeatResp seatCurrent;

	/**
	 * 默认签到套餐
	 */
	@Schema(description = "默认签到套餐")
	private StudySignPackageResp signInUserPackage;

	/**
	 * 签到中的套餐列表
	 */
	@Schema(description = "签到中的套餐列表")
	private List<StudySignPackageResp> userSignInfoList;

	/**
	 * 附近门店列表
	 */
	@Schema(description = "附近门店列表")
	private List<StudySeatVenueResp> venueNearestList;

	/**
	 * 最近的门店
	 */
	@Schema(description = "最近的门店")
	private StudySeatVenueResp venueNearest;

	/**
	 * 下次预约信息
	 */
	@Schema(description = "下次预约信息")
	private StudyNextReserveInfoResp nextReserveInfo;

	/**
	 * 学习首页顶部说明文案
	 */
	@Schema(description = "学习首页顶部说明文案")
	private String configStudyIndexText;

	/**
	 * 附近无门店时的说明文案
	 */
	@Schema(description = "附近无门店时的说明文案")
	private String configStudyNoVenueText;

	/**
	 * 签到按钮文案
	 */
	@Schema(description = "签到按钮文案")
	private String buttonTextOfSignIn;

	/**
	 * 签退按钮文案
	 */
	@Schema(description = "签退按钮文案")
	private String buttonTextOfSignOut;

	/**
	 * 选套餐按钮文案
	 */
	@Schema(description = "选套餐按钮文案")
	private String buttonTextOfSelectPackage;

	/**
	 * 换座按钮文案
	 */
	@Schema(description = "换座按钮文案")
	private String buttonTextOfChangeSeat;

	/**
	 * 灯光控制按钮文案
	 */
	@Schema(description = "灯光控制按钮文案")
	private String buttonTextOfLight;

	/**
	 * 储物柜按钮文案
	 */
	@Schema(description = "储物柜按钮文案")
	private String buttonTextOfCabinet;

	/**
	 * 开门按钮文案
	 */
	@Schema(description = "开门按钮文案")
	private String buttonTextOfGuard;

	/**
	 * 再签一座按钮文案（为空时小程序回退为「再签一座」）
	 */
	@Schema(description = "再签一座按钮文案（为空时小程序回退为「再签一座」）")
	private String buttonTextOfNext;

	/**
	 * 不可签到时的提示
	 */
	@Schema(description = "不可签到时的提示")
	private String descNoSignIn;

	/**
	 * 不可签退时的提示
	 */
	@Schema(description = "不可签退时的提示")
	private String descNoSignOut;

	/**
	 * 不可选套餐时的提示
	 */
	@Schema(description = "不可选套餐时的提示")
	private String descNoPackageSelect;

	/**
	 * 不可换座时的提示
	 */
	@Schema(description = "不可换座时的提示")
	private String descNoChangeSeat;

	/**
	 * 不可用灯光时的提示
	 */
	@Schema(description = "不可用灯光时的提示")
	private String descNoLight;

	/**
	 * 不可用储物柜时的提示
	 */
	@Schema(description = "不可用储物柜时的提示")
	private String descNoCabinet;

	/**
	 * 不可开门时的提示
	 */
	@Schema(description = "不可开门时的提示")
	private String descNoGuard;

	/**
	 * 不可为他人签到时的提示
	 */
	@Schema(description = "不可为他人签到时的提示")
	private String descNoSignAnother;

	public String getStudyBackImg() {
		return studyBackImg;
	}

	public void setStudyBackImg(String studyBackImg) {
		this.studyBackImg = studyBackImg;
	}

	public Integer getHasVenue() {
		return hasVenue;
	}

	public void setHasVenue(Integer hasVenue) {
		this.hasVenue = hasVenue;
	}

	public Integer getHasSeat() {
		return hasSeat;
	}

	public void setHasSeat(Integer hasSeat) {
		this.hasSeat = hasSeat;
	}

	public Integer getHasUserPackage() {
		return hasUserPackage;
	}

	public void setHasUserPackage(Integer hasUserPackage) {
		this.hasUserPackage = hasUserPackage;
	}

	public String getQrCodeNeedSignIn() {
		return qrCodeNeedSignIn;
	}

	public void setQrCodeNeedSignIn(String qrCodeNeedSignIn) {
		this.qrCodeNeedSignIn = qrCodeNeedSignIn;
	}

	public String getQrCodeNeedSignOut() {
		return qrCodeNeedSignOut;
	}

	public void setQrCodeNeedSignOut(String qrCodeNeedSignOut) {
		this.qrCodeNeedSignOut = qrCodeNeedSignOut;
	}

	public Integer getCanChangeSeat() {
		return canChangeSeat;
	}

	public void setCanChangeSeat(Integer canChangeSeat) {
		this.canChangeSeat = canChangeSeat;
	}

	public Integer getCanSignAnother() {
		return canSignAnother;
	}

	public void setCanSignAnother(Integer canSignAnother) {
		this.canSignAnother = canSignAnother;
	}

	public String getSignAnotherBtn() {
		return signAnotherBtn;
	}

	public void setSignAnotherBtn(String signAnotherBtn) {
		this.signAnotherBtn = signAnotherBtn;
	}

	public String getGuardOnline() {
		return guardOnline;
	}

	public void setGuardOnline(String guardOnline) {
		this.guardOnline = guardOnline;
	}

	public String getLightOnline() {
		return lightOnline;
	}

	public void setLightOnline(String lightOnline) {
		this.lightOnline = lightOnline;
	}

	public String getCabinetOnline() {
		return cabinetOnline;
	}

	public void setCabinetOnline(String cabinetOnline) {
		this.cabinetOnline = cabinetOnline;
	}

	public String getWifiConnBtn() {
		return wifiConnBtn;
	}

	public void setWifiConnBtn(String wifiConnBtn) {
		this.wifiConnBtn = wifiConnBtn;
	}

	public Boolean getShowMaxStudyTime() {
		return showMaxStudyTime;
	}

	public void setShowMaxStudyTime(Boolean showMaxStudyTime) {
		this.showMaxStudyTime = showMaxStudyTime;
	}

	public Integer getStudyDays() {
		return studyDays;
	}

	public void setStudyDays(Integer studyDays) {
		this.studyDays = studyDays;
	}

	public Long getUserSignId() {
		return userSignId;
	}

	public void setUserSignId(Long userSignId) {
		this.userSignId = userSignId;
	}

	public Integer getUserSignInfoNum() {
		return userSignInfoNum;
	}

	public void setUserSignInfoNum(Integer userSignInfoNum) {
		this.userSignInfoNum = userSignInfoNum;
	}

	public Integer getUserReserveInfoNum() {
		return userReserveInfoNum;
	}

	public void setUserReserveInfoNum(Integer userReserveInfoNum) {
		this.userReserveInfoNum = userReserveInfoNum;
	}

	public StudySeatResp getSeatCurrent() {
		return seatCurrent;
	}

	public void setSeatCurrent(StudySeatResp seatCurrent) {
		this.seatCurrent = seatCurrent;
	}

	public StudySignPackageResp getSignInUserPackage() {
		return signInUserPackage;
	}

	public void setSignInUserPackage(StudySignPackageResp signInUserPackage) {
		this.signInUserPackage = signInUserPackage;
	}

	public List<StudySignPackageResp> getUserSignInfoList() {
		return userSignInfoList;
	}

	public void setUserSignInfoList(List<StudySignPackageResp> userSignInfoList) {
		this.userSignInfoList = userSignInfoList;
	}

	public List<StudySeatVenueResp> getVenueNearestList() {
		return venueNearestList;
	}

	public void setVenueNearestList(List<StudySeatVenueResp> venueNearestList) {
		this.venueNearestList = venueNearestList;
	}

	public StudySeatVenueResp getVenueNearest() {
		return venueNearest;
	}

	public void setVenueNearest(StudySeatVenueResp venueNearest) {
		this.venueNearest = venueNearest;
	}

	public StudyNextReserveInfoResp getNextReserveInfo() {
		return nextReserveInfo;
	}

	public void setNextReserveInfo(StudyNextReserveInfoResp nextReserveInfo) {
		this.nextReserveInfo = nextReserveInfo;
	}

	public String getConfigStudyIndexText() {
		return configStudyIndexText;
	}

	public void setConfigStudyIndexText(String configStudyIndexText) {
		this.configStudyIndexText = configStudyIndexText;
	}

	public String getConfigStudyNoVenueText() {
		return configStudyNoVenueText;
	}

	public void setConfigStudyNoVenueText(String configStudyNoVenueText) {
		this.configStudyNoVenueText = configStudyNoVenueText;
	}

	public String getButtonTextOfSignIn() {
		return buttonTextOfSignIn;
	}

	public void setButtonTextOfSignIn(String buttonTextOfSignIn) {
		this.buttonTextOfSignIn = buttonTextOfSignIn;
	}

	public String getButtonTextOfSignOut() {
		return buttonTextOfSignOut;
	}

	public void setButtonTextOfSignOut(String buttonTextOfSignOut) {
		this.buttonTextOfSignOut = buttonTextOfSignOut;
	}

	public String getButtonTextOfSelectPackage() {
		return buttonTextOfSelectPackage;
	}

	public void setButtonTextOfSelectPackage(String buttonTextOfSelectPackage) {
		this.buttonTextOfSelectPackage = buttonTextOfSelectPackage;
	}

	public String getButtonTextOfChangeSeat() {
		return buttonTextOfChangeSeat;
	}

	public void setButtonTextOfChangeSeat(String buttonTextOfChangeSeat) {
		this.buttonTextOfChangeSeat = buttonTextOfChangeSeat;
	}

	public String getButtonTextOfLight() {
		return buttonTextOfLight;
	}

	public void setButtonTextOfLight(String buttonTextOfLight) {
		this.buttonTextOfLight = buttonTextOfLight;
	}

	public String getButtonTextOfCabinet() {
		return buttonTextOfCabinet;
	}

	public void setButtonTextOfCabinet(String buttonTextOfCabinet) {
		this.buttonTextOfCabinet = buttonTextOfCabinet;
	}

	public String getButtonTextOfGuard() {
		return buttonTextOfGuard;
	}

	public void setButtonTextOfGuard(String buttonTextOfGuard) {
		this.buttonTextOfGuard = buttonTextOfGuard;
	}

	public String getButtonTextOfNext() {
		return buttonTextOfNext;
	}

	public void setButtonTextOfNext(String buttonTextOfNext) {
		this.buttonTextOfNext = buttonTextOfNext;
	}

	public String getDescNoSignIn() {
		return descNoSignIn;
	}

	public void setDescNoSignIn(String descNoSignIn) {
		this.descNoSignIn = descNoSignIn;
	}

	public String getDescNoSignOut() {
		return descNoSignOut;
	}

	public void setDescNoSignOut(String descNoSignOut) {
		this.descNoSignOut = descNoSignOut;
	}

	public String getDescNoPackageSelect() {
		return descNoPackageSelect;
	}

	public void setDescNoPackageSelect(String descNoPackageSelect) {
		this.descNoPackageSelect = descNoPackageSelect;
	}

	public String getDescNoChangeSeat() {
		return descNoChangeSeat;
	}

	public void setDescNoChangeSeat(String descNoChangeSeat) {
		this.descNoChangeSeat = descNoChangeSeat;
	}

	public String getDescNoLight() {
		return descNoLight;
	}

	public void setDescNoLight(String descNoLight) {
		this.descNoLight = descNoLight;
	}

	public String getDescNoCabinet() {
		return descNoCabinet;
	}

	public void setDescNoCabinet(String descNoCabinet) {
		this.descNoCabinet = descNoCabinet;
	}

	public String getDescNoGuard() {
		return descNoGuard;
	}

	public void setDescNoGuard(String descNoGuard) {
		this.descNoGuard = descNoGuard;
	}

	public String getDescNoSignAnother() {
		return descNoSignAnother;
	}

	public void setDescNoSignAnother(String descNoSignAnother) {
		this.descNoSignAnother = descNoSignAnother;
	}

}
