package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

	@RequestMapping("/hyd/hello")
	public String sayHello() {
		
		return "Welcome to Spring Boot World Buddy.!!!! ";
	} 
}
                