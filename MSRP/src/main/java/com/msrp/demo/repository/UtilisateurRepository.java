package com.msrp.demo.repository;


import com.msrp.demo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users", collectionResourceRel = "tab")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
