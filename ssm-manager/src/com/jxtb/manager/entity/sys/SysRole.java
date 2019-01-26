package com.jxtb.manager.entity.sys;


import java.util.Date;


/**
 *  角色
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysRole {

	private Long id;
	
	private Long systemCode;
	
	private String roleName;
	
	private String roleMemo;
	
	private String creator;
	
	private Date createTime;
	
	private String modifier;
	
	private Date modifyTime;
	
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
	
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRoleMemo() {
		return this.roleMemo;
	}

	public void setRoleMemo(String roleMemo) {
		this.roleMemo = roleMemo;
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
	
	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	
	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
}
