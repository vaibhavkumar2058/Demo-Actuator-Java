package com.example.Vaibhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.Vaibhav.model")
public class DemoActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoActuatorApplication.class, args);
	}

}
