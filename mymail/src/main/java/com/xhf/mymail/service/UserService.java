package com.xhf.mymail.service;

import com.xhf.mymail.entity.User;


public interface UserService {

	boolean login(String name, String pass);
	int insert(User user);
	int findUserByName(String name);
}
