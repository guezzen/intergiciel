package com.example.msscolarite.rep;

import com.example.msscolarite.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface EtudiantRep extends JpaRepository<Etudiant, Long> {

    List<Etudiant> findEtudiantByDateNaissanceBefore(Date date);
}
