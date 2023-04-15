package dev.elma.micro_services_app_spring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CompteDTOResponse {
    private Date creationDate;
    private String password;
    private double solde;
}
