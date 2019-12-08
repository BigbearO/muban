package com.xhf.mymail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhf.mymail.entity.User;
import com.xhf.mymail.service.UserService;

@Controller
public class RegisterController {
	
	
	@Autowired
	private UserService userService;

	@RequestMapping("/toRegister")
	public String toLogin() {
		return "register";
	}
	
	
	@RequestMapping("/Register")
	public String login(@RequestParam String name, @RequestParam String pass,@RequestParam String address,@RequestParam String phone,Model model) {
		
		User user=new User(name, pass, address, phone);
		
		// 到数据库比对
				int result = userService.findUserByName(name);
				if (result > 0) {
					model.addAttribute("msg", "用户名已存在");
					return "register";

				} else {
					int ret = userService.insert(user);
					if (ret > 0) {
						return "forward:/toLogin";
					} else {
						model.addAttribute("msg1", "注册失败，请重试");
						return "register";
					}
				}

	}
}
