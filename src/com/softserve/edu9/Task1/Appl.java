package com.softserve.edu9.Task1;


import java.util.HashSet;
import java.util.Set;

public class Appl {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("Hello");
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");

        set2.add("Java");
        set2.add("C#");
        set2.add("JavaScript");
        set2.add("Python");
        Sets<String> sets = new Sets<>();
        Set<String> set3 = sets.union(set1,set2);
        Set<String> set4 = sets.intersect(set2, set2);

        for (String s : set3) {
            System.out.println(s);
        }
        System.out.println("\n\n");
        for(String s : set4) {
            System.out.println(s);
        }
    }
}
