package dev.elma.micro_services_app_spring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

@Entity
public class Compte {
    @Id @GeneratedValue
    private double id;
    private String name;
    private String password;
    private long solde;
}