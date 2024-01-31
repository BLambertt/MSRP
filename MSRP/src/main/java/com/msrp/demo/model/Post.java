package com.msrp.demo.model;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "Post")
public class Post {


    @Id
    private Long id;

    public Post() {

    }

    public void setId(Long id) {
        this.id = id;
    }



    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Utilisateur user;

    @OneToMany(mappedBy = "post")
    private List<Commentaire> commentaireList;

    @OneToMany(mappedBy = "post")
    private List<Plante> planteList;

    @Column(name = "titre")
    private String titre;

    @Column(name = "texte")
    private String texte;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public Long getId() {
        return id;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    public List<Plante> getPlanteListList() {
        return planteList;
    }

    public void setPlanteListList(List<Plante> planteList) {
        this.planteList = planteList;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Post(Long id, Utilisateur user, List<Commentaire> commentaireList, List<Plante> planteListList, String titre, String texte) {
        this.id = id;
        this.user = user;
        this.commentaireList = commentaireList;
        this.planteList = planteListList;
        this.titre = titre;
        this.texte = texte;
    }
}
