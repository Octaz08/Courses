package Produit;

import java.util.*;

public class ProduitSurgele extends Produit {


    public ProduitSurgele(String nom, double prix, double poids) {

        super(nom, prix, poids);
    }

    public void affiche(){
        System.out.println(getNom() + " " + getPrix() + "€");
    }
}