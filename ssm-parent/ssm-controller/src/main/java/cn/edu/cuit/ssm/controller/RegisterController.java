package cn.edu.cuit.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cuit.ssm.entity.User;
import cn.edu.cuit.ssm.service.UserService;

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
        int ret=userService.insert(user);
        if (ret>0) {
			return "success";
		} else {
            model.addAttribute("msg", "用户名已存在");         
			return "register";
		}
	}
}
