//http://www.mkyong.com/jsf2/jsf-2-0-spring-hibernate-integration-example/

package com.iisi.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.iisi.api.domain.LoginDTO;
import com.iisi.api.login.LoginService;

@ManagedBean
@RequestScoped
public class LoginController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;
	
	private String password;
	private LoginDTO dto;
	
	private String message;	
	
	@PostConstruct
	public void init(){
		dto = new LoginDTO();
	}
	
	public String loginButton(){	
		return null;
	}
		
	/**
	 * 執行資料驗證
	 * @throws FileUploadException 
	 */
	private void verify() {
		
	}
	
	public void cancelButton(){
		dto = new LoginDTO();
	}

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

	public LoginDTO getDto() {
		return dto;
	}

	public void setDto(LoginDTO dto) {
		this.dto = dto;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
