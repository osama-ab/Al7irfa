package com.al7irfa.al7irfa.Entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
public class Reclamation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Reclamation;

    @OneToOne
    @JoinColumn(name = "id_client")
    @JsonBackReference

    private Client client;



    @OneToOne
    @JoinColumn(name = "id_ouvrier")
    @JsonBackReference
    private Ouvrier ouvrier;

    @OneToOne
    @JoinColumn(name = "id_consultation")
    @JsonBackReference
    private Consultation consultation ;


    private String commentaire;

}
