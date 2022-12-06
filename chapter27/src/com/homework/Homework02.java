package com.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 验证是不是整数或者小数
 * 提示: 这个题目要考虑正数和负数
 * 比如: 123 -345 34.89 -87.9 -0.01 0.45 等
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        while(true) {
            System.out.print("请输入数字:");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.next();

            //String regFloatStr = "^[\\-]?\\d+\\.\\d+$";
            //String regIntegerStr = "^[\\-]?\\d+$";

            String regStr = "^[-]?([1-9]\\d*|0)(\\.\\d+)?$";

            if(number.matches(regStr)) {
                System.out.println(number + "是整数或者小数");
            } else {
                System.out.println(number + "不是整数或者小数");
            }
        }
    }
}
