package com.di.services;

import com.di.controllers.PropertyInjectorController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingServiceImplTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setUp(){
        controller=new PropertyInjectorController();
        controller.greetingService=new GreetingServiceImpl();
    }



    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}