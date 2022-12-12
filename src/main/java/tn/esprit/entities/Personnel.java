package tn.esprit.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personnel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGarde;
    private String nom;
    private String prenom;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date dateDeRecrutement;
    private String Password;

    @Enumerated(EnumType.STRING)
    private Post poste;


    @OneToOne
    private Zone zone;






}
