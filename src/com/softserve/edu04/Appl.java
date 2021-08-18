package com.softserve.edu04;

public class Appl { // extends Object
    private String name;

    static {
        System.out.println("Appl static block done");
    }

    // Overload
    public Appl() {
        //this.name = name;
        name = "";
    }

    // Overload
    public Appl(String name) {
        this.name = name;
    }

    // Overload
    public void print() {
        System.out.println(name);
    }

    // Overload
    public void print(String s) {
        System.out.println(s + " " + name);
    }

    // Overload
    public void print(String welcomeMessage, Object... messages) {
        System.out.print(welcomeMessage + "  ");
        for (Object msg : messages) {
            System.out.print(msg + "  ");
        }
    }

    public static void message(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        System.out.println("main start");
        /*-
        byte b = 1;
        b = (byte) (b + 1); // 1 is int type
        //b = b + (byte)1; // Error
        System.out.println("done b = " + b);
        //
        double d = 100.04;
        int i = (int) d;
        System.out.println("i = " + i);
        */
        /*-
        message("abc");
        //
        Appl app = new Appl("Ivan");
        app.print();
        app.print("Hello");
        app.print("Welcome", 1, 2, 3, "Petro", "Stepan");
        */
        //Helper.setMessage("hello");
        Helper.print();
        //
        /*-
        Helper helper = new Helper();
        helper.setMessage("new message");
        helper.print();
        */
    }

}
