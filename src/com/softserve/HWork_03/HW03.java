package com.softserve.HWork_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HW03 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("What is the price for calls from USA per minute?");
//        double priceForUSA = Integer.parseInt(br.readLine());
//        System.out.println("What is the price for calls from Japan per minute?");
//        double priceForJapan = Integer.parseInt(br.readLine());
//        System.out.println("What is the price for calls from Germany per minute?");
//        double priceForGermany = Integer.parseInt(br.readLine());
//        System.out.println("Input call time from USA?");
//        double timeFromUSA = Integer.parseInt(br.readLine());
//        System.out.println("Input call time from Japan?");
//        double timeFromJapan = Integer.parseInt(br.readLine());
//        System.out.println("Input call time from Germany?");
//        double timeFromGermany = Integer.parseInt(br.readLine());
//        double totalPriceForUSA = priceForUSA * timeFromUSA;
//        double totalPriceForJapan = priceForJapan * timeFromJapan;
//        double totalPriceForGermany = priceForGermany * timeFromGermany;
//        double allTogetherCalls = totalPriceForUSA + totalPriceForJapan + totalPriceForGermany;
//
//        System.out.println("The call from USA will cost = " + totalPriceForUSA + "$" + "\nThe call from Japan will cost? = "
//        + totalPriceForJapan + "$" + "\nThe call from Germany will cost = " + totalPriceForGermany + "$");
//
//        System.out.println("All calls together will cost = " + allTogetherCalls + "$");

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is the price for calls from USA per minute?");
            double priceForUSA = sc.nextDouble();
            System.out.println("What is the price for calls from Japan per minute?");
            double priceForJapan = sc.nextDouble();
            System.out.println("What is the price for calls from Germany per minute?");
            double priceForGermany= sc.nextDouble();
            System.out.println("Input call time from USA?");
            double timeFromUSA = sc.nextDouble();
            System.out.println("Input call time from Japan?");
            double timeFromJapan = sc.nextDouble();
            System.out.println("Input call time from Germany?");
            double timeFromGermany = sc.nextDouble();
            double totalPriceForUSA = priceForUSA * timeFromUSA;
            double totalPriceForJapan = priceForJapan * timeFromJapan;
            double totalPriceForGermany = priceForGermany * timeFromGermany;
            double allTogetherCalls = totalPriceForUSA + totalPriceForJapan + totalPriceForGermany;

            System.out.println("The call from USA will cost = " + totalPriceForUSA + "$" + "\nThe call from Japan will cost? = "
            + totalPriceForJapan + "$" + "\nThe call from Germany will cost = " + totalPriceForGermany + "$");

            System.out.println("All calls together will cost = " + allTogetherCalls + "$");
    }
}


