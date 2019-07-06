package de.ecreators.demo.ai.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AiServiceApp {
	
	@PropertySource("application.properties")
	@Configuration
	static class Config {
	
		@Value("${server.port}")
		public int serverPort;
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(AiServiceApp.class, args);
	}
}
