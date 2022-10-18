package tn.esprit.spring.kaddem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table( name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Integer idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niv;
    @OneToOne
    private DetailEquipe Detail_Equipe;
    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
