package com.softserve.hw9.task1;

import java.util.Set;

public class App {
    public static void main(String[] args) {

    }
    static public Set union(Set set1, Set set2) {
        set1.addAll(set2);
        return set1;
    }

    static public Set intersect(Set set1, Set set2) {
        set1.retainAll(set2);
        return set1;
    }
}
