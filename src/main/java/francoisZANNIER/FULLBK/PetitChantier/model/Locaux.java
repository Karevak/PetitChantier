package francoisZANNIER.FULLBK.PetitChantier.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Locaux {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String nom;

    private int surface;



    @ManyToOne
    private Site site;

}
