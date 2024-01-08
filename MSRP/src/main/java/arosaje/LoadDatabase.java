package arosaje;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UtilisateurRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Utilisateur(
                    "laurent",
                    "Le Foulgoc",
                    new Date("now"),
                    "Nantes",
                    "içi ou là",
                    "laurent@mail.test",
                    "myPassword",
                    "monRole"
            )));
        };
    };
};