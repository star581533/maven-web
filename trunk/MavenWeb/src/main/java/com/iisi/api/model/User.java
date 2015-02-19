package com.iisi.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@IdClass(UserPK.class)
@Entity
@Table(name = "user")
public class User implements Serializable{
	
	/**
	 * �إߤ��
	 */
	private String createDate;
	
	/**
	 * �إ߮ɶ�
	 */
	private String createTime;
	
	/**
	 * �K�X���~��J����
	 */
	private String loginFail;
	
	/**
	 * ���N��
	 */
	private String officeId;
	
	/**
	 * �v���N��
	 */
	private String roleId;
	
	/**
	 * �b¾���A
	 */
	private String state;
	
	/**
	 * �ϥΪ̱b��
	 */
	private String userId;
	
	/**
	 * �ϥΪ̩m�W
	 */
	private String userName;
	
	/**
	 * �ϥΪ̱K�X
	 */
	private String userPwd;

	@Id
	@Column(name="officeid", unique=false, nullable=false, length=3)
	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	@Id
	@Column(name="userid", unique=false, nullable=false, length=10)
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name="createdate", unique=false, nullable=false, length=7)
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Column(name="createTime", unique=false, nullable=false, length=7)
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name="loginfail", unique=false, nullable=false, length=1)
	public String getLoginFail() {
		return loginFail;
	}

	public void setLoginFail(String loginFail) {
		this.loginFail = loginFail;
	}

	@Column(name="roleid", unique=false, nullable=false, length=1)
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	@Column(name="state", unique=false, nullable=false, length=1)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name="username", unique=false, nullable=false, length=15)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name="userpwd", unique=false, nullable=false, length=32)
	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("createDate = ").append(this.createDate).append(", ");
		sb.append("createTime = ").append(this.createTime).append(", ");
		sb.append("loginFail = ").append(this.loginFail).append(", ");
		sb.append("officeId = ").append(this.officeId).append(", ");
		sb.append("roleId = ").append(this.roleId).append(", ");
		sb.append("state = ").append(this.state).append(", ");
		sb.append("userId = ").append(this.userId).append(", ");
		sb.append("userName = ").append(this.userName).append(", ");
		sb.append("userPwd = ").append(this.userPwd);
		return sb.toString();
	}
}
