package com.jxtb.manager.entity.sys;

/**
 *  权限
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysRights {

	private Long id;
	
	private Long menuCode;
	
	private Long rightsCode;
	
	private String rightsName;
	
	private String rightsIntroduction;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(Long menuCode) {
		this.menuCode = menuCode;
	}
	
	public Long getRightsCode() {
		return this.rightsCode;
	}

	public void setRightsCode(Long rightsCode) {
		this.rightsCode = rightsCode;
	}
	
	public String getRightsName() {
		return this.rightsName;
	}

	public void setRightsName(String rightsName) {
		this.rightsName = rightsName;
	}
	
	public String getRightsIntroduction() {
		return this.rightsIntroduction;
	}

	public void setRightsIntroduction(String rightsIntroduction) {
		this.rightsIntroduction = rightsIntroduction;
	}
	
}
