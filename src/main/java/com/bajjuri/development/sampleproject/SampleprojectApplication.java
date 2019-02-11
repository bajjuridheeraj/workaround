package com.bajjuri.development.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class SampleprojectApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(SampleprojectApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleprojectApplication.class, args);
	}

}

