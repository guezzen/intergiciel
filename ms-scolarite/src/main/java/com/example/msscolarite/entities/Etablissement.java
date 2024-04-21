package com.example.msscolarite.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;
    @Column(nullable = false)
    private String nom;
    @OneToMany(mappedBy = "etablissement")
    private List<Etudiant> lesEtudiants;

    public List<Etudiant> getLesEtudiants() {
        if(lesEtudiants!=null)
            return lesEtudiants;
        else return lesEtudiants=new ArrayList<>();


    }
}
