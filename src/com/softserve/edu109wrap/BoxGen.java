package com.softserve.edu109wrap;

import java.io.Serializable;

//public class BoxGen<T> {
//public class BoxGen<T super MyClass> {
public class BoxGen<T extends Serializable> {
    private T obj;

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }

//    public static T todo() { // Error
//    }
}
