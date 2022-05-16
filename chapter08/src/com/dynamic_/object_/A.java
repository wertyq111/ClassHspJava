package com.dynamic_.object_;

public class A {
    public int i = 10;

    public int sum() { // 当在父类方法中调用放法时触发动态绑定机制,优先调用子类getI()方法
        return getI() + 10;
    }

    public int sum1() { // 当在父类方法中调用属性时不出发动态绑定机制, 直接调用父类的i属性值
        return i + 10;
    }

    public int getI() {
        return i;
    }
}
