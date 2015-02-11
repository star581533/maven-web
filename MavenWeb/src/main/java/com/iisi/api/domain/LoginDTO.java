package com.iisi.api.domain;

public class LoginDTO {
	private String userId;
	
	private String password;

	private boolean checkLogin;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isCheckLogin() {
		return checkLogin;
	}

	public void setCheckLogin(boolean checkLogin) {
		this.checkLogin = checkLogin;
	}
	
	
}
