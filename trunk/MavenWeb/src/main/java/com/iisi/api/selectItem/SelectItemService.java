package com.iisi.api.selectItem;

import java.util.List;

public interface SelectItemService {
	public List<?> getItems(String category, Class clazz);
}
