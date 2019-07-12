package cn.edu.cuit.ssm.service;

import cn.edu.cuit.ssm.entity.User;

/**
 * 
 *  南阳德刚版权所有http://www.guodexian.com<br>
 *
 *
 * 2019年7月10日下午5:58:17<br>
 * 类说明:
 */
public interface UserService {

	boolean login(String name, String pass);
	int insert(User user);
}
