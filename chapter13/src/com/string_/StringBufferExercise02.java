package com.string_;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 输入商品名称和商品价格， 要求打印效果实例， 使用前面学习的方法完成：
 * 商品名 商品价格
 * 手机 123，5,64.59
 * 要求： 价格的小数点前面每三位用逗号隔开
 */
@SuppressWarnings({"all"})
public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入商品名：");
        String name = scanner.next();

        System.out.println("输入商品价格：");
        String price = null;
        try {
            double doublePrice = scanner.nextDouble();
            price = doublePrice + "";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("商品名\t商品价格");

        //处理商品价格
        StringBuffer sbPrice = new StringBuffer().append(price);
        int endIndex = 0;
        if(sbPrice.indexOf("-") == 0) {
            endIndex = 1;
        }
        for(int i = sbPrice.lastIndexOf(".") - 3; i > endIndex; i -= 3) {
            sbPrice = sbPrice.insert(i, ",");
        }

        System.out.println(name + "\t" + sbPrice);
    }
}
