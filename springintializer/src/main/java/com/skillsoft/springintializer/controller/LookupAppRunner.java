package com.skillsoft.springintializer.controller;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.skillsoft.springintializer.model.User;
import com.skillsoft.springintializer.service.LookupService;

@Component
public class LookupAppRunner implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(LookupAppRunner.class);
	
	@Autowired
	LookupService service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CompletableFuture<User> info1 = service.findUser("Pytorch");
		CompletableFuture<User> info2 = service.findUser("scikit-learn");
		
		CompletableFuture<User> info3 = service.findUser("Tensorflow");
		CompletableFuture<User> info4 = service.findUser("spring-boot");
		
		CompletableFuture<User> info5 = service.findUser("spring-mvc");
		CompletableFuture<User> info6 = service.findUser("spring-security");
		
		CompletableFuture.allOf(info1, info2, info3, info4, info5, info6).join();
		
		logger.info("==>" + info1.get());
		logger.info("==>" + info2.get());
		logger.info("==>" + info3.get());
		logger.info("==>" + info4.get());
		logger.info("==>" + info5.get());
		logger.info("==>" + info6.get());
		
	}
}
