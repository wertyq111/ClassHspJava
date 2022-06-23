package com.homework;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 编写应用程序EcmDef, 接收命令行的两个参数(整数), 计算两数相除
 * 2. 计算两个数相除，要求使用方法 cal(int n1, int n2)
 * 3. 对数据格式不正确，缺少命令行参数，除0进行异常处理
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入两个整数:");
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        try {
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("需要输入两个整数");
            }
            EcmDef.cal(Integer.parseInt(n1), Integer.parseInt(n2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数据格式不正确：" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("缺少参数：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("不能进行除0操作：" + e.getMessage());
        }
    }
}

class EcmDef {
    public static void cal(int n1, int n2) throws NumberFormatException, ArithmeticException {
        System.out.println(n1 / n2);
    }
}
