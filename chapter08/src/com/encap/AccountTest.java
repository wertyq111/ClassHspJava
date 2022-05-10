package com.encap;

import java.util.Scanner;

/**
 * 创建程序，在其中定义两个类：Account和AccountTest类体会Java的封装性。
 * 1.Account类要求具有属性：
 * 姓名（长度为2位3位或4位）、
 * 余额（必须>20）
 * 密码（必须是六位），
 * 如果不满足，则给出提示信息，并给默认值
 * 2.通过setXxx的方法给Account的属性赋值。
 * 3.在AccountTest中测试
 * 提示知识点：
 * String name="";
 * int len = name.length();
 */
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        System.out.println("请输入姓名：");
        while(true) {
            String name = sc.next();
            if(account.setName(name)) {
                break;
            }
        }

        System.out.println("请输入密码：");
        while(true) {
            String password = sc.next();
            if(account.setPassword(password)) {
                break;
            }
        }

        System.out.println("请输入余额：");
        while(true) {
            double balance = sc.nextDouble();
            if(account.setBalance(balance)) {
                break;
            }
        }

        System.out.println("======账户登录系统======");
        int passwordError = 0;
        while(true) {
            if(passwordError >= 3) {
                System.out.println("密码错误次数过多，禁止登录！");
                break;
            } else {
                System.out.println("请输入密码：");
                String password = sc.next();
                if (account.checkPassword(password)) {
                    System.out.println("账户信息如下:");
                    System.out.print("姓名：" + account.getName() + " 余额:" + account.getBalance());
                    break;
                } else {
                    passwordError++;
                }
            }
        }

    }
}

class Account {
    private String name;
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
            return true;
        } else {
            System.out.println("姓名长度不符合要求，请重新输入！");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
            return true;
        } else {
            System.out.println("余额不符合要求,必须大于20,请重新输入！");
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if(password.length() == 6) {
            this.password = password;
            return true;
        } else {
            System.out.println("密码长度不符合要求, 必须是6位,请重新输入！");
            return false;
        }
    }

    public boolean checkPassword(String password) {
        if (this.password.equals(password)) {
            return true;
        } else {
            System.out.println("密码错误！");
            return false;
        }
    }
}
