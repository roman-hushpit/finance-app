package com.roman.hushpit.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FinincialMonitoringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinincialMonitoringAppApplication.class, args);
	}

}
