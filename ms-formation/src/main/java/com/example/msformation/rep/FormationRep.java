package com.example.msformation.rep;

import com.example.msformation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface FormationRep extends JpaRepository<Formation, Long> {
}
