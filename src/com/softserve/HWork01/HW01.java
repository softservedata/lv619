package com.softserve.HWork01;

import java.util.Scanner;

public class HW01 {
    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Hello. What is your name?");
//        String name = br.readLine();
//        System.out.println("Where are you live " + name + "?");
//        String livingPlace = br.readLine();
//
//        System.out.println("You are " + name + " and you live in " + livingPlace);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = sc.nextLine();

        System.out.println("Where are you live " + name + " ?");
        String livingPlace = sc.nextLine();

        System.out.println("You are " + name + " and you live in " + livingPlace);


    }
}





