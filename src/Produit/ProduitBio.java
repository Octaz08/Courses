package Produit;

import java.util.*;

public class ProduitBio extends Produit{


    public ProduitBio(String nom, double prix, double poids) {

        super(nom, prix, poids);
    }

    public void affiche(){
        System.out.println(getNom() + " " + getPrix() + "€");
    }

}