package com.skillsoft.springintializer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MessageController {
	
	@GetMapping(value="/home")
	public String index() {
		return "home";
	}

}
