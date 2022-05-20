package com.homework.object_;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("余额剩余: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("余额剩余: " + balance);
    }
}
