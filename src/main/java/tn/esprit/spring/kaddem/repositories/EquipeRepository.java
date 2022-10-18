package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.kaddem.entities.Equipe;

import java.util.Set;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
    Set<Equipe> findAllByNameEquipe (String n);
}
