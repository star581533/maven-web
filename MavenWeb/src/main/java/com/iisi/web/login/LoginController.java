//http://www.mkyong.com/jsf2/jsf-2-0-spring-hibernate-integration-example/

package com.iisi.web.login;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.iisi.api.constant.ConstantObject;
import com.iisi.api.domain.LoginDTO;
import com.iisi.api.execption.FileSysException;
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
	
	@Autowired
	private LoginService loginService;
	
	@PostConstruct
	public void init(){
		dto = new LoginDTO();
	}
	
	public String loginButton(){	
		
		this.verify();
		
		if(dto.getUserId().equals(dto.getUser().getUserId())){
			return "index.xhtml?faces-redirect=true";
		}else{
			return null;
		}		
	}
		
	/**
	 * ����������
	 * @throws FileUploadException 
	 */
	private void verify() {
		try{
			FacesContext context = FacesContext.getCurrentInstance();
			//�ˮ֨ϥΪ̱b��
			if(null == dto.getUserId() || dto.getUserId().length() == 0){
				context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, ConstantObject.INPUT_DATA, ConstantObject.WARN_MSG_USER_ID));
				throw new FileSysException(ConstantObject.WARN_MSG_USER_ID);
			}
			//�ˮ֨ϥΪ̱K�X
			if(null == dto.getPassword() || dto.getPassword().length() == 0){
				context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, ConstantObject.INPUT_DATA, ConstantObject.WARN_MSG_USER_PWD));
				throw new FileSysException(ConstantObject.WARN_MSG_USER_PWD);
			}
						
			this.loginService.queryUser(dto);
			
			if(!dto.isCheckLogin()){
				if(null == dto.getUser()){
					context.addMessage("Error", new FacesMessage(FacesMessage.SEVERITY_ERROR, ConstantObject.INPUT_DATA, ConstantObject.WARN_MSG_USER_ERR));
					throw new FileSysException(ConstantObject.WARN_MSG_USER_ERR);
				}else{					
					context.addMessage("Error", new FacesMessage(FacesMessage.SEVERITY_ERROR, ConstantObject.INPUT_DATA, ConstantObject.WARN_MSG_USER_PWD_ERR));
					throw new FileSysException(ConstantObject.WARN_MSG_USER_PWD_ERR);
				}
			}			
		}catch(FileSysException e){
		}
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
