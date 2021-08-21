
  
package com.softserve.edu01;

public class App {

    public static void main(String[] args) {
        int k = Example.k;
        System.out.println("k = " + k);
        //
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg = " + i + " is " + args[i]);
        }
        System.out.println("Done");
    }
}