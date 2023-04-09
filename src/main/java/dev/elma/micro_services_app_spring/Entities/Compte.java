package dev.elma.micro_services_app_spring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor @Builder

@Entity
public class Compte {
    @Id
    private String id;
    private String password;
    private double solde;
}
