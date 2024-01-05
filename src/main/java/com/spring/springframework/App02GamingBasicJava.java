package com.spring.springframework;

import com.spring.springframework.game.GameRunner;
import com.spring.springframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02GamingBasicJava {
    public static void main(String[] args) {
        //1. launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring to manage -
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        //3. Retreiving Beans managed by Spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println("person2MethodCall>>" + " " + context.getBean("person2MethodCall"));

        System.out.println("person3Parameters>>" + " " + context.getBean("person3Parameters"));

        System.out.println(context.getBean("address2"));

        System.out.println(context.getBean(Person.class));

        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person5Qualifier"));

        System.out.println("----");
//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach((System.out::println));
    }
}
