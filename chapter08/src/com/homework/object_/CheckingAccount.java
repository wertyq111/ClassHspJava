package com.homework.object_;

public class CheckingAccount extends BankAccount{
    private double handlingFree = 1;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }


    @Override
    public void deposit(double amount) {
        amount -= handlingFree;
        super.deposit(amount);
    }

    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
    }

    public void withdraw(double amount) {
        amount += handlingFree;
        super.withdraw(amount);
    }
}
