package com.twq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@EnableAsync
public class TwqApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwqApplication.class, args);
    }

}
