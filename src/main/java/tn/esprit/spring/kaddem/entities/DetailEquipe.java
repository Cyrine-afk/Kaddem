package tn.esprit.spring.kaddem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Integer idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne(mappedBy="Detail_Equipe")
    private Equipe equipe;
}
