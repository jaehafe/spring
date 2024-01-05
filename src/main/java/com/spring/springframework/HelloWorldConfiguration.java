package com.spring.springframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) { }

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
        return new Person("li zai shi", 20, new Address("Main Street", "Seoul"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());//name, age, address
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {//name, age, address2
        return new Person(name, age, address3);//name, age, address
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    @Qualifier
    public Person person4Qualifier(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("12", "Seoul");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("12 street", "Shanghai");
    }
}
