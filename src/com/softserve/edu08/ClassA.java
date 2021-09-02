package com.softserve.edu08;

public class ClassA {
    public int i = 1;

    public ClassA() {
        System.out.println("ClassA() done");
    }

    public double getI() {
        return i;
    }
    
    public void m1() {
        System.out.println("ClassA, metod m1, i=" + i);
    }

    public void m2() {
        System.out.println("ClassA, metod m2, i=" + i);
    }

    public void m3() {
        System.out.print("ClassA, metod m3, runnind m4(): ");
        m4();
    }

    public void m4() {
        System.out.println("ClassA, metod m4");
    }

    public static void m6() {
        System.out.println("ClassA, static metod m6");
    }

    public void m7() {
        System.out.println("ClassA, metod m7, getI() = " + getI());
    }

    protected void m8() {
        System.out.println("ClassA, metod m8");
    }

}
