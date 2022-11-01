package com.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {

	@RequestMapping("/home")
	public String Home() {
		System.out.println("This is home page");
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String Login() {
		System.out.println("This is login pageee");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model,@RequestParam String userName,@RequestParam String password) {
		if(userName.equals("admin") && password.equals("root")) {
			System.out.println("This is welcome page");
			model.put("userName", userName);
			return "welcome";
		}
		model.put("errorMsg","Please provide correct userName and password");
		return "login";
		
	}

}
