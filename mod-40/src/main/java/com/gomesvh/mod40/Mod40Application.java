package com.gomesvh.mod40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mod40Application {

	private static final Logger log = LoggerFactory.getLogger(Mod40Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Mod40Application.class, args);
	}
}