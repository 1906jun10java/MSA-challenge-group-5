package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChallengeReimbursementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeReimbursementServiceApplication.class, args);
	}

}