package com.example.msscolarite;

import com.example.msscolarite.entities.Etablissement;
import com.example.msscolarite.entities.Etudiant;
import com.example.msscolarite.entities.Formation;
import com.example.msscolarite.rep.EtablissementRep;
import com.example.msscolarite.rep.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.Format;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class MsScolariteApplication implements CommandLineRunner {

    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    EtablissementRep etablissementRep;

    public static void main(String[] args)
    {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Formation formation=new Formation();
        Etablissement etablissement=etablissementRep.save(new Etablissement(null,"ESI",null));
        Etudiant etudiant=etudiantRep.save(new Etudiant(null,"yacine",new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-19"),new SimpleDateFormat("yyyy-MM-dd").parse("2023-03-19"),"promo2024",etablissement,1L,1L,formation));
        Etudiant etudiant1=etudiantRep.save(new Etudiant(null,"yacine",new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-19"),new SimpleDateFormat("yyyy-MM-dd").parse("2023-03-19"),"promo2024",etablissement,1L,1L,null));
        Etudiant etudiant2=etudiantRep.save(new Etudiant(null,"yacine",new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-19"),new SimpleDateFormat("yyyy-MM-dd").parse("2023-03-19"),"promo2024",etablissement,1L,1L,null));

        etablissement.getLesEtudiants().add(etudiant);
        etablissement.getLesEtudiants().add(etudiant1);
        etablissement.getLesEtudiants().add(etudiant2);
    }
}
