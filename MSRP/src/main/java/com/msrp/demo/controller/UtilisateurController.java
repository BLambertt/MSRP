package com.msrp.demo.controller;

import com.msrp.demo.exception.UtilisateurNotFoundException;
import com.msrp.demo.model.Utilisateur;
import com.msrp.demo.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurController {

    private final UtilisateurRepository repository;

    UtilisateurController(UtilisateurRepository repository){
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/utilisateurs")
    List<Utilisateur> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/utilisateur")
    Utilisateur newUtilisateur(@RequestBody Utilisateur newUtilisateur) {
        return repository.save(newUtilisateur);
    }

    // Single item

    @GetMapping("/utilisateur/{id}")
    Utilisateur one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new UtilisateurNotFoundException(id));
    }

    @PutMapping("/utilisateur/{id}")
    Utilisateur replaceUtilisateur(@RequestBody Utilisateur newUtilisateur, @PathVariable Integer id) {

        return repository.findById(id)
                .map(utilisateur -> {
                    utilisateur.setNom(newUtilisateur.getNom());
                    utilisateur.setRole(newUtilisateur.getRole());
                    return repository.save(utilisateur);
                })
                .orElseGet(() -> {
                    newUtilisateur.setId(id);
                    return repository.save(newUtilisateur);
                });
    }

    @DeleteMapping("/utilisateur/{id}")
    void deleteUtilisateur(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
