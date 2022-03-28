package com.khan.springprofileexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileExampleApplication implements CommandLineRunner {

	@Autowired
	private ProfileService service;

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringProfileExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(this.service.getMessage());
	}
}
