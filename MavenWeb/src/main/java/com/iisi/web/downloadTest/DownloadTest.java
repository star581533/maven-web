package com.iisi.web.downloadTest;

import java.io.InputStream;

import javax.faces.bean.ViewScoped;
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
		InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/resources/demo/images/optimus.jpg");
		file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus.jpg");
	}
	
	public StreamedContent getFile() {
		return file;
	}

	public void setFile(StreamedContent file) {
		this.file = file;
	}
}
