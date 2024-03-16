package com.fouadev.exercice1.main;

import com.fouadev.exercice1.presentation.Produit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {

        List<Produit> products = new ArrayList<>();

        // 1 - ajouter des produits
        products.add(new Produit(1,"pr1",200));
        products.add(new Produit(2,"pr2",100));
        products.add(new Produit(3,"pr3",200));
        products.add(new Produit(4,"pr4",100));

        // 2 - supprimer un produit
        products.remove(1);

        // 3 - afficher liste de produits
        System.out.println(products);

        // 4 - modifier un produit par indice
        products.set(0,new Produit(1,"pr1 updated",300));
        System.out.println("Apres La modification: "+products);

        // 5 - rechercher un produit par le nom
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        System.out.println("Product :"+products.get(index));

    }
}
