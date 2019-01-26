package com.jxtb.manager.entity.sys;


import java.util.Date;


/**
 *  角色菜单
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysRoleMenu {

	private Long id;
	
	private Long roleId;
	
	private Long menuCode;
	
	private String creator;
	
	private Date createTime;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public Long getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(Long menuCode) {
		this.menuCode = menuCode;
	}
	
	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
