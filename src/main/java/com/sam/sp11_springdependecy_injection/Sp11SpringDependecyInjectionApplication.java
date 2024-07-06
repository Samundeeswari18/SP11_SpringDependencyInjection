package com.sam.sp11_springdependecy_injection;

import com.sam.sp11_springdependecy_injection.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sp11SpringDependecyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(Sp11SpringDependecyInjectionApplication.class, args);

        // get the bean from spring container
        Coach theCoach = context.getBean(Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}

