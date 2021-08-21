package com.softserve.edu01;

public class Example {
    private int i = 123;
    private static int j = 211;
    static int k = 233;

    public void myPrint() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello");
        //
        Example e1 = new Example();
        Example e2 = new Example();
        //
        e1.i = 456;
        System.out.println("e1.i = " + e1.i);
        System.out.println("e2.i = " + e2.i);
        //
        e1.myPrint();
        e2.myPrint();
        //
        e1 = new Example();
        System.out.println("main j = " + j);
        System.out.println("e1 = " + e1.toString());
    }
    
}