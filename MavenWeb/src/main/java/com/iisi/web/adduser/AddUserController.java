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

@ManagedBean
@SessionScoped
public class AddUserController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	private String office;
    private Map<String,String> officeAll;
	
	@PostConstruct
	public void init(){
		
	}
	
	public void doSave(){
		
		
	}
	
	private void verifyData(){
		
	}
		

	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Map<String, String> getOfficeAll() {
		return officeAll;
	}

	public void setOfficeAll(Map<String, String> officeAll) {
		this.officeAll = officeAll;
	}
	
	
}
