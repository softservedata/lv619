package com.softserve.edu04;

public final class Helper {
    private static String message; // = null
    
    static {
        message = "default";
        System.out.println("Helper static block done");
    } 
    
    private Helper() {
    }

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}
