package com.homework;

import com.homework.object_.BankAccount;
import com.homework.object_.CheckingAccount;
import com.homework.object_.SavingAccount;

import java.util.Scanner;

/**
 * 扩展 BankAccount 类
 * 要求
 *  1. 在上面类的基础上扩展, 新类 CheckingAccount 对每次存款和取款都收取1美元的手续费
 *  2. 扩展前一个练习的 BankAccount 类, 新类 SavingAccount 每个月都有利息产生 (earnMonthlyInterest 方法被调用),
 *     并且有每月3次免手续费的存款或取款. 在 earnMonthlyInterest 方法中重置交易计数
 */
public class Homework08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingAccount savingAccount = new SavingAccount();

        System.out.print("请输入余额:");
        double balance = scanner.nextDouble();
        BankAccount checkingAccount = new CheckingAccount(balance);
        int num = savingAccount.getNum();

        while(true) {
            System.out.print("请选择存款(1)/取款(2)/退出(3): ");
            int change = scanner.nextInt();
            System.out.print("请输入金额: ");
            double amount = scanner.nextDouble();

            checkingAccount = savingAccount.operate(checkingAccount, change, amount);

            if(change != 1 && change != 2) {
                break;
            }
        }
    }
}
