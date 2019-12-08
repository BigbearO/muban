package com.xhf.mymail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhf.mymail.entity.User;
import com.xhf.mymail.service.UserService;

import com.xhf.mymail.dao.UserMapper;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public boolean login(String name, String pass) {
		int ret=userMapper.findUserByNameAndPwd(name, pass);
		if (ret>0) {
			return true;
		}
		return false ;
	}

	public int insert(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
		}

	public int findUserByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.findUserByName(name);
	}

}
