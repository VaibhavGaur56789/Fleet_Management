package com.ltts.fleetMngmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages={"com.ltts.demo.Dao","com.ltts.demo.controller", "com.ltts.demo.model"})
@SpringBootApplication
@ComponentScan
public class FleetManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetManagementApplication.class, args);
	}

}
