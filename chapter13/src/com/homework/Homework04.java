package com.homework;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字
 */
@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个字符串: ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();

        int lowNum = 0;
        int upNum = 0;
        int intNum = 0;

        for(char c:chars) {
            if(c >= 'a' && c <= 'z') {
                lowNum++;
            }

            if(c >= 'A' && c <= 'Z') {
                upNum++;
            }

            if(c >= '0' && c <= '9') {
                intNum++;
            }
        }

        System.out.println(String.format("小写字母数为: %d, 大写字母数为： %d, 数字数量为：%d", lowNum, upNum, intNum));
    }
}
