package dev.elma.micro_services_app_spring.dao;

import dev.elma.micro_services_app_spring.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,String> {

}
