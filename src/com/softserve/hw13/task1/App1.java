package com.softserve.hw13.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Vasyl", "Petro", "Ivan", "Taras", "Olya");
        System.out.println("List1");
        System.out.println(list1);
        List<String> list2 = new ArrayList<>(list1);
        list2.removeIf((s -> s.length() < 5));
        System.out.println("List2");
        System.out.println(list2);
    }
}
