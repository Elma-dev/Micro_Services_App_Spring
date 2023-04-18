package dev.elma.micro_services_app_spring.web;

import dev.elma.micro_services_app_spring.dao.CompteRepository;
import dev.elma.micro_services_app_spring.entities.Compte;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CompteGraphQLController {
    private CompteRepository compteRepository;

    @QueryMapping
    public List<Compte> comptes(){
        return compteRepository.findAll();
    }
    @QueryMapping()
    public Compte compte(@Argument String id){
        return compteRepository.findById(id).get();
    }


}
