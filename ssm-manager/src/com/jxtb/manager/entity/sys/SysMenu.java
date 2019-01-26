package com.jxtb.manager.entity.sys;

/**
 * 菜单
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysMenu {

	private Long id;
	
	private Long systemCode;
	
	private Long menuCode;
	
	private Long parentCode;
	
	private String menuName;
	
	private String menuLink;
	
	private String frameName;
	
	private Integer showOrder;
	
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
	
	public Long getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(Long menuCode) {
		this.menuCode = menuCode;
	}
	
	public Long getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(Long parentCode) {
		this.parentCode = parentCode;
	}
	
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	public String getMenuLink() {
		return this.menuLink;
	}

	public void setMenuLink(String menuLink) {
		this.menuLink = menuLink;
	}
	
	public String getFrameName() {
		return this.frameName;
	}

	public void setFrameName(String frameName) {
		this.frameName = frameName;
	}
	
	public Integer getShowOrder() {
		return this.showOrder;
	}

	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}
	
}
