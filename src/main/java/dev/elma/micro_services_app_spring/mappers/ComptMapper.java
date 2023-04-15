package dev.elma.micro_services_app_spring.mappers;

import dev.elma.micro_services_app_spring.dtos.CompteDTORequest;
import dev.elma.micro_services_app_spring.dtos.CompteDTOResponse;
import dev.elma.micro_services_app_spring.entities.Compte;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.UUID;

@Component
public class ComptMapper {
    public Compte dtoCompteToCompte(CompteDTORequest compteDTORequest){
        Compte compte=Compte.builder()
                .id(UUID.randomUUID().toString())
                .creationDate(new Date())
                .build();
        BeanUtils.copyProperties(compteDTORequest,compte);
        return compte;
    }
    public CompteDTOResponse compteToCompteDTOResp(Compte compte){
        CompteDTOResponse compteDTOResponse = CompteDTOResponse.builder().build();
        BeanUtils.copyProperties(compte,compteDTOResponse);
        return compteDTOResponse;

    }
}
