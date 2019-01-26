package com.jxtb.manager.entity.sys;


import java.util.Date;


/**
 * 登录日志
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysLoginLog {

	private Long id;
	
	private Long systemCode;
	
	private String loginName;
	
	private Date loginTime;
	
	private String loginIp;
	
	private String loginInfo;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getSystemCode() {
		return this.systemCode;
	}

	public void setSystemCode(Long systemCode) {
		this.systemCode = systemCode;
	}
	
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	
	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	
	public String getLoginInfo() {
		return this.loginInfo;
	}

	public void setLoginInfo(String loginInfo) {
		this.loginInfo = loginInfo;
	}
	
}
