package com.code_block_;

import java.sql.SQLOutput;

public class CodeBlockDetail {
    public static void main(String[] args) {
//        new Movie("你好,李焕英");
//        new Movie("你好,李焕英", 80);
//        new Movie("你好,李焕英", 80, "贾玲");

        //静态代码块随着类的加载而执行但只执行一次
        //AA aa = new AA();
        //new AA();
//        System.out.println("===============");
        //静态成员被调用，普通代码块不会被执行,静态代码块会被执行
//        System.out.println(AA.age);

        //先执行静态成员再执行普通成员最后执行构造器
        AAA a1 = new AAA();
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //3个构造器 => 重载
    // 1. 下面三个构造器都有相同的语句
    // 2. 代码块看起来很冗余
    // 3. 这时我们可以把相同的语句,放入到一个代码块中即可
    // 4. 这样当我们不管调用哪个构造器,创建对象都会先调用代码块的内容
    // 5. 代码块调用的顺序优先于构造器
    {
        System.out.println("电影开始播放");
    }

    public Movie(String name) {
        System.out.println("正在播放<<" + name + ">>");
    }

    public Movie(String name, double price) {
        System.out.println("正在播放<<" + name + ">>, 票价: " + price + "元");
    }

    public Movie(String name, double price, String director) {
        System.out.println("正在播放" + director + "导演的<<" + name + ">>, 票价: " + price + "元");
    }
}

class AA  {
    public static int age = 3;
    static {
        System.out.println("AA 类的静态代码块被执行");
    }
    //普通代码块，在new对象时就会被调用
    {
        System.out.println("AA 类的普通代码块被执行");
    }
}

class AAA {
    public static int num = getVal();

    public int num2 = getVal2();

    static {
        System.out.println("AAA 静态代码块被调用");
    }

    {
        System.out.println("AAA 普通代码块被调用");
    }

    public AAA() {
        System.out.println("AAA 构造器被调用");
    }

    public static int getVal() {
        System.out.println("生成num值");
        return 777;
    }

    public int getVal2() {
        System.out.println("生成num2值");
        return 888;
    }
}