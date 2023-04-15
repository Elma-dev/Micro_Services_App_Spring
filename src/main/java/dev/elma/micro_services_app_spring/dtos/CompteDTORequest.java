package dev.elma.micro_services_app_spring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data @Builder
public class CompteDTORequest {
    private String password;
    private double solde;
}
