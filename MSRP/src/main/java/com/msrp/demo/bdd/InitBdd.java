package com.msrp.demo.bdd;

import com.msrp.demo.model.Commentaire;
import com.msrp.demo.model.Utilisateur;
import com.msrp.demo.repository.UtilisateurRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
class InitBdd {

    private static final Logger log = LoggerFactory.getLogger(InitBdd.class);

    @Bean
    CommandLineRunner initDatabase(UtilisateurRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Utilisateur(
                    "laurent",
                    "Le Foulgoc",
                    LocalDate.now(),
                    "Nantes",
                    "içi ou là",
                    "laurent@mail.test",
                    "myPassword",
                    "monRole", null)));
        };
    };
};