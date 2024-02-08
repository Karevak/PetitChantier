package francoisZANNIER.FULLBK.PetitChantier.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class TypeLocal {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    protected String nom;

}
