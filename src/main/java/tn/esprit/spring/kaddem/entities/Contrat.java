package tn.esprit.spring.kaddem.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Contrat")
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat; // Clé primaire
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private boolean archive;
    private int montantContrat;
    //@Enumerated(EnumType.STRING)
    //private Specialite sp;
    // Constructeur et accesseurs (getters) et mutateurs (setters)
    //@ManyToOne
    //Etudiant etudiant;
}
