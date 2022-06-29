package com.homework;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 编写java程序，输入形式为： Han Shun Ping的人名，以Ping,Han.S的形式打印出来。
 * 其中.S是中间单词的首字母
 * 例如输入 "Willian Jefferson Clinton"， 输出形式为： Clinton,Willian .J
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入人名：");
        String name = scanner.nextLine();
        //String name = "Zhou Xu Feng";

        try {
            System.out.println(alias(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String alias(String name) {
        if(!(name != null && name.indexOf(" ") > 0)) {
            throw new RuntimeException("不是一个有效的人名");
        }
        String[] names = name.split(" ");
        if(names.length != 3) {
            throw new RuntimeException("名字长度不符合");
        }
        //return new String(names[2] + "," + names[0] + " ." + names[1].substring(0,1).toUpperCase());
        return String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
    }
}
