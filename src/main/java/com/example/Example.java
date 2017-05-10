package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

//@Component
public class Example {

    @Scheduled(fixedRate = 2000000)
    private void myMethod() {
        System.out.println("Hello!");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Hideme hideme = (Hideme) ctx.getBean("hideme");
        int a =1 ;
    }

}
