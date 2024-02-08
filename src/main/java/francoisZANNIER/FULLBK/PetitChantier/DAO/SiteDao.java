package francoisZANNIER.FULLBK.PetitChantier.DAO;

import francoisZANNIER.FULLBK.PetitChantier.model.Consommable;
import francoisZANNIER.FULLBK.PetitChantier.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteDao extends JpaRepository<Site,Integer> {

}
