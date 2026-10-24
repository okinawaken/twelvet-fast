package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 柜子租用订单
 */
@Schema(description = "柜子租用订单")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyCabinetOrderResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 租用记录ID，续租支付时作为 leaseId 回传
	 */
	@Schema(description = "租用记录ID，续租支付时作为 leaseId 回传")
	private Long id;

	/**
	 * 订单名称
	 */
	@Schema(description = "订单名称")
	private String name;

	/**
	 * 门店名称
	 */
	@Schema(description = "门店名称")
	private String venueName;

	/**
	 * 柜子名称
	 */
	@Schema(description = "柜子名称")
	private String cabinetName;

	/**
	 * 柜格编号
	 */
	@Schema(description = "柜格编号")
	private String gridName;

	/**
	 * 租用开始时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "租用开始时间 yyyy-MM-dd HH:mm:ss")
	private String leaseStartTime;

	/**
	 * 租用结束时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "租用结束时间 yyyy-MM-dd HH:mm:ss")
	private String leaseEndTime;

	/**
	 * 支付截止时间 yyyy-MM-dd HH:mm:ss，超时订单关闭
	 */
	@Schema(description = "支付截止时间 yyyy-MM-dd HH:mm:ss，超时订单关闭")
	private String payEndTime;

	/**
	 * 支付状态：30-支付成功 10-待支付 -10-订单关闭
	 */
	@Schema(description = "支付状态：30-支付成功 10-待支付 -10-订单关闭")
	private Integer payStatus;

	/**
	 * 租用金额（元）
	 */
	@Schema(description = "租用金额（元）")
	private BigDecimal leaseAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getCabinetName() {
		return cabinetName;
	}

	public void setCabinetName(String cabinetName) {
		this.cabinetName = cabinetName;
	}

	public String getGridName() {
		return gridName;
	}

	public void setGridName(String gridName) {
		this.gridName = gridName;
	}

	public String getLeaseStartTime() {
		return leaseStartTime;
	}

	public void setLeaseStartTime(String leaseStartTime) {
		this.leaseStartTime = leaseStartTime;
	}

	public String getLeaseEndTime() {
		return leaseEndTime;
	}

	public void setLeaseEndTime(String leaseEndTime) {
		this.leaseEndTime = leaseEndTime;
	}

	public String getPayEndTime() {
		return payEndTime;
	}

	public void setPayEndTime(String payEndTime) {
		this.payEndTime = payEndTime;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public BigDecimal getLeaseAmount() {
		return leaseAmount;
	}

	public void setLeaseAmount(BigDecimal leaseAmount) {
		this.leaseAmount = leaseAmount;
	}

}
