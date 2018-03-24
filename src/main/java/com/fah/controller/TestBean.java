package com.fah.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.fah.controller")
public class TestBean {

    @Bean(name = "testing")
    public static Test test() {
        Test test = new Test();
        System.out.println(test.getName());
        return test;
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(TestBean.class);

        Test obj = (Test) context.getBean("testing");
        System.out.println(obj.getName());
    }

}
