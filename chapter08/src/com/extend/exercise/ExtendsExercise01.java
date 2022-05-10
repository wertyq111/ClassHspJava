package com.extend.exercise;

/**
 * 课堂练习
 * main函数中, B b = new B(); 会输出什么?
 */
public class ExtendsExercise01 {
    public static void main(String[] args) {
        //B b = new B();
        //回答
        System.out.println("A");
        System.out.println("B name is abc");
        System.out.println("B");
    }
}

class A {
    A() {
        System.out.println("A");
    }

    A(String name) {
        System.out.println("A name is " + name);
    }
}

class B extends A{
    B() {
        this("abc");
        System.out.println("B");
    }

    B(String name) {
        System.out.println("B name is " + name);
    }
}