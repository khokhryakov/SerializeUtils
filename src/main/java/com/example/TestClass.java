package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component("testClass")
//@Scope(value = "singleton")
public class TestClass {
    private Integer a=1;

    public void setA(Integer a) {
        this.a = a;
        System.out.println("value = "+a);
    }

    public TestClass() {
        System.out.println("This is TestClass. value = "+this.a);
        System.out.println(this.toString());
    }
}
