package com.project0.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.project0.application")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
