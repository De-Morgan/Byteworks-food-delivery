package com.byteworks.foodvendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FoodVendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodVendorApplication.class, args);
	}

}
