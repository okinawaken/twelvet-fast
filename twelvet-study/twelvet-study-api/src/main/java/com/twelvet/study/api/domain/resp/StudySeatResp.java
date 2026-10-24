package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 座位
 * <p>
 * 预约座位图与扫码签到座位图复用同一结构，未在当前场景返回的字段为 null。
 */
@Schema(description = "座位")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySeatResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 座位ID
	 */
	@Schema(description = "座位ID")
	private Long id;

	/**
	 * 座位号
	 */
	@Schema(description = "座位号")
	private String seatNumber;

	/**
	 * 区域名称
	 */
	@Schema(description = "区域名称")
	private String areaName;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long venueId;

	/**
	 * 门店名称
	 */
	@Schema(description = "门店名称")
	private String venueName;

	/**
	 * 座位预约状态：10-可预约 30-不可预约
	 */
	@Schema(description = "座位预约状态：10-可预约 30-不可预约")
	private Integer seatReserveState;

	/**
	 * 座位预约渠道
	 */
	@Schema(description = "座位预约渠道")
	private Integer seatReserveChannel;

	/**
	 * 座位预约渠道（真实值，未做展示过滤）
	 */
	@Schema(description = "座位预约渠道（真实值，未做展示过滤）")
	private Integer seatReserveChannelReal;

	/**
	 * 不可预约原因
	 */
	@Schema(description = "不可预约原因")
	private String seatReserveDesc;

	/**
	 * 不可预约原因（真实值）
	 */
	@Schema(description = "不可预约原因（真实值）")
	private String seatReserveDescReal;

	/**
	 * 最早可预约时刻 HH:mm
	 */
	@Schema(description = "最早可预约时刻 HH:mm")
	private String minReserveDesc;

	/**
	 * 最早可预约时刻 HH:mm
	 */
	@Schema(description = "最早可预约时刻 HH:mm")
	private String minStartTimeStr;

	/**
	 * 下一步预约提示，如「您确认要提交预约吗」
	 */
	@Schema(description = "下一步预约提示")
	private String nextReserveDesc;

	/**
	 * 该座位已有的预约记录（v2 预约座位图）
	 */
	@Schema(description = "该座位已有的预约记录")
	private List<StudySeatReserveRecordResp> reserveRecordList;

	/**
	 * 该座位可预约时段（v2 预约座位图）
	 */
	@Schema(description = "该座位可预约时段")
	private List<StudySeatValidTimeResp> validTimeStrList;

	/**
	 * 签到场景下的座位状态
	 */
	@Schema(description = "签到场景下的座位状态")
	private Integer seatState;

	/**
	 * 座位签到渠道
	 */
	@Schema(description = "座位签到渠道")
	private Integer seatSignChannel;

	/**
	 * 座位签到渠道（真实值）
	 */
	@Schema(description = "座位签到渠道（真实值）")
	private Integer seatSignChannelReal;

	/**
	 * 是否本人预约
	 */
	@Schema(description = "是否本人预约")
	private Integer selfReserve;

	/**
	 * 座位描述，如「占用」
	 */
	@Schema(description = "座位描述，如「占用」")
	private String seatDesc;

	/**
	 * 不可签到原因
	 */
	@Schema(description = "不可签到原因")
	private String reason;

	/**
	 * 本次签到时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "本次签到时间 yyyy-MM-dd HH:mm:ss")
	private String signInTimeStr;

	/**
	 * 已学习小时数
	 */
	@Schema(description = "已学习小时数")
	private Integer studyHours;

	/**
	 * 已学习分钟数（小时之外的余数）
	 */
	@Schema(description = "已学习分钟数（小时之外的余数）")
	private Integer studyMinutes;

	/**
	 * 已学习秒数
	 */
	@Schema(description = "已学习秒数")
	private Integer studySeconds;

	/**
	 * 灯光绑定状态
	 */
	@Schema(description = "灯光绑定状态")
	private Integer lightBindStatus;

	/**
	 * 灯光开关状态
	 */
	@Schema(description = "灯光开关状态")
	private Integer lightOpenStatus;

	/**
	 * 下次预约信息
	 */
	@Schema(description = "下次预约信息")
	private StudyNextReserveInfoResp nextReserveInfo;

	/**
	 * 下次预约开始时刻 HH:mm
	 */
	@Schema(description = "下次预约开始时刻 HH:mm")
	private String nextReserveStartTimeStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Integer getSeatReserveState() {
		return seatReserveState;
	}

	public void setSeatReserveState(Integer seatReserveState) {
		this.seatReserveState = seatReserveState;
	}

	public Integer getSeatReserveChannel() {
		return seatReserveChannel;
	}

	public void setSeatReserveChannel(Integer seatReserveChannel) {
		this.seatReserveChannel = seatReserveChannel;
	}

	public Integer getSeatReserveChannelReal() {
		return seatReserveChannelReal;
	}

	public void setSeatReserveChannelReal(Integer seatReserveChannelReal) {
		this.seatReserveChannelReal = seatReserveChannelReal;
	}

	public String getSeatReserveDesc() {
		return seatReserveDesc;
	}

	public void setSeatReserveDesc(String seatReserveDesc) {
		this.seatReserveDesc = seatReserveDesc;
	}

	public String getSeatReserveDescReal() {
		return seatReserveDescReal;
	}

	public void setSeatReserveDescReal(String seatReserveDescReal) {
		this.seatReserveDescReal = seatReserveDescReal;
	}

	public String getMinReserveDesc() {
		return minReserveDesc;
	}

	public void setMinReserveDesc(String minReserveDesc) {
		this.minReserveDesc = minReserveDesc;
	}

	public String getMinStartTimeStr() {
		return minStartTimeStr;
	}

	public void setMinStartTimeStr(String minStartTimeStr) {
		this.minStartTimeStr = minStartTimeStr;
	}

	public String getNextReserveDesc() {
		return nextReserveDesc;
	}

	public void setNextReserveDesc(String nextReserveDesc) {
		this.nextReserveDesc = nextReserveDesc;
	}

	public List<StudySeatReserveRecordResp> getReserveRecordList() {
		return reserveRecordList;
	}

	public void setReserveRecordList(List<StudySeatReserveRecordResp> reserveRecordList) {
		this.reserveRecordList = reserveRecordList;
	}

	public List<StudySeatValidTimeResp> getValidTimeStrList() {
		return validTimeStrList;
	}

	public void setValidTimeStrList(List<StudySeatValidTimeResp> validTimeStrList) {
		this.validTimeStrList = validTimeStrList;
	}

	public Integer getSeatState() {
		return seatState;
	}

	public void setSeatState(Integer seatState) {
		this.seatState = seatState;
	}

	public Integer getSeatSignChannel() {
		return seatSignChannel;
	}

	public void setSeatSignChannel(Integer seatSignChannel) {
		this.seatSignChannel = seatSignChannel;
	}

	public Integer getSeatSignChannelReal() {
		return seatSignChannelReal;
	}

	public void setSeatSignChannelReal(Integer seatSignChannelReal) {
		this.seatSignChannelReal = seatSignChannelReal;
	}

	public Integer getSelfReserve() {
		return selfReserve;
	}

	public void setSelfReserve(Integer selfReserve) {
		this.selfReserve = selfReserve;
	}

	public String getSeatDesc() {
		return seatDesc;
	}

	public void setSeatDesc(String seatDesc) {
		this.seatDesc = seatDesc;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSignInTimeStr() {
		return signInTimeStr;
	}

	public void setSignInTimeStr(String signInTimeStr) {
		this.signInTimeStr = signInTimeStr;
	}

	public Integer getStudyHours() {
		return studyHours;
	}

	public void setStudyHours(Integer studyHours) {
		this.studyHours = studyHours;
	}

	public Integer getStudyMinutes() {
		return studyMinutes;
	}

	public void setStudyMinutes(Integer studyMinutes) {
		this.studyMinutes = studyMinutes;
	}

	public Integer getStudySeconds() {
		return studySeconds;
	}

	public void setStudySeconds(Integer studySeconds) {
		this.studySeconds = studySeconds;
	}

	public Integer getLightBindStatus() {
		return lightBindStatus;
	}

	public void setLightBindStatus(Integer lightBindStatus) {
		this.lightBindStatus = lightBindStatus;
	}

	public Integer getLightOpenStatus() {
		return lightOpenStatus;
	}

	public void setLightOpenStatus(Integer lightOpenStatus) {
		this.lightOpenStatus = lightOpenStatus;
	}

	public StudyNextReserveInfoResp getNextReserveInfo() {
		return nextReserveInfo;
	}

	public void setNextReserveInfo(StudyNextReserveInfoResp nextReserveInfo) {
		this.nextReserveInfo = nextReserveInfo;
	}

	public String getNextReserveStartTimeStr() {
		return nextReserveStartTimeStr;
	}

	public void setNextReserveStartTimeStr(String nextReserveStartTimeStr) {
		this.nextReserveStartTimeStr = nextReserveStartTimeStr;
	}

}
