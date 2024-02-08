package francoisZANNIER.FULLBK.PetitChantier.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Set;

@Entity
@Getter
@Setter
public class Site {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String nom;

    private int coordonneesGeo;

    private String adresse;

}
