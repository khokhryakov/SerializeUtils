package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class Hideme {

    private TestClass testClass;

    @Autowired
    @Qualifier("testClass")
    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
        int a=1;
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
//		Hideme hideme = (Hideme) ctx.getBean("hideme");
        int b =1;
    }

//    public Hideme() {
//        System.out.println("TEST HELLO TEST");
//    }
}
