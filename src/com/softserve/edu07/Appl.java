package com.softserve.edu07;

public class Appl {
    public static void main(String[] args) {
//        B b = new B();
//        System.out.println("i = " + b.getI());
//        b.m();
        // b.super.m(); // super is private
        //
        /*-
        int i = 1234;
        double d = i;
        System.out.println("i = " + i + "  d = " + d);
        //
        d = 234.5;
        i = (int) d; // Code Smell;
        System.out.println("i = " + i + "  d = " + d);
        */
        /*-
        A a = new A(14);
        System.out.println("i = " + a.getI());
        B b = new B();
        //
        // b=a; // Error
        a = b;
        System.out.println("i = " + a.getI());
        //System.out.println("j = " + a.j); // Compile Error
        System.out.println("j = " + ((B) a).j); // Code Smell;
        */
        // /*-
        // ABase aa = new ABase(); // Error
        A a = new B();
        System.out.println("i = " + a.getI());
        if (a instanceof B) {
            System.out.println("1. j = " + ((B) a).j);
            B b = (B) a; // downCasting
            System.out.println("2. j = " + b.j);
        }
        a.m();
        //A.m();
        //B.m();
        // */
    }
}
