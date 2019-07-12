package cn.edu.cuit.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cuit.ssm.service.UserService;
/**
 * 
 *  南阳德刚版权所有http://www.guodexian.com<br>
 *
 *
 * 2019年7月10日下午6:01:47<br>
 * 类说明:登陆相关
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
    @RequestMapping("/login")
	public String login(@RequestParam String name, @RequestParam String pass,Model model) {
		// 到数据库比对
        boolean ret=userService.login(name,pass);
        if (ret) {
			return "success";
		} else {
            model.addAttribute("msg", "用户名或者密码错误");
            model.addAttribute("name", name);
			return "login";
		}

	}
}
