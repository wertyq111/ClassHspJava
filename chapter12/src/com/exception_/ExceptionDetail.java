package com.exception_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ExceptionDetail {
    public static void main(String[] args) {
        //运行时异常
        nullPointException();
        //artithmeticException();
        //arrayIndexOutOfBoundsException();
        //classCastException();
        //numberFormatException();

        //编译时异常
        //SQLException: 操作数据库时发生异常
        //IOException: 操作文件时发生异常
        //FileNotFoundException: 当操作一个文件不存在时,发生异常
        //ClassNotFoundException: 加载类, 而该类不存在时异常
        //EOFException: 操作文件,到文件末尾发生异常
        //IllegalArguementException: 参数异常
    }

    // NullPointException空指针异常
    public static void nullPointException() {
        String name = null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println("出现异常：" + e.getMessage());
        }
    }

    // ArithmeticException数学运算异常
    public static void artithmeticException() {
        int num1 = 100;
        int num2 = 0;

        System.out.println(num1 / num2);
    }

    // ArrayIndexOutOfBoundsException 数组下标越界异常
    public static void arrayIndexOutOfBoundsException() {
        int[] nums = {1,2,3};

        System.out.println(nums[3]);
    }

    // ClassCastException 类型转换异常
    public static void classCastException() {
        A b = new B();//向上转型
        B b1 = (B)b;//向下转型
        C c = (C)b;//类转换异常
    }

    // NumberFormatException 数字格式不正确
    public static void numberFormatException() {
        String name = "测试字符串";
        System.out.println(Integer.parseInt(name));
    }
}

class A {}

class B extends A{}

class C extends A{}
