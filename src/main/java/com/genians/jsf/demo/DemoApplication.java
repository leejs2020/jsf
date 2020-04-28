package com.genians.jsf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 *
 * @author leejs2020
 */
@SpringBootApplication
@MapperScan(basePackages = "com.genians.jsf.demo")
public class DemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication springApplication = new SpringApplicationBuilder().sources(DemoApplication.class).web(WebApplicationType.NONE).build();
            springApplication.run(args);
        } catch (Exception exception) {
            LOGGER.error("[App] could not launch app.", exception);
        }
    }
}
