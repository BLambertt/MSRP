package com.msrp.demo.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Asset")
public class Asset {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "BLOB")
    private String blob;

    @Column(name = "META_DATA")
    private String metaData;

    @Column(name = "NOM")
    private String name;

    @Column(name = "MYME_TYPE")
    private String mymeType;

    @ManyToMany(mappedBy = "assetList")
    private List<Plante> planteList;

    @ManyToMany(mappedBy = "assetList")
    private List<Utilisateur> userList;

    @ManyToMany(mappedBy = "assets")
    private List<Commentaire> commentaires;

    public Asset(int id, String blob, String metaData, String name, String mymeType) {
        this.id = id;
        this.blob = blob;
        this.metaData = metaData;
        this.name = name;
        this.mymeType = mymeType;
    }

    public List<Plante> getPlanteList() {
        return planteList;
    }

    public void setPlanteList(List<Plante> planteList) {
        this.planteList = planteList;
    }

    public Asset() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlob() {
        return blob;
    }

    public void setBlob(String blob) {
        this.blob = blob;
    }

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMymeType() {
        return mymeType;
    }

    public void setMymeType(String mymeType) {
        this.mymeType = mymeType;
    }
}
