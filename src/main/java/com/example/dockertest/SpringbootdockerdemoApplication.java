package com.example.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdockerdemoApplication {
	
	@GetMapping("/greeting")
	public String greeting()
	{
		return "Welcome to Spring Boot Docker demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerdemoApplication.class, args);
	}

}
