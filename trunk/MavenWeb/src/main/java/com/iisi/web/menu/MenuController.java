package com.iisi.web.menu;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean
public class MenuController {
	
	private MenuModel model;
	
	final private String ADD_USER = "addUser";
	
	final private String FILE_DELETE = "fileDelete";
	
	final private String FILE_QUERY = "fileQuery";
	
	final private String FILE_UP_LOAD = "fileUpload";
	
	final private String LOGIN_LOG_QUERY = "loginLogQuery";
	
	final private String OPERATION_LOG_QUERY = "operationLogQuery";
	
	final private String QUERY_USER = "queryUser";
	
	final private String UPDATE_PWD = "updatePwd";
	
	final private String UPDATE_USER = "updateUser";
	
	@PostConstruct
	public void init(){
		model = new DefaultMenuModel();
		
		DefaultSubMenu fileMenu = new DefaultSubMenu("檔案處理");
		
		DefaultMenuItem item = new DefaultMenuItem("檔案上傳");
		item.setCommand("#{menuAction.fileUpload}");
		item.setIcon("ui-icon-disk");
		item.setAjax(false);
		fileMenu.addElement(item);
		
		item = new DefaultMenuItem("檔案查詢");
		item.setCommand("#{menuAction.fileQuery}");
		item.setIcon("ui-icon-search");
		fileMenu.addElement(item);
		
		item = new DefaultMenuItem("檔案刪除");
		item.setCommand("#{menuAction.fileDelete}");
		item.setIcon("ui-icon-close");
		fileMenu.addElement(item);
		
		model.addElement(fileMenu);	
		
		DefaultSubMenu accountMenu = new DefaultSubMenu("帳號管理");
		item = new DefaultMenuItem("密碼修改");
		item.setCommand("#{menuAction.updatePwd}");
		item.setIcon("ui-icon-arrowrefresh-1-w");
		accountMenu.addElement(item);
		
		item = new DefaultMenuItem("新增使用者");
		item.setCommand("#{menuAction.addUser}");
		item.setIcon("ui-icon-disk");
		accountMenu.addElement(item);
		
		item = new DefaultMenuItem("帳號查詢");
		item.setCommand("#{menuAction.queryUser}");
		item.setIcon("ui-icon-search");
		accountMenu.addElement(item);
		
		model.addElement(accountMenu);
		
		DefaultSubMenu logQueryMenu = new DefaultSubMenu("紀錄查詢");
		item = new DefaultMenuItem("簽到/簽退紀錄查詢");
		item.setCommand("#{menuAction.loginLogQuery}");
		item.setIcon("ui-icon-search");
		logQueryMenu.addElement(item);
		
		item = new DefaultMenuItem("操作紀錄查詢");
		item.setCommand("#{menuAction.operationLogQuery}");
		item.setIcon("ui-icon-search");
		logQueryMenu.addElement(item);
		
		model.addElement(logQueryMenu);
	}
	
	public String addUser(){
		return this.ADD_USER;
	}
	
	public String fileDelete(){
		return this.FILE_DELETE;
	}
	
	public String fileQuery(){
		return this.FILE_QUERY;
	}
	
	public String fileUpload(){
		System.out.println("fileUpload");
		return this.FILE_UP_LOAD;
	}
	
	public String loginLogQuery(){
		return this.LOGIN_LOG_QUERY;
	}
	
	public String operationLogQuery(){
		return this.OPERATION_LOG_QUERY;
	}
	
	public String queryUser(){
		return this.QUERY_USER;
	}
	
	public String updatePwd(){
		return this.UPDATE_PWD;
	}
	
	public String updateUser(){
		return this.UPDATE_USER;
	}
	
	public MenuModel getModel() {
		return model;
	}

	public void setModel(MenuModel model) {
		this.model = model;
	}
}
