package dev.elma.micro_services_app_spring;

import dev.elma.micro_services_app_spring.Dao.CompteRepository;
import dev.elma.micro_services_app_spring.Entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServicesAppSpringApplication implements CommandLineRunner {
	@Autowired
	CompteRepository compteRepository;
	public static void main(String[] args) {
		SpringApplication.run(MicroServicesAppSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		compteRepository.save(new Compte(null,"Abdeljalil","1234",12200));
		compteRepository.save(new Compte(null,"Abdeljalil2","1432",10000));
		compteRepository.save(new Compte(null,"Abdeljalil3","1243",50000));
		compteRepository.save(new Compte(null,"Abdeljalil4","1324",2000));
	}
}
