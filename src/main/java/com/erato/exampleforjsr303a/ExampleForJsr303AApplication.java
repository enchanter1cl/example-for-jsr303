package com.erato.exampleforjsr303a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "com.erato.exampleforjsr303a")
@SpringBootApplication
public class ExampleForJsr303AApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ExampleForJsr303AApplication.class, args);
    }
    
}
