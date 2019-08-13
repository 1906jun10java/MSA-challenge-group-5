package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChallengeEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeEmployeeApplication.class, args);
	}

}
