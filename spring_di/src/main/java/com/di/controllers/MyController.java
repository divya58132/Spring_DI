package com.di.controllers;

import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class MyController {
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService=greetingService;
	}
	public String sayHello() {
		System.out.println("Hello World...!!");
		return greetingService.sayGreeting();
	}

}
