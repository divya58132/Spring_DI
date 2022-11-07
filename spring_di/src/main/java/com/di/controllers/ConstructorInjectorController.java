package com.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class ConstructorInjectorController {
	
	@Autowired
    private final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
