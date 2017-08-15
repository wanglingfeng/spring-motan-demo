package com.motan.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MotanClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotanClientApplication.class, args);
		System.out.println("Server start ...");
	}
}
