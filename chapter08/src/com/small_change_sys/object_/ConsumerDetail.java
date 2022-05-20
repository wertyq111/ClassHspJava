package com.small_change_sys.object_;

/**
 * 消费明细类
 *  1. 收益入账类, 消费类的父类
 */
public class ConsumerDetail {
    private String name;
    private double amount;
    private String date;
    private double balance;

    public ConsumerDetail(){}

    public ConsumerDetail(String name, double amount, String date, double balance) {
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
