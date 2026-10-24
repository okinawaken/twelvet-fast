package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 座位图内联的门店信息（预约座位图 / 扫码签到座位图）
 */
@Schema(description = "座位图内联的门店信息（预约座位图 / 扫码签到座位图）")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudySeatVenueResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 门店ID
	 */
	@Schema(description = "门店ID")
	private Long id;

	/**
	 * 门店名称
	 */
	@Schema(description = "门店名称")
	private String venueName;

	/**
	 * 门店地址
	 */
	@Schema(description = "门店地址")
	private String venueAddress;

	/**
	 * 门店纬度
	 */
	@Schema(description = "门店纬度")
	private BigDecimal venueLat;

	/**
	 * 门店经度
	 */
	@Schema(description = "门店经度")
	private BigDecimal venueLng;

	/**
	 * 营业时间 HH:mm-HH:mm
	 */
	@Schema(description = "营业时间 HH:mm-HH:mm")
	private String venueOpenTime;

	/**
	 * 门店预约状态
	 */
	@Schema(description = "门店预约状态")
	private Integer venueReserveState;

	/**
	 * 与当前定位的距离（米）
	 */
	@Schema(description = "与当前定位的距离（米）")
	private BigDecimal distance;

	/**
	 * 距离描述
	 */
	@Schema(description = "距离描述")
	private String distanceStr;

	/**
	 * 门店图片
	 */
	@Schema(description = "门店图片")
	private List<StudyFileResp> venueImgPathList;

	/**
	 * 门店背景图
	 */
	@Schema(description = "门店背景图")
	private String backImage;

	/**
	 * 停车说明
	 */
	@Schema(description = "停车说明")
	private String parking;

	/**
	 * 联系电话
	 */
	@Schema(description = "联系电话")
	private String phone;

	/**
	 * 交通说明
	 */
	@Schema(description = "交通说明")
	private String traffic;

	/**
	 * 到店指引页面地址
	 */
	@Schema(description = "到店指引页面地址")
	private String venueGuideUrl;

	/**
	 * 座位是否有使用时长限制：true-是 false-否
	 */
	@Schema(description = "座位是否有使用时长限制：true-是 false-否")
	private Boolean timeLimit;

	/**
	 * WiFi 名称
	 */
	@Schema(description = "WiFi 名称")
	private String wifiName;

	/**
	 * WiFi 密码
	 */
	@Schema(description = "WiFi 密码")
	private String wifiPwd;

	/**
	 * 门店区域列表（扫码签到场景下为空）
	 */
	@Schema(description = "门店区域列表（扫码签到场景下为空）")
	private List<StudySeatAreaResp> venueAreaList;

	/**
	 * 门店详情地图上的设备图标（仅预约门店详情接口返回）
	 */
	@Schema(description = "门店详情地图上的设备图标（仅预约门店详情接口返回）")
	private List<StudyVenueDeviceResp> deviceList;

	/**
	 * 门店房间介绍（仅预约门店详情接口返回）
	 */
	@Schema(description = "门店房间介绍（仅预约门店详情接口返回）")
	private List<StudyVenueRoomResp> roomList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public BigDecimal getVenueLat() {
		return venueLat;
	}

	public void setVenueLat(BigDecimal venueLat) {
		this.venueLat = venueLat;
	}

	public BigDecimal getVenueLng() {
		return venueLng;
	}

	public void setVenueLng(BigDecimal venueLng) {
		this.venueLng = venueLng;
	}

	public String getVenueOpenTime() {
		return venueOpenTime;
	}

	public void setVenueOpenTime(String venueOpenTime) {
		this.venueOpenTime = venueOpenTime;
	}

	public Integer getVenueReserveState() {
		return venueReserveState;
	}

	public void setVenueReserveState(Integer venueReserveState) {
		this.venueReserveState = venueReserveState;
	}

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	public String getDistanceStr() {
		return distanceStr;
	}

	public void setDistanceStr(String distanceStr) {
		this.distanceStr = distanceStr;
	}

	public List<StudyFileResp> getVenueImgPathList() {
		return venueImgPathList;
	}

	public void setVenueImgPathList(List<StudyFileResp> venueImgPathList) {
		this.venueImgPathList = venueImgPathList;
	}

	public String getBackImage() {
		return backImage;
	}

	public void setBackImage(String backImage) {
		this.backImage = backImage;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getVenueGuideUrl() {
		return venueGuideUrl;
	}

	public void setVenueGuideUrl(String venueGuideUrl) {
		this.venueGuideUrl = venueGuideUrl;
	}

	public Boolean getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(Boolean timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getWifiName() {
		return wifiName;
	}

	public void setWifiName(String wifiName) {
		this.wifiName = wifiName;
	}

	public String getWifiPwd() {
		return wifiPwd;
	}

	public void setWifiPwd(String wifiPwd) {
		this.wifiPwd = wifiPwd;
	}

	public List<StudySeatAreaResp> getVenueAreaList() {
		return venueAreaList;
	}

	public void setVenueAreaList(List<StudySeatAreaResp> venueAreaList) {
		this.venueAreaList = venueAreaList;
	}

	public List<StudyVenueDeviceResp> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<StudyVenueDeviceResp> deviceList) {
		this.deviceList = deviceList;
	}

	public List<StudyVenueRoomResp> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<StudyVenueRoomResp> roomList) {
		this.roomList = roomList;
	}

}
