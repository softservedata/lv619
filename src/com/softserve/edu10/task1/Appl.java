package com.softserve.edu10.task1;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        String sentense;
        Scanner in = new Scanner(System.in);
        System.out.print("Write sentense: ");
        sentense = in.nextLine();
        FindLongString f = new FindLongString(sentense);
        System.out.println("The longest word is: " + f.findLongString());
        System.out.println("The number of letters in this word: " + f.findLongString().length());
        System.out.println("The reserve word: " + f.reserveWord(2));
    }
}
