package com.msrp.demo.service;

import com.msrp.demo.model.Utilisateur;
import jdk.jshell.execution.Util;

import java.util.List;

public interface UtilisateurService {
    Utilisateur ajouter(Utilisateur utilisateur);
    List<Utilisateur> recupererTous();
    Utilisateur modifier(long id, Utilisateur utilisateur);
    String supprimer(long id);

}
