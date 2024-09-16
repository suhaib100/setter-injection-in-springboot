package com.luv2code.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "practise fast bowling for 20 minutes mohd suhaib khan....";
    }
}
