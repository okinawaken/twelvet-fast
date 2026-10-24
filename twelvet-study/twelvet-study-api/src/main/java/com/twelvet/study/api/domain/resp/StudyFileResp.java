package com.twelvet.study.api.domain.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 文件信息
 */
@Schema(description = "文件信息")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudyFileResp implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 文件标识
	 */
	@Schema(description = "文件标识")
	private String fileKey;

	/**
	 * 文件地址
	 */
	@Schema(description = "文件地址")
	private String fileUrl;

	/**
	 * 文件名称
	 */
	@Schema(description = "文件名称")
	private String fileName;

	public String getFileKey() {
		return fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
