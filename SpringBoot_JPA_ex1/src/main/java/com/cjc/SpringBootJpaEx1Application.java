package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class SpringBootJpaEx1Application {

	public static void main(String[] args) {
		System.out.println("SpringBoot ---- JPA");
		SpringApplication.run(SpringBootJpaEx1Application.class, args);
	}

}
