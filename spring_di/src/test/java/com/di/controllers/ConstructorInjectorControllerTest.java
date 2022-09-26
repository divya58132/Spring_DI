package com.di.controllers;

import ch.qos.logback.core.CoreConstants;
import com.di.services.GreetingService;
import com.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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