package com.msrp.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "DATE_DE_NAISSANCE")
    private Date date_de_naissance;
    @Column(name = "VILLE")
    private String ville;
    @Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "email")
    private String email;
    @Column(name = "MOT_DE_PASSE")
    private String mot_de_passe;
    @Column(name = "ROLE")
    private String role;

// TODO : Add ASSETS relatioship

    //constructor
    public Utilisateur(
            String prenom,
            String nom,
            LocalDate date_de_naissance,
            String ville,
            String adresse,
            String email,
            String mot_de_passe,
            String role
    ) {
        this.prenom = prenom;
        this.nom = nom;
        this.date_de_naissance = java.sql.Date.valueOf(date_de_naissance);
        this.ville = ville;
        this.adresse = adresse;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.role = role;
    }

    public Utilisateur() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Utilisateur{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

