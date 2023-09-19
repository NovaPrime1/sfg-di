package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    // In this test we are mimicking what the spring IOC would do by creating new vs. pulling it from context with DI
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreetingService() {

        System.out.println(controller.getGreeting());
    }
}