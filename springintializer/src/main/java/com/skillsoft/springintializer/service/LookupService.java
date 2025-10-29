package com.skillsoft.springintializer.service;



import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.skillsoft.springintializer.model.User;

@Service
public class LookupService {
	
	private static final Logger logger = LoggerFactory.getLogger(LookupService.class);
	private static final String Github_URL = "https://api.github.com/users/%s";
	private final RestTemplate template;
	
	
	public LookupService(RestTemplateBuilder restTemplateBuilder) {
		template = restTemplateBuilder.build();
	}
	
	public CompletableFuture<User> findUser(String user) throws InterruptedException{
		logger.info("Looking up:"+ user);
		
		String url = String.format(Github_URL, user);
		
		User results = template.getForObject(url, User.class);
		
		Thread.sleep(4000L);
		
		return CompletableFuture.completedFuture(results);
	}
	
	

}
