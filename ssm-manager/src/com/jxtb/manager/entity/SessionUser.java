package com.jxtb.manager.entity;

import com.jxtb.manager.entity.sys.*;

import java.util.List;

/**
 *
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SessionUser {

    private SysLogin sysLogin;

    private SysUser sysUser;

    private List<SysLogin> sysLoginList;

    private List<SysUser> sysUserList;

    private List<SysRole> roleList;

    private List<SysMenu> menuList;

    private List<SysRights> rightsList;

    public SysLogin getSysLogin() {
        return sysLogin;
    }

    public void setSysLogin(SysLogin sysLogin) {
        this.sysLogin = sysLogin;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public List<SysLogin> getSysLoginList() {
        return sysLoginList;
    }

    public void setSysLoginList(List<SysLogin> sysLoginList) {
        this.sysLoginList = sysLoginList;
    }

    public List<SysUser> getSysUserList() {
        return sysUserList;
    }

    public void setSysUserList(List<SysUser> sysUserList) {
        this.sysUserList = sysUserList;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public List<SysMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<SysMenu> menuList) {
        this.menuList = menuList;
    }

    public List<SysRights> getRightsList() {
        return rightsList;
    }

    public void setRightsList(List<SysRights> rightsList) {
        this.rightsList = rightsList;
    }
}
