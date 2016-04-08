package com.pluralsight.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	private static Logger log = Logger.getLogger(HelloController.class);
	@RequestMapping(value="/greeting")
	public String sayHello(Model model){
		
		log.trace("This is trace");
		log.debug("This is debug");
		log.info("This is info");
		log.warn("This is warn");
		log.error("This is error");
		log.fatal("This is fatal");
		model.addAttribute("greeting", "asdfs world");
		
		return "hello";
	}
	
}
