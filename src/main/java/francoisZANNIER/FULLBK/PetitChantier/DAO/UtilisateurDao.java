package francoisZANNIER.FULLBK.PetitChantier.DAO;

import francoisZANNIER.FULLBK.PetitChantier.model.Utilisateur;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UtilisateurDao {

    Optional<Utilisateur> findByEmail(String email);
}
