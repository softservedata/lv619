package com.sofserve.hw1;

public class App3 {
    public static void main (String[] args){
        double country1 = Double.parseDouble(args[0]) * Double.parseDouble(args[3]);
        double country2 = Double.parseDouble(args[1]) * Double.parseDouble(args[4]);
        double country3 = Double.parseDouble(args[2]) * Double.parseDouble(args[5]);
        double total = country1 + country2 + country3;
        System.out.println("Country 1 " + country1);
        System.out.println("Country 2 " + country2);
        System.out.println("Country 3 " + country3);
        System.out.println("Total " + total);
    }
}
