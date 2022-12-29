package com.project9.Mediscreen_Eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MediscreenEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediscreenEurekaserverApplication.class, args);
	}

}
