package dev.elma.micro_services_app_spring.Dao;

import dev.elma.micro_services_app_spring.Entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,String> {
}
