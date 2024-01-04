package com.spring.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { }

record Address(String firstLine, String city) { }

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Jaeha";
    }

    @Bean
    public int age() {
        return 30;
    }

    @Bean
    public Person person() {
        return new Person("li zai shi", 20);
    }

    @Bean
    public Address address() {
        return new Address("12", "Seoul");
    }
}
