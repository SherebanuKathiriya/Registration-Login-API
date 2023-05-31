package com.sherebanu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sherebanu.springboot.*")
@ComponentScan(basePackages = { "com.sherebanu.springboot.*" })
@EntityScan("com.sherebanu.springboot.*")   

public class RegistrationLoginLogoutProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginLogoutProjectApplication.class, args);
	}

}
