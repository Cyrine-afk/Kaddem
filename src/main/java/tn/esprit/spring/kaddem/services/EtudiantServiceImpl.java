package tn.esprit.spring.kaddem.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.repositories.EtudiantRepository;

import java.util.List;

@Service
@Slf4j
public class EtudiantServiceImpl implements IEtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;

    public List<Etudiant> retrieveAllEtudiants() {
        List<Etudiant> es = etudiantRepository.findAll();
        //affichage
        for (Etudiant e : es) {
            log.info("Etudiant: " + e);
        }
        return es;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        etudiantRepository.save(e);
        return e;
    }

    @Override
    public Etudiant updateEtudiant (Etudiant e) {

        return e;
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {

    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return ;
    }
}
