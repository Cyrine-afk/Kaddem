package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.kaddem.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long>{
    //Set<Contrat> findContratByIdContrat ();
}
