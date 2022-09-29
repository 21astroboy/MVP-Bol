package com.bitrekz.bolsta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.stream.Collectors;

@Configuration
@SpringBootApplication
public class BolstaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BolstaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BolstaApplication.class);
    }

}
