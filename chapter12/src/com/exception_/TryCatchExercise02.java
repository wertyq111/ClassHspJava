package com.exception_;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 如果用户输入的不是一个整数， 就提示它反复输入，直到输入一个整数为止
 */
@SuppressWarnings({"all"})
public class TryCatchExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("请输入一个整数");
            String num = scanner.nextLine();

            try {
                System.out.println("你输入的整数是" + Integer.parseInt(num));
                break;
            } catch (NumberFormatException e) {
                System.out.println("不是一个整数， 请重新输入");
            }
        }
    }
}
