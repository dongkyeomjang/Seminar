package com.seminar.example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ExampleBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleBootApplication.class, args);
    }

}
