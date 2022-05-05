package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BookappBookMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookappBookMsApiApplication.class, args);
		System.out.println("hello");
	}

}
