package com.ihsandedec.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.ihsandedec"})
@EnableJpaRepositories(basePackages = {"com.ihsandedec"})
@ComponentScan(basePackages = {"com.ihsandedec"})
@SpringBootApplication
public class ExceptionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementApplication.class, args);
	}

}
