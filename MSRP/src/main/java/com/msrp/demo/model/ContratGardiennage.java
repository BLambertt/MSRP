package com.msrp.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Contrat_gardiennage")
public class ContratGardiennage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "DATE_DEBUT")
    private LocalDate date_debut;

    @Column(name = "DATE_FIN")
    private LocalDate date_fin;

//    @Column(name = "ID_UTILISATEUR")
//    //todo relation
//    private Utilisateur utilisateur;
//
//    @Column(name = "ID_DEMANDE_GARDIENNAGE")
//    //todo relation
//    private DemandeGardiennage demandeGardiennage;

    public ContratGardiennage(LocalDate date_debut, LocalDate date_fin, Utilisateur utilisateur, DemandeGardiennage demandeGardiennage) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
//        this.utilisateur = utilisateur;
//        this.demandeGardiennage = demandeGardiennage;
    }

    public ContratGardiennage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

//    public Utilisateur getUtilisateur() {
//        return utilisateur;
//    }
//
//    public void setUtilisateur(Utilisateur utilisateur) {
//        this.utilisateur = utilisateur;
//    }
//
//    public DemandeGardiennage getDemandeGardiennage() {
//        return demandeGardiennage;
//    }
//
//    public void setDemandeGardiennage(DemandeGardiennage demandeGardiennage) {
//        this.demandeGardiennage = demandeGardiennage;
//    }
}
