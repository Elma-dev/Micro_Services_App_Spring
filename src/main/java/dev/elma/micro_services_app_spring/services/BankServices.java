package dev.elma.micro_services_app_spring.services;

import dev.elma.micro_services_app_spring.dao.CompteRepository;
import dev.elma.micro_services_app_spring.dtos.CompteDTORequest;
import dev.elma.micro_services_app_spring.dtos.CompteDTOResponse;
import dev.elma.micro_services_app_spring.entities.Compte;
import dev.elma.micro_services_app_spring.mappers.ComptMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor @Data @Builder
public class BankServices implements IBankServices{
    private CompteRepository compteRepository;
    private ComptMapper comptMapper;
    @Override
    public CompteDTOResponse addNewAccount(CompteDTORequest compteDTORequest) {
        Compte compte = comptMapper.dtoCompteToCompte(compteDTORequest);
        Compte saveAccount = compteRepository.save(compte);
        CompteDTOResponse compteDTOResponse = comptMapper.compteToCompteDTOResp(saveAccount);
        return compteDTOResponse;
    }
}
