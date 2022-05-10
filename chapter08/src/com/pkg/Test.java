package com.pkg;

import com.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同的包下,只能访问 public ,不能访问 protected, 默认, private 修饰的属性或方法
        System.out.println(a.n1);
    }
}
