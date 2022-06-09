package com.code_block_.exercise_object_;

public class Test {
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");
    static {
        System.out.println("static块执行");
        if(sam == null) System.out.println("sam is null");//已经实例了一个对象所以不为null
    }

    public Test() {
        System.out.println("Test默认构造函数被调用");
    }
}
