package francoisZANNIER.FULLBK.PetitChantier.controller;

import com.fasterxml.jackson.annotation.JsonView;

import francoisZANNIER.FULLBK.PetitChantier.DAO.UtilisateurDao;
import francoisZANNIER.FULLBK.PetitChantier.model.Utilisateur;
import francoisZANNIER.FULLBK.PetitChantier.security.JwtService;
import francoisZANNIER.FULLBK.PetitChantier.security.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UtilisateurController {

    @Autowired
    protected UtilisateurDao utilisateurDao;

    @Autowired
    protected PasswordEncoder passwordEncoder;

    @Autowired
    protected UserService userService;

    @Autowired
    protected AuthenticationProvider authenticationProvider;

    @Autowired
    protected JwtService jwtService;

    @PostMapping("/login")
    public String login(@RequestBody Utilisateur utilisateur){

        UserDetails userDetails = userService.loadUserByUsername(utilisateur.getEmail());

        try {
                authenticationProvider.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                utilisateur.getEmail(),
                                utilisateur.getMotDePasse()
                        )
                );
            }catch (AuthenticationException e){
            throw e;
        }
        return jwtService.generateJwt(userDetails);
    }
}
