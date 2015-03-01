package com.iisi.api.user;

import java.util.List;

import com.iisi.api.model.User;

public interface UserDAO<T> {
	
	public User getUser(List<T> params, String sql);
}
