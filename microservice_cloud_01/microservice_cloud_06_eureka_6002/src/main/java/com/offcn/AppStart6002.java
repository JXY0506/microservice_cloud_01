package com.offcn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class AppStart6002 {
    public static void main(String[] args) {
        SpringApplication.run(AppStart6002.class, args);
    }
}
