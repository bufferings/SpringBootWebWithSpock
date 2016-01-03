package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
class ExampleController {

	@RequestMapping("/")
	String hello() {
		return "Hello Groovy World!";
	}
}