package com.sample.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SimpleAppApplication {

	static Logger logger = LoggerFactory.getLogger(SimpleAppApplication.class);

	@PostConstruct
	public void init(){
		logger.info("SimpleApp initialized");
	}
	public static void main(String[] args) {
		logger.info("SimpleApp executed");
		SpringApplication.run(SimpleAppApplication.class, args);
	}

}
