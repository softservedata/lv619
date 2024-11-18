package com.softserve.refresh;

public class BankAccount{
    private String  accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {//add paremeter in method

        balance += deposit;
    }

    public void withdraw(double withdraw) {//add paremeter in method

        if (balance >= withdraw) {
            balance -= withdraw;
        }
    }
}
