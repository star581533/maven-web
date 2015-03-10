//http://www.journaldev.com/3229/primefaces-fileupload-component-example-tutorial
package com.iisi.web.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Controller;


@Controller
@SessionScoped
public class FileUploadController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init(){

	}
	
	public void uploadData(){
		
	}
	
	private void verifyData(){
			
	}
	
	private boolean verifyString(String str){
		boolean rtnBool = false;
		
		if(null == str || str.length() == 0){
			rtnBool = true;
		}		
		return rtnBool;
	}
}
