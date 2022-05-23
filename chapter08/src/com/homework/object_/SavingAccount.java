package com.homework.object_;

public class SavingAccount extends BankAccount {
    private int monthNum = 3;
    private double rate = 0.05;
    private double handlingFree = 1;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHandlingFree() {
        return handlingFree;
    }

    public void setHandlingFree(double handlingFree) {
        this.handlingFree = handlingFree;
    }

    @Override
    public void deposit(double amount) {
        if(monthNum <= 0) {
            System.out.println("收取手续费: " + handlingFree);
            amount -= handlingFree;

        } else {
            monthNum--;
        }
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if(monthNum <= 0) {
            System.out.println("收取手续费: " + handlingFree);
            amount += handlingFree;
        } else {
            monthNum--;
        }
        super.withdraw(amount);
    }

    public void earnMonthlyInterest() {
        monthNum = 3;
        double balanceRate = getBalance() * rate;
        setBalance(getBalance() + balanceRate);
        System.out.println("产生了利息: " + balanceRate + " 剩余余额: " + getBalance());
    }
}
