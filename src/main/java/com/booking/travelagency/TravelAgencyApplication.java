package com.booking.travelagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TravelAgencyApplication extends SpringBootServletInitializer {

//	public static void main(String[] args) {
//		SpringApplication.run(TravelAgencyApplication.class, args);
//	}

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	private static Class<TravelAgencyApplication> applicationClass = TravelAgencyApplication.class;
}
