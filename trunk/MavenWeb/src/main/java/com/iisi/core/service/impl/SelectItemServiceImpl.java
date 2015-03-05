package com.iisi.core.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.iisi.api.db.DBFactory;
import com.iisi.api.selectItem.SelectItemService;

public class SelectItemServiceImpl implements SelectItemService {

	@Inject
	private DBFactory dbFactory;
	
	@Override
	public List<?> getItems(String category, Class clazz) {
		
		return null;
	}

}
