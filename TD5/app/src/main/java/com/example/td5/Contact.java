package com.example.td5;

public class Contact {
    String nom;
    String prenom;
    String imageUrl;

    Contact(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getmPrenom(){
        return this.prenom;
    }

    public String getmNom(){
        return this.nom;
    }

}
