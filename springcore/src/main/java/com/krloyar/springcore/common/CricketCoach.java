package com.krloyar.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Bowling for 60 mins";
    }
}
