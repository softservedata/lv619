package com.softserve.edu9.Task2;

import java.util.HashMap;
import java.util.Map;

public class Appl {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Hural","Pavlo");
        personMap.put("Orest","Ivanov");
        personMap.put("Pavlo","Hural");
        personMap.put("Michael","John");
        personMap.put("Anne","Knight");
        personMap.put("Reon","Hill");
        personMap.put("Nada","Frank");
        personMap.put("Luella","Brand");
        personMap.put("Rahim","Frye");
        personMap.put("Carloson","Hopper");

        for(Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        personMap.remove("Orest");
        System.out.println("\n\n");
        for(Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
