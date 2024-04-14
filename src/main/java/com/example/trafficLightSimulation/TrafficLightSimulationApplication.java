package com.example.trafficLightSimulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TrafficLightSimulationApplication {


	public static void main(String[] args) {
		SpringApplication.run(TrafficLightSimulationApplication.class, args);
	}

}
