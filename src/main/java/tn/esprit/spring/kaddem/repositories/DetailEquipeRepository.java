package tn.esprit.spring.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.kaddem.entities.DetailEquipe;

import java.util.Set;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Long> {
    Set<DetailEquipe> findAllByNameDetailEquipe (String n);
}
