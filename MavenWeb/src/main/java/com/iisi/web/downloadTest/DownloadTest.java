package com.iisi.web.downloadTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.stereotype.Controller;

@Controller
@ViewScoped
public class DownloadTest {

	private StreamedContent file;

	public DownloadTest(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		String directory = externalContext.getInitParameter("uploadDirectory")+ File.separator + "temp/";
		
//		InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/resources/demo/images/optimus.jpg");
		
		try {
			InputStream stream = new FileInputStream(new File(directory, "test.jpg"));
			file = new DefaultStreamedContent(stream, "image/jpg", "test.jpg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public StreamedContent getFile() {
		return file;
	}

	public void setFile(StreamedContent file) {
		this.file = file;
	}
}
