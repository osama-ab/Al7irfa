package com.al7irfa.al7irfa.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
public class Paiement {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayment;


    @OneToOne
    @JoinColumn(name = "id_client")
    @JsonBackReference
    private Client client;

    @OneToOne
    @JoinColumn(name = "id_ouvrier")
    @JsonBackReference
    private Ouvrier ouvrier;
    private Double montant;
}
