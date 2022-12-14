package com.di.controllers;

import com.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectorControllerTest {
    SetterInjectorController controller;

    @BeforeEach
    void setUp(){
        controller=new SetterInjectorController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}