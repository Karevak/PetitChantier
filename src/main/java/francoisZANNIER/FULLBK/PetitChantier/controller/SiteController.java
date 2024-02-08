package francoisZANNIER.FULLBK.PetitChantier.controller;

import francoisZANNIER.FULLBK.PetitChantier.DAO.SiteDao;
import francoisZANNIER.FULLBK.PetitChantier.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SiteController {

    @Autowired
    protected SiteDao siteDao;

    @GetMapping({"/Site"})
    public List<Site> listeSite(){
        return siteDao.findAll();
    }
}
