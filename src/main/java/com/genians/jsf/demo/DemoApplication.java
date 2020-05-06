package com.genians.jsf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan(basePackages = "com.genians.jsf.demo.mapper")
@ComponentScan
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	protected SpringApplicationBuilder configue(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
		
	}
	public static void main(String[] args) {
		try {
//            SpringApplication springApplication = new SpringApplicationBuilder().sources(DemoApplication.class).web(WebApplicationType.NONE).build();
//            springApplication.run(args);
			SpringApplication.run(DemoApplication.class, args);
		} catch (Exception exception) {
			LOGGER.error("[App] could not launch app.", exception);
		}
	}
}
