package com.di.controllers;

import com.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectorControllerTest {

    ConstructorInjectorController controller;

    @BeforeEach
    void setUp(){
        controller=new ConstructorInjectorController(new GreetingServiceImpl());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}