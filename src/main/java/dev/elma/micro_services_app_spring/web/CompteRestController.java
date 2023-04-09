package dev.elma.micro_services_app_spring.web;

import dev.elma.micro_services_app_spring.dao.CompteRepository;
import dev.elma.micro_services_app_spring.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CompteRestController {
    CompteRepository compteRepository;
    public CompteRestController(CompteRepository compteRepository){
        this.compteRepository=compteRepository;
    }

    @GetMapping("/ClientComptes")
    List<Compte> getAllComptes(){
        return compteRepository.findAll();
    }
    @PostMapping("/newClientCompte")
    Compte newClientCompte(@RequestBody Compte compte ){
        compte.setId(UUID.randomUUID().toString());
        return compteRepository.save(compte);
    }
}
