package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.kaddem.entities.Contrat;

import java.util.Set;

public interface ContratRepository extends JpaRepository<Contrat,Long>{
    Set<Contrat> findAllByNameContrat (String n);
}
