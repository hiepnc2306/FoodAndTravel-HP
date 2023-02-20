package com.example.detaithuctap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class DetaithuctapApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetaithuctapApplication.class, args);
	}

}