package dev.elma.micro_services_app_spring.dao;

import dev.elma.micro_services_app_spring.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,String> {
}
