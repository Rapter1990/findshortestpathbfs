package com.route.findshortestpathbfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FindshortestpathbfsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindshortestpathbfsApplication.class, args);
	}

}
