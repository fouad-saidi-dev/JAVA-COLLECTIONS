package com.fouadev.exercice2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,Double> notes = new HashMap<>();

        // inserer des notes
        notes.put("etudiant1",15.00);
        notes.put("etudiant2",18.00);
        notes.put("etudiant3",13.00);
        notes.put("etudiant4",17.00);
        notes.put("etudiant5",20.00);
        System.out.println(notes);


        // Augmenter la note
        // method 1
        notes.replace("etudiant1",notes.get("etudiant1")+1);
        // method 2
        double augmenteNote = notes.compute("etudiant2",(key,value) -> value + 1);
        System.out.println("la valeur apres l'augmentation: "+augmenteNote);


        //supprimer la note d'un etudiant
        double deleteEtudiant = notes.remove("etudiant5");
        System.out.println("Etudiant supprime de note: "+deleteEtudiant);

        //la taille de map
        int sizeMap = notes.size();
        System.out.println("La taille de Map: "+sizeMap);

        //la note moyenne, max, min
        System.out.println("Values"+notes.values());
        int sum=0;
        for (Double note : notes.values()) {
            sum+=note;
        }
        System.out.println("La moyenne: "+sum/2);

        notes.values().stream().map(aDouble -> aDouble.shortValue()).toString();

        //System.out.println(notes.values().stream().max((o1, o2) -> ));

        // verify
        Boolean contain = notes.containsValue(20);
        System.out.println("Il y a une note egale a 20? "+contain);

        //forEach
        notes.forEach((key, value) -> System.out.println(key+" "+value));

    }
}
