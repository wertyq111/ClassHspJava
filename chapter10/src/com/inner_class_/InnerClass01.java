package com.inner_class_;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 100; //属性
    public Outer(int n1) { //构造器
        this.n1 = n1;
    }

    public void m1() { // 方法
        System.out.println("n1 = "+n1);
    }

    { // 代码块
        System.out.println("代码块");
    }

    class Inner {//内部类

    }

}