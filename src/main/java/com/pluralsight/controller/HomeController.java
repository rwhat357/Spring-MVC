package com.pluralsight.controller;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.model.User;
import com.pluralsight.service.UserService;

@Controller
public class HomeController {
	
	private static Logger log = Logger.getLogger(HomeController.class);
	UserService userService = new UserService();
	
	@RequestMapping(value="/home")
	public String sayHello(Model model){

		List<User> userList = userService.getAll();
		model.addAttribute("userList", userList);
		model.addAttribute("greeting", "asdfs world");
		
		return "home";
	}
	
}
