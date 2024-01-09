package com.msrp.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

public class Commentaire {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "TEXTE")
    private String texte;

    @Column(name = "DATE")
    private LocalDate date;

    @Column(name = "ID_POST")
    //todo relation
    private Post post;

    @Column(name = "ID_DEMANDE_GARDIENNAGE")
    //todo relation
    private DemandeGardiennage demandeGardiennage;

    @Column(name = "ID_UTILISATEUR")
    //todo relation
    private Utilisateur auteur;

    @Column(name = "ID_ASSETS")
    @ManyToMany(mappedBy = "commentaires")
    private Set<Assets> assets;

    //Commmentaire de post
    public Commentaire(String texte, LocalDate date, Post post, Utilisateur auteur, Set<Assets> assets) {
        this.texte = texte;
        this.date = date;
        this.post = post;
        this.auteur = auteur;
        this.assets = assets;
    }

    //Commentaire sur une demande de gardiennage
    public Commentaire(String texte, LocalDate date, DemandeGardiennage demandeGardiennage, Utilisateur auteur, Set<Assets> assets) {
        this.texte = texte;
        this.date = date;
        this.demandeGardiennage = demandeGardiennage;
        this.auteur = auteur;
        this.assets = assets;
    }

    public Commentaire() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public DemandeGardiennage getDemandeGardiennage() {
        return demandeGardiennage;
    }

    public void setDemandeGardiennage(DemandeGardiennage demandeGardiennage) {
        this.demandeGardiennage = demandeGardiennage;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public void setAuteur(Utilisateur auteur) {
        this.auteur = auteur;
    }

    public Set<Assets> getAssets() {
        return assets;
    }

    public void setAssets(Set<Assets> assets) {
        this.assets = assets;
    }
}
