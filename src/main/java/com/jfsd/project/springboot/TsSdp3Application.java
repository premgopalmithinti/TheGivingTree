package com.jfsd.project.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jfsd.project.springboot")
public class TsSdp3Application {

	public static void main(String[] args) {
		SpringApplication.run(TsSdp3Application.class, args);
		System.out.println("The Giving Tree Project");
	}

}
