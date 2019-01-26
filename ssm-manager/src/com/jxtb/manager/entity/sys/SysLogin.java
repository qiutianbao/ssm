package com.jxtb.manager.entity.sys;

import java.util.Date;

/**
 *  系统登录
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysLogin {

    private Long id;

    private String loginName;      //登录名

    private String loginPwd;     //登录密码

    private Integer userType;     //用户类型

    private Long roleId;       //角色id

    private Integer isDelete;   //是否可用 0-用户可用 1-用户不可用 2-无效状态

    private Integer tryNum;   //密码输出次数

    private Date startDate;   //用户开始日期

    private Date endDate;   //用户结束日期

    private Date createTime;      //创建时间

    private Date modifyTime;      //修改时间

    private Date loginTime;      //当前登陆时间

    private Date lastLoginTime;      //上次登录时间


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getDelete() {
        return isDelete;
    }

    public void setDelete(Integer delete) {
        isDelete = delete;
    }

    public Integer getTryNum() {
        return tryNum;
    }

    public void setTryNum(Integer tryNum) {
        this.tryNum = tryNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
