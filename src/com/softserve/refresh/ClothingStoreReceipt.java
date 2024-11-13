package com.softserve.refresh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClothingStoreReceipt {
    public static void main(String[] args) {
        // Input nesecary data
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String customerName = null;
        int itemsBought = 0;
        double itemPrice = 0;
        String paymentMethod = null;

        try {
            System.out.println("Customer Name");
            customerName = reader.readLine();
            System.out.println("Items Bought");
            itemsBought = Integer.parseInt(reader.readLine());
            System.out.println("Item Price");
            itemPrice = Double.parseDouble(reader.readLine());
            System.out.println("Payment Method");
            paymentMethod = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Calculate here the total cost
        double totalCost = itemsBought * itemPrice;

        // Print purchase details
        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}