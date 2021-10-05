package com.softserve.edu15io;

public class ApplPrint {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("text text text text text text text text ");
            System.out.println("text text text text text text text text ");
            //Thread.sleep(1);
        }
        throw new RuntimeException("hohoho");
    }
}