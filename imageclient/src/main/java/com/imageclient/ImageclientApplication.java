package com.imageclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ImageclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageclientApplication.class, args);
    }

}
