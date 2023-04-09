package dev.elma.micro_services_app_spring.web;

import dev.elma.micro_services_app_spring.dao.CompteRepository;
import dev.elma.micro_services_app_spring.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
