package com.example.graphql;


import com.example.graphql.entities.Compte;
import com.example.graphql.repo.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CompteController {

    private CompteRepository compteRepository;

    @Autowired
    public CompteController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }


    @QueryMapping
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }

    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public Compte updateCompte(String id, Compte compte) {
        Compte existingCompte = compteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Compte not found"));

        existingCompte.setSolde(compte.getSolde());
//        existingCompte.setDateCreation(compte.getDateCreation());
        existingCompte.setClient(compte.getClient());

        return compteRepository.save(existingCompte);
    }

    public void deleteCompte(String id) {
        compteRepository.deleteById(id);
    }

}
