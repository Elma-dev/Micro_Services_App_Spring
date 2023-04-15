package dev.elma.micro_services_app_spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data @AllArgsConstructor @NoArgsConstructor @Builder

@Entity
public class Compte {
    @Id
    private String id;
    private Date creationDate;
    private String password;
    private double solde;
}
