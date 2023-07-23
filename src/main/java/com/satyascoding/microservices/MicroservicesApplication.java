package com.satyascoding.microservices;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MicroservicesApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MicroservicesApplication.class, args);

		//Another Way of starting Spring application
		new SpringApplicationBuilder(MicroservicesApplication.class)
				.bannerMode(Banner.Mode.CONSOLE)
				.run(args);
	}

}
