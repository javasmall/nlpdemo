package com.nlpdemoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class NlpdemoclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NlpdemoclientApplication.class, args);
    }


}
