//http://www.mkyong.com/jsf2/jsf-2-0-spring-hibernate-integration-example/

package com.iisi.web.login;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Controller;

import com.iisi.api.domain.LoginDTO;
import com.iisi.api.login.LoginService;

@Controller
@RequestScoped
public class LoginController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LoginDTO dto;
	
	private String message;	
	
	@PostConstruct
	public void init(){
		dto = new LoginDTO();
	}
	
	public String loginButton(){	
		
		if(dto.getUserId().equals("Alex")){
			return "index.xhtml?faces-redirect=true";
		}else{
			return null;
		}		
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
