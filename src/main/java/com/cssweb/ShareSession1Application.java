package com.cssweb;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableAutoConfiguration
public class ShareSession1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ShareSession1Application.class, args);
	}
}
