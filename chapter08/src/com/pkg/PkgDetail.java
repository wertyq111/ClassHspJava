// package 的作用是声明当前类所在的包, 需要放在类的最上面, 一个类中最多只有一句 package
package com.pkg;

// import 指令 位置放在package下面,在类定义前面,可以有多句并且没有顺序要求
import java.util.Scanner;

public class PkgDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
