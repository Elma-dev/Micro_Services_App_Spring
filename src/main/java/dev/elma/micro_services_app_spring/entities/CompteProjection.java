package dev.elma.micro_services_app_spring.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Compte.class}, name = "p1") //create Projection
public interface CompteProjection extends Projection {
    double getSolde();
}
