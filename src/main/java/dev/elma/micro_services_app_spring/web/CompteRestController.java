package dev.elma.micro_services_app_spring.web;

import dev.elma.micro_services_app_spring.dao.CompteRepository;
import dev.elma.micro_services_app_spring.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
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
        System.out.println(compte);
        compte.setId(UUID.randomUUID().toString());
        return compteRepository.save(compte);
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
