//http://www.journaldev.com/3229/primefaces-fileupload-component-example-tutorial

//http://hank20.blogspot.tw/2013/03/jsfprimefaces.html try it
package com.iisi.web.input;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 



import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Controller;
 
@Controller
@SessionScoped
public class FileUploadManagedBean {
	
    private UploadedFile uploadedFile;
 
    public FileUploadManagedBean(){}
     
    public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	
	public void handleFileUpload(FileUploadEvent event){
		UploadedFile file = event.getFile();
		System.out.println("Uploaded:" + event.getFile().getFileName());
		
	}
	
	//OK
	public void submit(){
		System.out.println("Uploaded file name = " + uploadedFile.getFileName());
		System.out.println("Uploaded file size = " + uploadedFile.getSize());
	}
	


//	public void dummyAction(FileUploadEvent event){
//    	System.out.println("upload file start");
//    	byte[] bytes = event.getFile().getContents(); 
//    		System.out.println("Uploaded File Name Is :: "+event.getFile().getFileName()+" :: Uploaded File Size :: "+ bytes.length);
//    }
}