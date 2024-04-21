package com.example.msscolarite.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;

    @Column(nullable = false)
    private String promo;

    @ManyToOne
    @JoinColumn(name = "idEtablissement")
    private Etablissement etablissement;

    @Column
    private Long idFormation  ;

    @Column
    private Long idBourse;

    @Transient
    private Formation formation;


}
