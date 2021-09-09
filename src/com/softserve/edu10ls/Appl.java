package com.softserve.edu10ls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        //List<Integer> arr = new ArrayList<>();
        List<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("arr = " + arr);
        arr.add(1, 5);
        System.out.println("arr = " + arr);
        arr.set(1, 6);
        System.out.println("arr = " + arr);
    }
}
