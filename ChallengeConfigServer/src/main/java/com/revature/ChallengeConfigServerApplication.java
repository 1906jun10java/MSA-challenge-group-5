package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ChallengeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeConfigServerApplication.class, args);
	}

}
