package com.ruseli.isthesiteup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IsTheSiteUpApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8081 ); //Set to run on port 8081
		SpringApplication.run(IsTheSiteUpApplication.class, args);
	}

}
