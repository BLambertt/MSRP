package com.msrp.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Commentaire")
public class Commentaire {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "TEXTE")
    private String texte;

    @Column(name = "DATE")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "demande_id")
    private DemandeGardiennage demande;




    @ManyToOne
    @JoinColumn(name = "ID_UTILISATEUR", nullable = false)
    private Utilisateur auteur;



    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "commentaires_asset",
            joinColumns = { @JoinColumn(name = "commentaire_id") },
            inverseJoinColumns = { @JoinColumn(name = "asset_id") }
    )
    private Set<Asset> assets;

    //Commmentaire de post
    public Commentaire(String texte, LocalDate date, Post post, Utilisateur auteur, Set<Asset> assets) {
        this.texte = texte;
        this.date = date;
        this.post = post;
        this.auteur = auteur;
        this.assets = assets;
    }

    //Commentaire sur une demande de gardiennage
    public Commentaire(String texte, LocalDate date, DemandeGardiennage demandeGardiennage, Utilisateur auteur, Set<Asset> assets) {
        this.texte = texte;
        this.date = date;

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



    public Utilisateur getAuteur() {
        return auteur;
    }

    public void setAuteur(Utilisateur auteur) {
        this.auteur = auteur;
    }

    public Set<Asset> getAssets() {
        return assets;
    }

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }
}
