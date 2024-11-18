package com.softserve.refresh;

import java.util.Arrays;

public class Customer {
    String name;
    String email;
    int[] purchaseHistory;
    int purchaseCount;

    public Customer(String name, String email, int maxPurchase) {
        this.name = name;
        this.email = email;
        purchaseHistory = new int[maxPurchase];
    }

    public void addPurchase(int amount) {
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        } else {
            System.out.println("array is full");
        }
    }

    public int calculateTotalExpenditure() {
        int sum = 0;
        if (purchaseHistory != null) {
            for (int i = 0; i < purchaseHistory.length; i++) {
                sum += purchaseHistory[i];
            }
        }
        return sum;
    }

    public void displayPurchaseHistory() {
        System.out.println(Arrays.toString(purchaseHistory));
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        PreferredCustomer pc = new PreferredCustomer("fgfg", "reggrgg", 1, 10.0);
        pc.addPurchase(100);
        pc.displayPurchaseHistory();
    }
}
