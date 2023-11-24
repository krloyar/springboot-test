package com.krloyar.springcore.controller;

import com.krloyar.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Coach theCoach;

    // Constructor Injection
    public HomeController(@Qualifier("cricketCoach") Coach theCoach) {
        this.theCoach = theCoach;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hey Girl";
    }

    @GetMapping("/cricket")
    public String vada(){
        return theCoach.getDailyWorkout();
    }

    @GetMapping("/aish")
    public String knowAish(){
        return "She is now 50 yrs old beauty";
    }
}
