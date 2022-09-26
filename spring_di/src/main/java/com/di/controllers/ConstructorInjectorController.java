package com.di.controllers;

import com.di.services.GreetingService;

public class ConstructorInjectorController {
    private final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}