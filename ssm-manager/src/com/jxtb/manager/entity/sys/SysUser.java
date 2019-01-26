package com.jxtb.manager.entity.sys;


import java.util.Date;


/**
 *   系统用户
 * @author jxtb
 * @version 1.0
 * @date Nov 28, 2016
 */
public class SysUser {

	private Long userId;     //用户id,关联SysLogin的id

	private String userName;  //用户姓名
	
	private String mobilePhone;     //手机号码
	
	private String telPhone;    //电话
	
	private String email;    //邮箱
	
	private Long deptId;    //部门
	
	private Date createTime;  //创建时间
	
	private Date modifyTime;   //修改时间

    private String cardId;  //身份证号码

    private Integer gender;  //性别：1男  2女

    private String nickName;  //昵称

    private Integer isDelete;  //是否可用 0-用户可用 1-用户不可用 2-无效状态

    private String personAvatar;    //个人头像图片存放路径

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
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

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getDelete() {
        return isDelete;
    }

    public void setDelete(Integer delete) {
        isDelete = delete;
    }

    public String getPersonAvatar() {
        return personAvatar;
    }

    public void setPersonAvatar(String personAvatar) {
        this.personAvatar = personAvatar;
    }
}
