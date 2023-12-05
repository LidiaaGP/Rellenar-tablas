package com.ipartek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ipartek")
public class P003RellenarTablasApplication {

	public static void main(String[] args) {
		SpringApplication.run(P003RellenarTablasApplication.class, args);
	}

}
