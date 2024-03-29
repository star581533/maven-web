package com.iisi.web.adduser;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



import org.springframework.beans.factory.annotation.Autowired;

import com.iisi.api.domain.AddUserDTO;

@ManagedBean
@SessionScoped
public class AddUserController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AddUserDTO dto;
	
	
	@PostConstruct
	public void init(){
		dto = new AddUserDTO();
	}
	
	public void doSave(){
		
		
	}
	
	private void verifyData(){
		
	}

	public AddUserDTO getDto() {
		return dto;
	}

	public void setDto(AddUserDTO dto) {
		this.dto = dto;
	}
		
}
