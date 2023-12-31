package com.al7irfa.al7irfa.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity @Data
@PrimaryKeyJoinColumn(name = "user_id")

public class Ouvrier extends User{

    @Enumerated(EnumType.STRING)

    private Categorie categorie  ;


    @Builder

    public Ouvrier(int id , String fn ,String ln ,String email, String password ,
                  String addresse , String phone , String cin
            , String pays  , String ville ,Role role ,Categorie categorie) {
        super(  id ,  fn , ln , email,  password ,
                addresse ,  phone ,  cin
                ,  pays  ,  ville , role);
        this.categorie = categorie ;
    }

    @OneToOne
    @JoinColumn(name = "metier_id")
    @JsonManagedReference
    private Metier metier;

    @OneToOne(mappedBy = "ouvrier")
    @JsonManagedReference
    private Rating rating;

    @OneToMany(mappedBy = "ouvrier")
    @JsonManagedReference
    private Collection<Consultation>consultations;

    @OneToOne(mappedBy = "ouvrier")
    @JsonManagedReference
    private Reclamation reclamation;

    @OneToOne(mappedBy = "ouvrier")
    @JsonManagedReference
    private Paiement paiement;


    public Ouvrier() {

    }
}
