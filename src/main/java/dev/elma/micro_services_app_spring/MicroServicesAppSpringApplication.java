package dev.elma.micro_services_app_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServicesAppSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesAppSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
