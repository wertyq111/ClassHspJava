package com.small_change_sys;

import com.small_change_sys.object_.SmallChangeSysOOP;

import java.util.Scanner;

public class SmallChangeSysApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmallChangeSysOOP smallChangeSysOOP = new SmallChangeSysOOP();

        //设置余额
        System.out.println("请设置当前钱包剩余的余额:");
        double balance = scanner.nextDouble();
        smallChangeSysOOP.setBalance(balance);

        boolean loop = true;

        do{
            //显示菜单
            System.out.println(smallChangeSysOOP.getMenu());
            int changeMenu = scanner.nextInt();

            switch(changeMenu) {
                case 1:
                    smallChangeSysOOP.showConsumerDetails();
                    break;
                case 2:
                    System.out.print("请输入收益金额:");
                    double incomeAmount = scanner.nextDouble();
                    if(smallChangeSysOOP.addIncome(incomeAmount) == true) {
                        System.out.println("入账成功");
                    }
                    break;
                case 3:
                    System.out.println("请输入消费金额:");
                    double consumeAmount = scanner.nextDouble();
                    System.out.println("请输入消费说明:");
                    String consumeName = scanner.next();
                    if(smallChangeSysOOP.addConsume(consumeName, consumeAmount) == true) {
                        System.out.println("消费成功");
                    }
                    break;
                case 4:
                    char confirm;
                    while(true){
                        System.out.println("你确定要退出吗? y/n");
                        confirm = scanner.next().charAt(0);
                        if(confirm == 'y' || confirm == 'n') {
                            break;
                        }
                    }
                    loop = smallChangeSysOOP.logout(confirm);
            }

        }while(loop);
    }
}
