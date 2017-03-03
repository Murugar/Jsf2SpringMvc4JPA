package com.iqmsoft.spring.mvc.jsf.services;

import java.util.List;

import com.iqmsoft.spring.mvc.jsf.beans.User;

public interface UserService {

	public void add (User user);
	public User find(int id);
	public List<User> list();
	
}
