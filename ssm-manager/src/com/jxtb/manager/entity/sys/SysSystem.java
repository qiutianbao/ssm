package com.jxtb.manager.entity.sys;

/**
 *
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysSystem {

	private Long id;
	
	private Long systemCode;
	
	private String systemName;
	
	private String systemMemo;
	
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
	
	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	
	public String getSystemMemo() {
		return this.systemMemo;
	}

	public void setSystemMemo(String systemMemo) {
		this.systemMemo = systemMemo;
	}
	
}
