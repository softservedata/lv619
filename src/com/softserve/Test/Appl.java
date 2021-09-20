package com.softserve.Test;

public class Appl {

    private String name;

    public Appl (String name) {
        this.name = name;
    }

    public void print() {

        System.out.println(name);
    }

    public  void print(String s) {
        System.out.println(s + " " + name);
    }

    public static void main(String[] args) {


//        byte b = 1;
//        b = (byte) (b + 1);
//        System.out.println("Value b = " + b);

//        double d = 100.04;
//        int i = (int) d;
//        System.out.println("Value i = " + i );
        Appl app = new Appl ("Ivan");
        app.print();
        app.print("Hello");
    }
}

