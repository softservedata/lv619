package com.softserve.refresh;

public class PreferredCustomer extends Customer{
    double discountRate;

    public PreferredCustomer(String name, String email, int maxPurchase, double discountRate) {
        super(name, email, maxPurchase);
        this.discountRate = discountRate;
    }

    public int applyDiscount(int amount) {
        return (int)(amount - amount * discountRate / 100);
    }

    @Override
    public void addPurchase(int amount) {
        super.addPurchase(applyDiscount(amount));
    }

    @Override
    public void displayPurchaseHistory() {
        super.displayPurchaseHistory();
    }

    public double getDiscountRate() {
        return discountRate;
    }



    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
