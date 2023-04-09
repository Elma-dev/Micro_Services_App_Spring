package dev.elma.micro_services_app_spring;

import dev.elma.micro_services_app_spring.dao.CompteRepository;
import dev.elma.micro_services_app_spring.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class MicroServicesAppSpringApplication implements CommandLineRunner {
	@Autowired
	CompteRepository compteRepository;
	public static void main(String[] args) {
		SpringApplication.run(MicroServicesAppSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Compte compte = Compte.builder()
					.id(UUID.randomUUID().toString()).solde(1000+Math.random()*1000).password("comp12"+i)
					.build();
			compteRepository.save(compte);
		}
	}
}
