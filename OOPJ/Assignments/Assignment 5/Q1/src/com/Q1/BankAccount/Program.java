package com.Q1.BankAccount;

public class Program {
    public static void main(String[] args) {
        //BankAccount object
        BankAccount account = new BankAccount("John Doe", 5000);
        System.out.println(account.getAccountDetails());
        account.deposit(2000);
        account.withdraw(1000);
        System.out.println(account.getAccountDetails());

        //SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("Jane Doe", 10000, 5000);
        System.out.println(savingsAccount.getAccountDetails());
        savingsAccount.deposit(3000);
        savingsAccount.withdraw(6000); // Exceeds limit, will not be allowed
        savingsAccount.withdraw(4000); // Within limit, will be allowed
        System.out.println(savingsAccount.getAccountDetails());
    }
}
