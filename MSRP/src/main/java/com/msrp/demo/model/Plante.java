package com.msrp.demo.model;

import jakarta.persistence.*;
import jdk.jshell.execution.Util;

import java.util.List;

@Entity
@Table(name = "Plant")
public class Plante {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "FREQUENCE_ARROSAGE")
    private int frequenArrosage;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Plante_asset",
            joinColumns = { @JoinColumn(name = "plant_id") },
            inverseJoinColumns = { @JoinColumn(name = "asset_id") }
    )
    private List<Asset> assetList;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Utilisateur user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public Plante(int id, String nom, String description, int frequenArrosage) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.frequenArrosage = frequenArrosage;
    }


    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public List<Asset> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<Asset> assetList) {
        this.assetList = assetList;
    }

    public Plante() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFrequenArrosage() {
        return frequenArrosage;
    }

    public void setFrequenArrosage(int frequenArrosage) {
        this.frequenArrosage = frequenArrosage;
    }
}
