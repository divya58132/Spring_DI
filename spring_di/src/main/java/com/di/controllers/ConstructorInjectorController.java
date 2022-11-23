package com.di.controllers;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class ConstructorInjectorController {
	
    private final GreetingService greetingService;

    public ConstructorInjectorController(@Qualifier("constructorGreetingService")GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
