package com.sam.sp11_springdependecy_injection.myServices;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServices implements FortuneServices {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}