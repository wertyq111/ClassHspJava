package com.small_change_sys.object_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 零钱通项目OOP(面像对象)版本
 *  1. 获取菜单方法
 *  2. 显示菜单方法
 *  3. 消费明细对象
 *  4. 收益入账对象 继承 消费明细对象
 *  5. 消费对象 继承消费明细对象
 *  6. 退出方法
 */
public class SmallChangeSysOOP {
    private ConsumerDetail incomes[] = new Income[0];
    private ConsumerDetail consumes[] = new Consume[0];
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMenu() {
        String menu = "--------------零钱通系统--------------\n";
        menu += "\t\t\t1 零钱通明细\n";
        menu += "\t\t\t2 收益入账\n";
        menu += "\t\t\t3 消   费\n";
        menu += "\t\t\t4 退   出\n";
        menu += "请选择(1-4):";

        return menu;
    }

    public ConsumerDetail[] getConsumerDetails() {
        if((this.incomes.length + this.consumes.length) > 0) {
            ConsumerDetail consumerDetails[] = new ConsumerDetail[(this.incomes.length + this.consumes.length)];
            int num = 0;
            if(this.incomes.length > 0) {
                for(int i = 0; i < this.incomes.length; i++) {
                    consumerDetails[i] = this.incomes[i];
                    num++;
                }
            }

            if(this.consumes.length > 0) {
                for(int i = 0; i < this.consumes.length; i++) {
                    consumerDetails[num + i] = this.consumes[i];
                }
            }

            return consumerDetails;
        } else {
            return null;
        }
    }

    public void showConsumerDetails() {
        System.out.println("--------------零钱通明细--------------");
        if (getConsumerDetails() != null) {
            ConsumerDetail consumerDetails[] = getConsumerDetails();
            char mark = '+';
            for(int i = 0; i < consumerDetails.length; i++) {
                if(consumerDetails[i] instanceof Consume) {
                    mark = '-';
                } else {
                    mark = '+';
                }

                System.out.println(consumerDetails[i].getName() + "\t" + mark + consumerDetails[i].getAmount()
                        + "\t" + consumerDetails[i].getDate() + "\t" + consumerDetails[i].getBalance());
            }
        }
    }

    public boolean addIncome(double amount) {
        //判断入账金额是否正确
        if(amount <= 0) {
            System.out.println("入账金额须大于0");
            return false;
        }
        ConsumerDetail income = new Income();
        String name = income.getName();
        this.balance += amount;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        income.setName(name);
        income.setAmount(amount);
        income.setDate(simpleDateFormat.format(date));
        income.setBalance(this.balance);

        // 重新设置incomes长度并通过临时数组进行赋值
        ConsumerDetail tempIncomes[] = new Income[this.incomes.length + 1];
        for(int i = 0; i < this.incomes.length; i++) {
            tempIncomes[i] = this.incomes[i];
        }
        tempIncomes[this.incomes.length] = income;
        this.incomes = tempIncomes;

        return true;
    }

    public boolean addConsume(String name, double amount) {
        //判断消费金额是否正确
        if(amount > this.balance || amount <= 0) {
            System.out.println("消费金额须在1-" + this.balance + "之间");
            return false;
        }
        this.balance -= amount;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ConsumerDetail consume = new Consume(name, amount, simpleDateFormat.format(date), balance);

        // 重新设置 consumes 长度并通过临时数组进行赋值
        ConsumerDetail tempConsumes[] = new Consume[this.consumes.length + 1];
        for(int i = 0; i < this.consumes.length; i++) {
            tempConsumes[i] = this.consumes[i];
        }
        tempConsumes[this.consumes.length] = consume;
        this.consumes = tempConsumes;

        return true;
    }

    public boolean logout(char confirm) {
        if(confirm == 'y') {
            return false;
        }

        return true;
    }
}
