package com.infinx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloundConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloundConfigServerApplication.class, args);
	}
}
