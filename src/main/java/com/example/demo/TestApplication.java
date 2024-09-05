package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@GetMapping("/homepage")
	public String welcome() {
		return "welcome to java training";
	}
	@GetMapping("/course")
	public String greeting() {
		return "java fullstack developement";
	}
	@GetMapping("/tech")
	public String tech() {
		return "java, spring boot, postgreSql";
	}
	@GetMapping("/assessment")
	public String hello() {
		return "welcome to the assesment page";
	}
}
