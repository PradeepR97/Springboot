package com.example.spring_jsp_demo.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap map, @RequestParam String userId, @RequestParam String password) {
		
		User user = userService.getUserByUserId(userId);
		
		if(password.equals(user.getPassword())) {
			return "welcome";
		}
		map.put("errorMsg", "userId or password is wrong");
		return "login";
	}
}
