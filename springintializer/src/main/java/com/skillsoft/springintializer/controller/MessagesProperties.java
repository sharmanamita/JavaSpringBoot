package com.skillsoft.springintializer.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("messages")
public class MessagesProperties {
	
	String greeting = "Good Morning!";
	
	public String getGreeting() {
		return greeting;
	}
	
	public void setGreeting(String value) {
		greeting = value;
	}

}
