package com.jxtb.manager.entity.sys;


import java.util.Date;


/**
 *
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysOperateHistory {

	private Long id;
	
	private String operateLoginName;
	
	private Date operateTime;
	
	private Long systemCode;
	
	private Long menuCode;
	
	private Long objectId;
	
	private Integer operateType;
	
	private Integer operateResult;
	
	private String operateContent;
	
	private String pageUrl;
	
	private String pageUri;
	
	private String refererUrl;
	
	private String operatorIp;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getOperateLoginName() {
		return this.operateLoginName;
	}

	public void setOperateLoginName(String operateLoginName) {
		this.operateLoginName = operateLoginName;
	}
	
	public Date getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	
	public Long getSystemCode() {
		return this.systemCode;
	}

	public void setSystemCode(Long systemCode) {
		this.systemCode = systemCode;
	}
	
	public Long getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(Long menuCode) {
		this.menuCode = menuCode;
	}
	
	public Long getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}
	
	public Integer getOperateType() {
		return this.operateType;
	}

	public void setOperateType(Integer operateType) {
		this.operateType = operateType;
	}
	
	public Integer getOperateResult() {
		return this.operateResult;
	}

	public void setOperateResult(Integer operateResult) {
		this.operateResult = operateResult;
	}
	
	public String getOperateContent() {
		return this.operateContent;
	}

	public void setOperateContent(String operateContent) {
		this.operateContent = operateContent;
	}
	
	public String getPageUrl() {
		return this.pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	
	public String getPageUri() {
		return this.pageUri;
	}

	public void setPageUri(String pageUri) {
		this.pageUri = pageUri;
	}
	
	public String getRefererUrl() {
		return this.refererUrl;
	}

	public void setRefererUrl(String refererUrl) {
		this.refererUrl = refererUrl;
	}
	
	public String getOperatorIp() {
		return this.operatorIp;
	}

	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
	}
	
}
