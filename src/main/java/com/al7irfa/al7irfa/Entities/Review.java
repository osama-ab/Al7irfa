package com.al7irfa.al7irfa.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_review;
    private String commentaire;

    @OneToOne(mappedBy = "review")
    @JsonBackReference
    private Consultation consultation;


}
