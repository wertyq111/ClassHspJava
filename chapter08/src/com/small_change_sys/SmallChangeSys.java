package com.small_change_sys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //收益数组
        Income incomes[] = new Income[0];
        //消费数组
        Consume consumes[] = new Consume[0];
        //余额
        double balance = 1000;

        //输出菜单界面
        System.out.println("-----------------零钱通菜单-----------------");
        System.out.println("\t\t\t1 零钱通明细");
        System.out.println("\t\t\t2 收益入账");
        System.out.println("\t\t\t3 消   费");
        System.out.println("\t\t\t4 退   出");
        System.out.print("请选择(1-4):");
        while(true) {
            int menu = scanner.nextInt();
            if(menu == 1) {
                System.out.println("-----------------零钱通明细-----------------");
                if(incomes.length > 0) {
                    for(int i = 0; i < incomes.length; i++) {
                        System.out.println("收益入账\t+" + incomes[i].amount
                                + "\t" + incomes[i].datetime + "\t" + incomes[i].balance);
                    }
                }
                if(consumes.length > 0) {
                    for(int i = 0; i < consumes.length; i++) {
                        System.out.println(consumes[i].name + "\t-" + consumes[i].amount + "\t"
                                + consumes[i].datetime + "\t" + consumes[i].balance);
                    }
                }
            } else if(menu == 2) {
                System.out.print("请输入金额:");
                double amount = scanner.nextDouble();
                //创建 Income 对象,并赋值
                Income income = new Income();
                income.amount = amount;
                date = new Date();
                income.datetime = simpleDateFormat.format(date);
                balance += amount;
                income.balance = balance;

                //创建临时Income对象数组,并插入income到临时数组中
                Income tempIncomes[] = new Income[incomes.length + 1];
                tempIncomes[incomes.length] = income;

                for(int i = 0; i < incomes.length; i++) {
                    tempIncomes[i] = incomes[i];
                }
                //将临时数组地址拷贝给incomes
                incomes = tempIncomes;
            } else if(menu == 3) {
                System.out.print("请输入消费名称:");
                String name = scanner.next();
                System.out.print("请输入消费金额:");
                double amount = scanner.nextDouble();

                //创建 Income 对象,并赋值
                Consume consume = new Consume();
                consume.name = name;
                consume.amount = amount;
                date = new Date();
                consume.datetime = simpleDateFormat.format(date);
                balance -= amount;
                consume.balance = balance;
                //创建临时Income对象数组,并插入income到临时数组中
                Consume tempConsumes[] = new Consume[consumes.length + 1];
                tempConsumes[consumes.length] = consume;

                for(int i = 0; i < consumes.length; i++) {
                    tempConsumes[i] = consumes[i];
                }
                //将临时数组地址拷贝给consumes1
                consumes = tempConsumes;
            } else if (menu == 4) {
                break;
            } else {
                System.out.println("输入有误,请重新输入!");
            }
            System.out.print("请选择(1-4):");
        }
    }
}

class Income {
    double amount;
    String datetime;
    double balance;
}

class Consume {
    String name;
    double amount;
    String datetime;
    double balance;
}
