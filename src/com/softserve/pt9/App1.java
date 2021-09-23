package com.softserve.pt9;

import java.util.*;

public class App1 {
    static List<Integer> myCollection = new LinkedList<>();
    static List<Integer> newCollection = new LinkedList<>();
    public static void main(String[] args) {
        initialization();
        System.out.println(myCollection);
        newCollection = findMoreThanFive(myCollection);
        System.out.println(newCollection);
        newCollection = insertNumbers(newCollection);
        for (Integer number : newCollection) {
            System.out.printf("position – %d, value of element – %d%n", newCollection.indexOf(number), number);
        }
        System.out.println(sortList(newCollection));


    }
    static void initialization() {
        for (int i = 0; i < 10; i++) {
            myCollection.add(new Random().nextInt(100));
        }
    }
    public static List<Integer> findMoreThanFive(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();
        for (Integer i: list) {
            if(i > 5) {
                newList.add(i);
            }
        }
        return newList;
    }

    public static List<Integer> removeMoreThanTwenty(List<Integer> list) {
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 20) {
                iterator.remove();
            }
        }
        return list;
    }
    public static List<Integer> insertNumbers(List<Integer> list) {
        list.add(2, -1);
        list.add(5, -4);
        list.add(8, -3);
        return list;
    }

    public static List<Integer> sortList(List<Integer> list) {
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        return list;
    }
}
