package com.krloyar.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class KhokhoCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run for your life";
    }
}
