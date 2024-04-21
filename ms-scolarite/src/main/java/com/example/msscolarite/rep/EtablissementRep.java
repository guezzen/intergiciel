package com.example.msscolarite.rep;

import com.example.msscolarite.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface EtablissementRep extends JpaRepository<Etablissement, Long> {
}
