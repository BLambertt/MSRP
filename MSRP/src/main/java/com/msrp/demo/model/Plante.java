package com.msrp.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PLANT")
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

    public Plante(int id, String nom, String description, int frequenArrosage) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.frequenArrosage = frequenArrosage;
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
