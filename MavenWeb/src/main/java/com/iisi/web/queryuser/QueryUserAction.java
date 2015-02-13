//http://www.mkyong.com/jsf2/jsf-2-dropdown-box-example/
package com.iisi.web.queryuser;

import java.io.Serializable;



import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.iisi.api.menu.service.MenuService;



@ManagedBean
@SessionScoped
public class QueryUserAction  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
					
		
	@PostConstruct
	public void init(){

	}
	
		
	public void queryButton(){
		
	}
	
	public void userDataLink(ActionEvent event){

	}
		
	private void verifyData(){
		
	}
	
	public String userForward(){
		return MenuService.UPDATE_USER;
	}
		
}
