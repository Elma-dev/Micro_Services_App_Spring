package dev.elma.micro_services_app_spring.web;

import dev.elma.micro_services_app_spring.dao.CompteRepository;
import dev.elma.micro_services_app_spring.dtos.CompteDTORequest;
import dev.elma.micro_services_app_spring.dtos.CompteDTOResponse;
import dev.elma.micro_services_app_spring.entities.Compte;
import dev.elma.micro_services_app_spring.services.BankServices;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/apiServices")
public class CompteRestControllerWithServices {
    private CompteRepository compteRepository;
    private BankServices bankServices;

    public CompteRestControllerWithServices(CompteRepository compteRepository, BankServices bankServices) {
        this.compteRepository = compteRepository;
        this.bankServices = bankServices;
    }

    @GetMapping("/ClientComptes")
    List<Compte> getAllComptes(){
        return compteRepository.findAll();
    }
    @PostMapping("/newClientCompte")
    CompteDTOResponse newClientCompte(@RequestBody CompteDTORequest compte ){
        System.out.println(compte);
        CompteDTOResponse compteDTOResponse = bankServices.addNewAccount(compte);
        return compteDTOResponse;
    }
    @PutMapping("/updateCompte/{id}")
    Compte updateCompte(@PathVariable String id,@RequestBody Compte compte){
        Compte cmpt=compteRepository.findById(id).orElseThrow();
        if(!compte.getPassword().isEmpty()){
            cmpt.setPassword(compte.getPassword());
        }
        if(compte.getSolde()!=0){
            cmpt.setSolde(compte.getSolde());
        }
        return compteRepository.save(cmpt);
    }
    @DeleteMapping("/deleteCompte/{id}")
    Compte deleteCompte(@PathVariable String id){
        Compte compte=compteRepository.findById(id).orElseThrow();
        compteRepository.delete(compte);
        return compte;
    }
}
