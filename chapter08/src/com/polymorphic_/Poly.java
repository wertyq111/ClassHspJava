package com.polymorphic_;

import com.polymorphic_.object_.Bone;
import com.polymorphic_.object_.Dog;
import com.polymorphic_.object_.Cat;
import com.polymorphic_.object_.Fish;
import com.polymorphic_.object_.Master;

/**
 * 传统的方法带来的问题是什么？如何解决？
 * 问题是：代码的复用性不高，而且不利于代码维护
 * 解决方案：引出我们要讲解的多态
 */
public class Poly {
    public static void main(String[] args) {
        Master master = new Master("主人");
        Dog dove = new Dog("Dove");
        Bone bone = new Bone("大排骨");

        Cat semi = new Cat("Semi");
        Fish fish = new Fish("大黄鱼");

        master.feed(dove, bone);
        master.feed(semi, fish);
    }
}
