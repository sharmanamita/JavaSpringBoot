package com.skillsoft.springintializer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GreetingController {
	
	@Autowired
	MessagesProperties msgProperties;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam String name, Model model) {
		String str = msgProperties.getGreeting()+ name;
		model.addAttribute("greetingMessage", str);
		
		return "home";
	}

}
