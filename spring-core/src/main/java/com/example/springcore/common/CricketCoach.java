package com.example.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define our init mmthod

//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff: " + getClass().getSimpleName());
//    }
//
//    // define our destroy method
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyCleanupStuff: " + getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Time!";
    }
}