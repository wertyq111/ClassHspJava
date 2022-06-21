package com.annotation_;

import com.annotation_.object_.Father;

/**
 * @author zhouxufeng
 * @version 1.0
 */
public class OverrideDetail {
    public static void main(String[] args) {
        Son son = new Son();
        son.fly();
    }
}

class Son extends Father { //子类
    //1. @Override 注解表示重写父类的方法。
    // 2. 如果没有@Override 也表示重写了父类方法。
    // 3. 如果写了@Override注解， 编译器就会去检查该方法是否真的重写了父类的方法， 如果子类的方法没有重写父类的方法，则编译器会报错.
    // 4. 追踪 @Override 的定义 解读： 看到 @interface 就表示是一个注解类
    @Override
    public void fly() {
        System.out.println("Son can fly");
    }
}
