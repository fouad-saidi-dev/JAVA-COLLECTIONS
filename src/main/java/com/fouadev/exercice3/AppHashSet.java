package com.fouadev.exercice3;

import java.util.HashSet;

public class AppHashSet {
    public static void main(String[] args) {
        HashSet<String> groupA = new HashSet<>();
        groupA.add("etd1");
        groupA.add("etd2");
        groupA.add("etd3");

        System.out.println("group A: "+groupA);

        HashSet<String> groupB = new HashSet<>();
        groupB.add("etd4");
        groupB.add("etd5");
        groupB.add("etd6");

        System.out.println("group B: "+groupB);

        groupB.addAll(groupA);
        System.out.println("L'union de HashSet: "+groupB);
    }
}
