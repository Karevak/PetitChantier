package francoisZANNIER.FULLBK.PetitChantier.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Stock {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;


    private int quantité;



}
