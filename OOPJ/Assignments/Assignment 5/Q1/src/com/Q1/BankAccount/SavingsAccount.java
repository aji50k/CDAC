package com.Q1.BankAccount;

public class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public SavingsAccount(String accountHolderName, double initialBalance, double withdrawalLimit) {
        super(accountHolderName, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding the withdraw method to impose a withdrawal limit
    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds the limit of ₹" + withdrawalLimit);
        } else {
            super.withdraw(amount);  // Calling the parent class withdraw method
        }
    }

    // Method to return account details including withdrawal limit
    @Override
    public String getAccountDetails() {
        return super.getAccountDetails() + ", Withdrawal Limit: ₹" + withdrawalLimit;
    }
}
