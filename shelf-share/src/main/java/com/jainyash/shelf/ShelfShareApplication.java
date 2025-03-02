package com.jainyash.shelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShelfShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShelfShareApplication.class, args);
	}

}
