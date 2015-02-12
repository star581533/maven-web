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
		
		DefaultSubMenu fileMenu = new DefaultSubMenu("�ɮ׳B�z");
		
		DefaultMenuItem item = new DefaultMenuItem("�ɮפW��");
		item.setCommand("#{menuAction.fileUpload}");
		item.setIcon("ui-icon-disk");
		item.setAjax(false);
		fileMenu.addElement(item);
		
		item = new DefaultMenuItem("�ɮ׬d��");
		item.setCommand("#{menuAction.fileQuery}");
		item.setIcon("ui-icon-search");
		fileMenu.addElement(item);
		
		item = new DefaultMenuItem("�ɮקR��");
		item.setCommand("#{menuAction.fileDelete}");
		item.setIcon("ui-icon-close");
		fileMenu.addElement(item);
		
		model.addElement(fileMenu);	
		
		DefaultSubMenu accountMenu = new DefaultSubMenu("�b���޲z");
		item = new DefaultMenuItem("�K�X�ק�");
		item.setCommand("#{menuAction.updatePwd}");
		item.setIcon("ui-icon-arrowrefresh-1-w");
		accountMenu.addElement(item);
		
		item = new DefaultMenuItem("�s�W�ϥΪ�");
		item.setCommand("#{menuAction.addUser}");
		item.setIcon("ui-icon-disk");
		accountMenu.addElement(item);
		
		item = new DefaultMenuItem("�b���d��");
		item.setCommand("#{menuAction.queryUser}");
		item.setIcon("ui-icon-search");
		accountMenu.addElement(item);
		
		model.addElement(accountMenu);
		
		DefaultSubMenu logQueryMenu = new DefaultSubMenu("�����d��");
		item = new DefaultMenuItem("ñ��/ñ�h�����d��");
		item.setCommand("#{menuAction.loginLogQuery}");
		item.setIcon("ui-icon-search");
		logQueryMenu.addElement(item);
		
		item = new DefaultMenuItem("�ާ@�����d��");
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
