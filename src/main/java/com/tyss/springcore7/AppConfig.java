package com.tyss.springcore7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	@Bean
	public Car getCar() {
		return new Car();
	}
	@Bean
	public Bike getBike() {
		return new Bike();
	}

}
