package com.softserve.edu9.Task1;

import java.util.Set;

public class Sets<T> {

    public  Set<T> union(Set<T> set1, Set<T> set2) {
        set1.addAll(set2);
        return set1;
    }
    public Set<T> intersect(Set<T> set1, Set<T> set2) {
        set1.retainAll(set2);
        return set1;
    }

}
