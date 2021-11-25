package com.capgemini;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComCgSpringmibiProjectApplication {

	private static final Logger LOG = LoggerFactory.getLogger(ComCgSpringmibiProjectApplication.class);
	public static void main(String[] args) {
		LOG.info("start");
		SpringApplication.run(ComCgSpringmibiProjectApplication.class, args);
		LOG.info("end");
	}

}
