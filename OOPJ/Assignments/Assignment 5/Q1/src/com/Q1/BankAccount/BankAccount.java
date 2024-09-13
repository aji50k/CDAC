package com.Q1.BankAccount;

public class BankAccount {
    // Protected access modifier allows access in subclasses
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    //deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    //withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: ₹" + amount);
        } else {
            System.out.println("Invalid withdraw amount. Please check the balance.");
        }
    }

    //return account details
    public String getAccountDetails() {
        return "Account Holder: " + accountHolderName + ", Balance: ₹" + String.format("%.2f", balance);
    }
}
