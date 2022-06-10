package com.abstract_;

public class AbstractDetail {
    public static void main(String[] args) {
        //new A(); //抽象类不能被实例化
        B b = new B();
        b.hi2();
    }
}

//抽象类可以没有abstract方法，但是有abstract方法必须声明为抽献给
abstract class A {
    public void hi() {
        System.out.println("hi");
    }

    public abstract void hi2();
}

class B extends A {
    public void hi2() {
        System.out.println("B hi");
    }
}
