package Produit;

import java.util.ArrayList;

public class Produit {

// declaration des attributs
    private String nom;
    private double prix = 0.0;
    private double poids = 0.0;

// initialisation des attributs
    public Produit(String nom, double prix, double poids){
        this.nom = nom;
        this.prix = prix;
    }

// getter and setter des attributs
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }

    public double getPrix(){
        return prix;
    }

    public void setPoids(double poids){
        this.poids = poids;
    }

    public double getPoids(){
        return poids;
    }



}
