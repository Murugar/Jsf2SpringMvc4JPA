package com.iqmsoft.spring.mvc.jsf.dao;

import java.util.List;

import com.iqmsoft.spring.mvc.jsf.beans.User;

public interface UserDao {

	void add (User user);
	User find(int id);
	List<User> list();
	
}
