package com.techno.loginExam;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.techno.loginExam")
public class LoginExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginExamApplication.class, args);
	}
}
