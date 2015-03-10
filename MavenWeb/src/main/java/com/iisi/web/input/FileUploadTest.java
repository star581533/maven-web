//http://www.journaldev.com/3229/primefaces-fileupload-component-example-tutorial

//http://hank20.blogspot.tw/2013/03/jsfprimefaces.html try it
package com.iisi.web.input;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 



import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Controller;
 
@Controller
@SessionScoped
public class FileUploadTest {
	
    private UploadedFile uploadedFile;
 
    @PostConstruct
    public void init(){
    	
    }
     
    public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	
	public void handleFileUpload(FileUploadEvent event){		
		FacesContext context = FacesContext.getCurrentInstance();
		File filesDir = new File(context.getExternalContext().getRealPath("/") + "temp/");
		System.out.println("filesDir.getPath() = " + filesDir.getPath());
		
		if(!filesDir.exists()){
			filesDir.mkdir();
		}else{
			for(File f: filesDir.listFiles()){
				f.delete();
			}
		}
		
		UploadedFile uploadFile = event.getFile();
		String fileName = uploadFile.getFileName();
		String serverName = UUID.randomUUID().toString() + fileName.substring(fileName.lastIndexOf('.'));
		
		try{
			OutputStream outputStream = new FileOutputStream(new File(filesDir, serverName));
			byte[] b = new byte[1024];
			int len = 0;
			while((len = uploadFile.getInputstream().read(b)) > 0){
				outputStream.write(b, 0, len);
			}		
			outputStream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	//OK
	public void submit(){
		System.out.println("Uploaded file name = " + uploadedFile.getFileName());
		System.out.println("Uploaded file size = " + uploadedFile.getSize());
		
		FacesContext context = FacesContext.getCurrentInstance();
		File filesDir = new File(context.getExternalContext().getRealPath("/") + "temp/");
		System.out.println("filesDir.getPath() = " + filesDir.getPath());
		
		if(!filesDir.exists()){
			filesDir.mkdir();
		}else{
			for(File f: filesDir.listFiles()){
				f.delete();
			}
		}
		
		
		String fileName = uploadedFile.getFileName();
		String serverName = UUID.randomUUID().toString() + fileName.substring(fileName.lastIndexOf('.'));
		
		try{
			OutputStream outputStream = new FileOutputStream(new File(filesDir, serverName));
			outputStream.write(uploadedFile.getContents());	
			outputStream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
//	public void submit(FileUploadEvent event){
//		System.out.println("Uploaded file name = " + uploadedFile.getFileName());
//		System.out.println("Uploaded file size = " + uploadedFile.getSize());
//		
//		FacesContext context = FacesContext.getCurrentInstance();
//		File filesDir = new File(context.getExternalContext().getRealPath("/") + "temp/");
//		System.out.println("filesDir.getPath() = " + filesDir.getPath());
//		
//		if(!filesDir.exists()){
//			filesDir.mkdir();
//		}else{
//			for(File f: filesDir.listFiles()){
//				f.delete();
//			}
//		}
//		
//		UploadedFile uploadFile = event.getFile();
//		long fileSize = uploadFile.getSize();
//		String fileName = uploadFile.getFileName();
//		String serverName = UUID.randomUUID().toString() + fileName.substring(fileName.lastIndexOf('.'));
//		
//		try{
//			OutputStream outputStream = new FileOutputStream(new File(filesDir, serverName));
//			byte[] b = new byte[1024];
//			int len = 0;
//			while((len = uploadFile.getInputstream().read(b)) > 0){
//				outputStream.write(b, 0, len);
//			}		
//			outputStream.close();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
	


//	public void dummyAction(FileUploadEvent event){
//    	System.out.println("upload file start");
//    	byte[] bytes = event.getFile().getContents(); 
//    		System.out.println("Uploaded File Name Is :: "+event.getFile().getFileName()+" :: Uploaded File Size :: "+ bytes.length);
//    }
}