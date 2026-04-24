package com.example.FoodFly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FoodFlyApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(FoodFlyApplication.class, args);
		
	}
	

}
