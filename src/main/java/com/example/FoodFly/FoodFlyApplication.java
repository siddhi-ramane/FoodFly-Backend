package com.example.FoodFly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FoodFlyApplication {

	public static void main(String[] args) {
		System.out.println("ENV URL = " + System.getenv("SPRING_DATASOURCE_URL"));
		SpringApplication.run(FoodFlyApplication.class, args);
		
	}
	

}
