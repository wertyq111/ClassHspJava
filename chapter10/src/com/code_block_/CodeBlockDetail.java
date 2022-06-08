package com.code_block_;

public class CodeBlockDetail {
    public static void main(String[] args) {
        new Movie("你好,李焕英");
        new Movie("你好,李焕英", 80);
        new Movie("你好,李焕英", 80, "贾玲");

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