package com.example.graphql.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity()
public class Compte {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    String id ;
    double solde ;
//    Date dateCreation ;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
