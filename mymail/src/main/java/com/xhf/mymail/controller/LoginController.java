package com.xhf.mymail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhf.mymail.service.UserService;

@Controller
public class LoginController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@Autowired
	private UserService userService;
	
	

	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
    @RequestMapping("/login")
	public String login(@RequestParam String name, @RequestParam String pass,Model model) {
		// �����ݿ�ȶ�
        boolean ret=userService.login(name,pass);
        if (ret) {
			return "forward:/goodsList";
		} else {
            model.addAttribute("msg", "�û��������������");
            model.addAttribute("name", name);
			return "login";
		}

	}
}
