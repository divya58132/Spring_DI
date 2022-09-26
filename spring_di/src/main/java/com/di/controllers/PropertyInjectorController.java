package com.di.controllers;

import com.di.services.GreetingService;

public class PropertyInjectorController {
	
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
		
	}

}
