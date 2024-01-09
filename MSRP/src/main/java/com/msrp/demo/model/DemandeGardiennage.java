package com.msrp.demo.model;

import com.msrp.demo.repository.UtilisateurRepository;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Set;

public class DemandeGardiennage {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DATE_DEBUT")
    private LocalDate date_debut;

    @Column(name = "DATE_FIN")
    private LocalDate date_fin;

    @Column(name = "LIEU")
    private String lieu;

    @Column(name = "ID_UTILISATEUR")
    //todo relation
    private Utilisateur utilisateur;

    @Column(name = "ID_COMMENTAIRE")
    //todo relation
    private Set<Commentaire> commentaires;

    public DemandeGardiennage(String description, LocalDate date_debut, LocalDate date_fin, String lieu, Utilisateur utilisateur) {
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.lieu = lieu;
        this.utilisateur = utilisateur;
    }

    public DemandeGardiennage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDate date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Set<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }
}
