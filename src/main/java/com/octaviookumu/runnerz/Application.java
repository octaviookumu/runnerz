package com.octaviookumu.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

//	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	CommandLineRunner runner(){
//		return args -> {
//			Run run = new Run(1, "April run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 4, Location.OUTDOOR);
//			logger.info("Run: " + run);
//		};
//	}

}
