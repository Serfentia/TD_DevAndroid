package com.example.td5_les_listes;

public class Contact {

    String nom;
    String prenom;
    String imageUrl;

    public Contact(String m_prenom, String m_nom, String m_imageUrl) {
        this.prenom=m_prenom;
        this.nom=m_nom;
        this.imageUrl=m_imageUrl;
    }

    //Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
