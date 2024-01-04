package com.spring.springframework;

import com.spring.springframework.game.GameRunner;
import com.spring.springframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {
    public static void main(String[] args) {
        //1. launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring to manage -
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        //3. Retreiving Beans managed by Spring
        System.out.println(context.getBean("name"));
    }
}
