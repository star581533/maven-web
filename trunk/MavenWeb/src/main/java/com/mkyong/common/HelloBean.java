//http://www.mkyong.com/jsf2/jsf-2-0-hello-world-example/
package com.mkyong.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
 
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String name;
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}