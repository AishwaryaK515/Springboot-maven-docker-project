package com.Aishwaryak515;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.Aishwaryak515") 
    
public class SpringbootMavenDockerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMavenDockerProjectApplication.class, args);
    }

}

