package com.softserve.edu07;

public class A extends ABase { // extends Object
    private int i = 12;

    public A() {
        System.out.println("constructor A()");
    }

    public A(int i) {
        this.i = i;
        System.out.println("constructor A(int i)");
    }

    public int getI() {
        System.out.println("\tgetI() from A");
        return i;
    }

    //public static void m() {
    public void m() {
        System.out.println("\t m() from A");
    }

}
