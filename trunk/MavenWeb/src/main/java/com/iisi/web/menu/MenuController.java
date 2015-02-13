package com.iisi.web.menu;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import com.iisi.api.menu.service.MenuService;

@ManagedBean
public class MenuController {
	
	private MenuModel model;
		
	@PostConstruct
	public void init(){
		model = new DefaultMenuModel();
		
		DefaultSubMenu fileMenu = new DefaultSubMenu("�ɮ׳B�z");
		
		DefaultMenuItem item = new DefaultMenuItem("�ɮפW��");
		item.setCommand("#{menuController.fileUpload}");
		item.setIcon("ui-icon-disk");
		item.setAjax(false);
		fileMenu.addElement(item);
		
		item = new DefaultMenuItem("�ɮ׬d��");
		item.setCommand("#{menuController.fileQuery}");
		item.setIcon("ui-icon-search");
		fileMenu.addElement(item);
		
		item = new DefaultMenuItem("�ɮקR��");
		item.setCommand("#{menuController.fileDelete}");
		item.setIcon("ui-icon-close");
		fileMenu.addElement(item);
		
		model.addElement(fileMenu);	
		
		DefaultSubMenu accountMenu = new DefaultSubMenu("�b���޲z");
		item = new DefaultMenuItem("�K�X�ק�");
		item.setCommand("#{menuController.updatePwd}");
		item.setIcon("ui-icon-arrowrefresh-1-w");
		accountMenu.addElement(item);
		
		item = new DefaultMenuItem("�s�W�ϥΪ�");
		item.setCommand("#{menuController.addUser}");
		item.setIcon("ui-icon-disk");
		accountMenu.addElement(item);
		
		item = new DefaultMenuItem("�b���d��");
		item.setCommand("#{menuController.queryUser}");
		item.setIcon("ui-icon-search");
		accountMenu.addElement(item);
		
		model.addElement(accountMenu);
		
		DefaultSubMenu logQueryMenu = new DefaultSubMenu("�����d��");
		item = new DefaultMenuItem("ñ��/ñ�h�����d��");
		item.setCommand("#{menuController.loginLogQuery}");
		item.setIcon("ui-icon-search");
		logQueryMenu.addElement(item);
		
		item = new DefaultMenuItem("�ާ@�����d��");
		item.setCommand("#{menuController.operationLogQuery}");
		item.setIcon("ui-icon-search");
		logQueryMenu.addElement(item);
		
		model.addElement(logQueryMenu);
	}
	
	public String addUser(){
		return MenuService.ADD_USER;
	}
	
	public String fileDelete(){
		return MenuService.FILE_DELETE;
	}
	
	public String fileQuery(){
		return MenuService.FILE_QUERY;
	}
	
	public String fileUpload(){
		return MenuService.FILE_UP_LOAD;
	}
	
	public String loginLogQuery(){
		return MenuService.LOGIN_LOG_QUERY;
	}
	
	public String operationLogQuery(){
		return MenuService.OPERATION_LOG_QUERY;
	}
	
	public String queryUser(){
		return MenuService.QUERY_USER;
	}
	
	public String updatePwd(){
		return MenuService.UPDATE_PWD;
	}
	
	public String updateUser(){
		return MenuService.UPDATE_USER;
	}
	
	public MenuModel getModel() {
		return model;
	}

	public void setModel(MenuModel model) {
		this.model = model;
	}
}
