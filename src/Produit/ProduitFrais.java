package Produit;

import java.util.*;

public class ProduitFrais extends Produit {
    
    public ProduitFrais(String nom, double prix, double poids) {
        super(nom, prix, poids);
    }

    public void affiche(){
        System.out.println(getNom() + " " + getPrix() + "€");
    }
}
