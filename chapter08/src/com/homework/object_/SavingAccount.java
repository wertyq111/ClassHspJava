package com.homework.object_;

public class SavingAccount{
    private int num = 3;

    public SavingAccount() { }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void earnMonthlyInterest() {
        this.num = 3;
        System.out.println("产生了利息");
    }

    public BankAccount operate(BankAccount bankAccount, int change, double amount) {
        if(this.num > 0) {
            this.num--;
            if(change == 1) {
                bankAccount.deposit(amount);
            } else {
                bankAccount.withdraw(amount);
            }
        } else {
            if(change == 1) {
                ((CheckingAccount)bankAccount).depositFormalities(amount);
            } else if(change == 2) {
                ((CheckingAccount)bankAccount).withdrawFormalities(amount);
            }
        }

        return bankAccount;
    }
}
