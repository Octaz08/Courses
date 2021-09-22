package Produit;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main (String[] arg){

        ProduitBio courgette = new ProduitBio("courgette", 5.5, 1.0);
        ProduitSurgele pizza = new ProduitSurgele("pizza", 2.5, 0.5);
        ProduitFrais yaourt = new ProduitFrais("yaourt", 1.0, 0.25);

        List<String> panier = new ArrayList<String>();
        panier.add(String.valueOf(courgette.getNom() + " " + courgette.getPrix() + "€"));
        panier.add(String.valueOf(pizza.getNom() + " " + pizza.getPrix() + "€"));
        panier.add(String.valueOf(yaourt.getNom() + " " + yaourt.getPrix() + "€"));

        /* 1ere façon d'afficher le panier
        System.out.println("Mon panier contient : ");
        for (String p : panier) {
            System.out.println(p);
        }
         */

        // 2eme façon d'afficher le panier avec la méthode affiche
        System.out.println("Mon panier contient :");
        courgette.affiche();
        pizza.affiche();
        yaourt.affiche();

        System.out.println("Le total du panier est de : " + (courgette.getPrix() + pizza.getPrix() + yaourt.getPrix() + "€"));
    }
}
