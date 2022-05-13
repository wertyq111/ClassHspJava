package com.polymorphic_;

import com.polymorphic_.object_.*;

/**
 * 传统的方法带来的问题是什么？如何解决？
 * 问题是：代码的复用性不高，而且不利于代码维护
 * 解决方案：引出我们要讲解的多态
 */
public class Poly {
    public static void main(String[] args) {
        Master master = new Master("master");
        Dog dove = new Dog("Dove");
        Bone bone = new Bone("大排骨");

        Cat semi = new Cat("Semi");
        Fish fish = new Fish("大黄鱼");

        Pig pig = new Pig("Pegi");
        Rice rice = new Rice("米饭");

        master.feed(dove, bone);
        master.feed(semi, fish);
        master.feed(pig, rice);
    }
}
