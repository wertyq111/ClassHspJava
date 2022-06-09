package com.static_;

public class MainDetail {
    private static String name="zhangsan";
    private int age = 2;

    public static void main(String[] args) {
        //可以直接调用静态的变量/属性/方法
        System.out.println("姓名：" + name);
        hi();

        //不可以直接访问本垒的非静态成员，需要先实例该类的对象再调用
        MainDetail maindetail = new MainDetail();
        System.out.println(maindetail.age);
        maindetail.simple();
    }

    private static void hi() {
        System.out.println("Hello 你好！");
    }

    private void simple() {
        System.out.println("simple");
    }
}
