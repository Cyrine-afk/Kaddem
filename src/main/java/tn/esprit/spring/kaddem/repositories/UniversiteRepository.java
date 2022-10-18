package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.kaddem.entities.Universite;

import java.util.Set;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Set<Universite> findAllByNameUniversite (String n);
}
