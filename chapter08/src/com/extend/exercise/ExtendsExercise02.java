package com.extend.exercise;

/**
 * 课堂练习
 * main方法中: C02 c = new C02();输出什么内容
 */
public class ExtendsExercise02 {
    public static void main(String[] args) {
        C02 c = new C02();
        //回答
//        System.out.println("我是A类");
//        System.out.println("haha, 我是B类的有参构造");
//        System.out.println("hello, 我是C类的有参构造");
//        System.out.println("我是C类的无参构造");
    }
}

class A02 {
    public A02() {
        System.out.println("我是A类");
    }
}

class B02 extends A02 {
    public B02() {
        System.out.println("我是B类的无参构造");
    }

    public B02(String name) {
        System.out.println(name + ", 我是B类的有参构造");
    }
}

class C02 extends B02 {
    public C02() {
        this("hello");
        System.out.println("我是C类的无参构造");
    }

    public C02(String name) {
        super("haha");
        System.out.println(name + ", 我是C类的有参构造");
    }
}

