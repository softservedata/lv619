package com.softserve.hw9.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {
    static Map<String, String > personMap = new HashMap<>();

    public static void main(String[] args) {
        initialization();
        System.out.println(personMap);
        System.out.println(findMembersSameName(personMap));
        String name = "Ronald";
        System.out.println(removePerson(personMap, name));

    }
    public static void initialization() {
        personMap.put("Messi", "Lionel");
        personMap.put("Ronaldo", "Christiano");
        personMap.put("DeBour", "Ronald");
        personMap.put("Koeman", "Ronald");
        personMap.put("Shevchenko", "Andriy");
        personMap.put("VanBasten", "Marko");
        personMap.put("Zidane", "Zinedine");
        personMap.put("Pirlo", "Andrea");
        personMap.put("Levandovski", "Robert");
        personMap.put("Beckham", "David");
    }
    public static Map findMembersSameName(Map<String, String> members) {
        Map<String, String> sameName = new HashMap<>();
        for (Map.Entry<String, String> entry: members.entrySet()) {
            for (Map.Entry<String, String> entry1: members.entrySet()) {
                if (entry.getValue().equals(entry1.getValue()) &&
                        !entry.getKey().equals(entry1.getKey())) {
                    sameName.put(entry.getKey(), entry.getValue());
                    sameName.put(entry1.getKey(), entry1.getValue());
                }
            }
        }
        return sameName;
    }
    public static Map removePerson(Map<String, String> members, String person) {
        for (Iterator<Map.Entry<String, String>> iterator = members.entrySet().iterator(); iterator.hasNext(); ) {
            if (iterator.next().getValue().equals(person)) {
                iterator.remove();
            }
        }
        return members;
    }
}
