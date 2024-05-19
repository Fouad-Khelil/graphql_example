package com.example.graphql;

import com.example.graphql.entities.Client;
import com.example.graphql.entities.Compte;
import com.example.graphql.repo.ClientRepository;
import com.example.graphql.repo.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class GraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ClientRepository clientRepository ,
//                                               CompteRepository compteRepository) {
//        return args -> {
//            List.of("mohamed").forEach(c-> {
//
//                Client cl =  Client.builder().id(4).name(c).build();
//                clientRepository.save(cl);
//                String id = UUID.randomUUID().toString();
//
//                Compte cmpt = Compte.builder()
//                        .id(id)
//                        .solde(42.0d)
//                        .dateCreation(new Date())
//                        .client(cl)
//                        .build();
//                compteRepository.save(cmpt) ;
//            });
//        };
//    }

}
