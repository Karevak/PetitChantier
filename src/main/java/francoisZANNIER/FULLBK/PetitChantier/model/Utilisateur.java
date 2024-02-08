package francoisZANNIER.FULLBK.PetitChantier.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Utilisateur {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String prenom;

    public enum Role{
        responsable_site,
        gestionnaire_matériel
    }

    protected boolean admin;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('responsable site','gestionnaire matériel')")
    private Role role;

    protected String motDePasse;

    protected String email;

}
