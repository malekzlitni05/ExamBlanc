package tn.esprit.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZone;
    private String ref;
    private Float dimention;


    @ManyToOne
    private Parking parking;

    @OneToOne(mappedBy = "zone")
    private Personnel Zone_Personnel;


    @OneToMany()
    private Set<Personnel> personnels;
}
