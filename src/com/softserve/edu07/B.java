package com.softserve.edu07;

public class B extends A {
    public int j = 321; // Achitecture (Encapsulation) Error

    public B() {
        //super();  // add from compiler
        //super(1); // for first; must be
        System.out.println("constructor B()");
        //super(1); // error
    }

    public B(int j) {
        super(2);
        this.j = j;
        System.out.println("constructor B(int j)");
    }

    @Override
    public int getI() {
        System.out.println("\tgetI() from B");
        //return super.getI();
        return j;
    }

    // @Override
    //public static void m() {
    public void m() {
        //super.m();
        System.out.println("\t m() from B");
    }
}