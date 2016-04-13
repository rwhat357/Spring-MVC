package com.pluralsight.controller;


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
		
//		log.trace("This is trace in home controller");
//		log.debug("This is debug in home controller");
//		log.info("This is info in home controller");
//		log.warn("This is warn in home controller" );
//		log.error("This is error in home controller");
//		log.fatal("This is fatal in home controller");
		
		User user = userService.getUserById(1);
		
		model.addAttribute("user", user);
		model.addAttribute("greeting", "asdfs world");
		
		return "home";
	}
	
}
