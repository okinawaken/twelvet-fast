package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 报修记录
 */
@Schema(description = "报修记录")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyRepairResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 报修记录ID
	 */
	@Schema(description = "报修记录ID")
	private Long id;

	/**
	 * 门店名称
	 */
	@Schema(description = "门店名称")
	private String venueName;

	/**
	 * 报修描述
	 */
	@Schema(description = "报修描述")
	private String repairDesc;

	/**
	 * 报修图片
	 */
	@Schema(description = "报修图片")
	private List<StudyFileResp> repairImgList;

	/**
	 * 处理状态
	 */
	@Schema(description = "处理状态")
	private Integer handleState;

	/**
	 * 处理备注
	 */
	@Schema(description = "处理备注")
	private String handleRemark;

	/**
	 * 处理时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "处理时间 yyyy-MM-dd HH:mm:ss")
	private String handleTimeStr;

	/**
	 * 提交时间 yyyy-MM-dd HH:mm:ss
	 */
	@Schema(description = "提交时间 yyyy-MM-dd HH:mm:ss")
	private String createTimeStr;

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

	public String getRepairDesc() {
		return repairDesc;
	}

	public void setRepairDesc(String repairDesc) {
		this.repairDesc = repairDesc;
	}

	public List<StudyFileResp> getRepairImgList() {
		return repairImgList;
	}

	public void setRepairImgList(List<StudyFileResp> repairImgList) {
		this.repairImgList = repairImgList;
	}

	public Integer getHandleState() {
		return handleState;
	}

	public void setHandleState(Integer handleState) {
		this.handleState = handleState;
	}

	public String getHandleRemark() {
		return handleRemark;
	}

	public void setHandleRemark(String handleRemark) {
		this.handleRemark = handleRemark;
	}

	public String getHandleTimeStr() {
		return handleTimeStr;
	}

	public void setHandleTimeStr(String handleTimeStr) {
		this.handleTimeStr = handleTimeStr;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

}
