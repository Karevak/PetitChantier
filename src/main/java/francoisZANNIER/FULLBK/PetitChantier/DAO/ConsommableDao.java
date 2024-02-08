package francoisZANNIER.FULLBK.PetitChantier.DAO;

import francoisZANNIER.FULLBK.PetitChantier.model.Consommable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsommableDao extends JpaRepository<Consommable,Integer> {

}
