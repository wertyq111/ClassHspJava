package com.homework.object_;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance) {
        super(balance);
    }

    public void depositFormalities(double amount) {
        double balance = super.getBalance();
        balance += (amount - 1);
        System.out.println("余额剩余: " + balance);
    }

    public void withdrawFormalities(double amount) {
        double balance = super.getBalance();
        balance -= (amount - 1);
        System.out.println("余额剩余: " + balance);
    }
}
