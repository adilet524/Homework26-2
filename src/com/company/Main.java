package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<City> hashSet = new HashSet<>();
        hashSet.add(new City("Karakol", 703));
        hashSet.add(new City("Bishkek", 312));
        hashSet.add(new City("Osh", 457));
        hashSet.add(new City("Balykchy", 345));
        hashSet.add(new City("Cholpon-Ata", 786));
        hashSet.add(new City("Kant", 534));
        hashSet.add(new City("Kara-Kol", 987));
        hashSet.add(new City("Isfana", 234));
        hashSet.add(new City("Toktogul", 156));

        TreeSet<City> treeSet = new TreeSet<>();
        for (City i : hashSet) {
            if (i.getCode() % 2 != 0) {
                treeSet.add(i);
            }
        }
        System.out.println(treeSet);
    }
}
