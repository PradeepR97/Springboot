package com.techno.loginExam.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginCtr {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap maps, @RequestParam String userName, @RequestParam String password) {
		if(userName.equals("admin") && password.equals("admin")) {
			return "welcome";
		}
		maps.put("error", "username or password is wrong");
		return "login";
	}

}
