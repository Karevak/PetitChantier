package francoisZANNIER.FULLBK.PetitChantier.controller;

import francoisZANNIER.FULLBK.PetitChantier.DAO.ConsommableDao;
import francoisZANNIER.FULLBK.PetitChantier.model.Consommable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsommableController {
    ConsommableDao consommableDAO;
    @Autowired
    public ConsommableController(final ConsommableDao consommableDAO){
        this.consommableDAO= consommableDAO;
    }

    @GetMapping("/listeConso")
    public ResponseEntity<List<Consommable>> listeConsommable(){
        return ResponseEntity.ok(consommableDAO.findAll());
            }

    @GetMapping("/consommable")
    public String consommable(){
        return "Page des consommables";

    }
}
