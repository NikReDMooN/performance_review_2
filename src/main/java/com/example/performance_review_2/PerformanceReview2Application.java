package com.example.performance_review_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PerformanceReview2Application {

    public static void main(String[] args) {
        SpringApplication.run(PerformanceReview2Application.class, args);
    }

}
