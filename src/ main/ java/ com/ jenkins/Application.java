package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  
public class Application {
	public static void main(String[] args) {
		/*
		 * 在main方法进行启动我们的应用程序.
		 */
		SpringApplication.run(Application.class, args);
	}
}
