package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 套餐筛选项响应
 */
@Schema(description = "套餐筛选项响应")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyPackageOptionResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 套餐购买页标识
	 */
	@Schema(description = "套餐购买页标识")
	private String packageBuyHtml;

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
	 * 套餐类型列表
	 */
	@Schema(description = "套餐类型列表")
	private List<StudyOptionResp> packageTypeList;

	/**
	 * 套餐标签列表
	 */
	@Schema(description = "套餐标签列表")
	private List<StudyOptionResp> packageLabelList;

	/**
	 * 按月计费套餐的座位类型标签
	 */
	@Schema(description = "按月计费套餐的座位类型标签")
	private List<StudyOptionResp> packageLabelListOfType2;

	/**
	 * 门店列表
	 */
	@Schema(description = "门店列表")
	private List<StudyOptionResp> venueList;

	public String getPackageBuyHtml() {
		return packageBuyHtml;
	}

	public void setPackageBuyHtml(String packageBuyHtml) {
		this.packageBuyHtml = packageBuyHtml;
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

	public List<StudyOptionResp> getPackageTypeList() {
		return packageTypeList;
	}

	public void setPackageTypeList(List<StudyOptionResp> packageTypeList) {
		this.packageTypeList = packageTypeList;
	}

	public List<StudyOptionResp> getPackageLabelList() {
		return packageLabelList;
	}

	public void setPackageLabelList(List<StudyOptionResp> packageLabelList) {
		this.packageLabelList = packageLabelList;
	}

	public List<StudyOptionResp> getPackageLabelListOfType2() {
		return packageLabelListOfType2;
	}

	public void setPackageLabelListOfType2(List<StudyOptionResp> packageLabelListOfType2) {
		this.packageLabelListOfType2 = packageLabelListOfType2;
	}

	public List<StudyOptionResp> getVenueList() {
		return venueList;
	}

	public void setVenueList(List<StudyOptionResp> venueList) {
		this.venueList = venueList;
	}

}
