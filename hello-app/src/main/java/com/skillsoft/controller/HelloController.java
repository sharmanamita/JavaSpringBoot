package com.skillsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "This is main page";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome to spring boot";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String Hello() {
		return "Hello World!";
	}

}
