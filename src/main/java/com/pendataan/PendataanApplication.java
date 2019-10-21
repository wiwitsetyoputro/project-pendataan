package com.pendataan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PendataanApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(PendataanApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PendataanApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();

	}

}
