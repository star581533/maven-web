//http://www.journaldev.com/3229/primefaces-fileupload-component-example-tutorial

//http://hank20.blogspot.tw/2013/03/jsfprimefaces.html try it
package com.iisi.web.input;

import javax.faces.bean.SessionScoped;
 

import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Controller;
 
@Controller
@SessionScoped
public class FileUploadManagedBean {
    UploadedFile file;
 
    public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }
 
    public String dummyAction(){
    	if(file != null) {
    		System.out.println("Uploaded File Name Is :: "+file.getFileName()+" :: Uploaded File Size :: "+file.getSize());
        }  	
        
        return "";
    }
}