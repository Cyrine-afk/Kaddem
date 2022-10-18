package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.kaddem.entities.Etudiant;

import java.util.Set;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Set<Etudiant> findAllByNameEtudiant (String n);
}
