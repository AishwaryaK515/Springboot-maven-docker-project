package com.Aishwaryak515;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "Aishwaryak515.com") 
    
public class SpringbootMavenDockerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMavenDockerProjectApplication.class, args);
    }

}
