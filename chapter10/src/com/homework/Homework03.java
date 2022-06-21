package com.homework;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 动物类Animal包含了抽象方法 shout();
 * 2. Cat 类继承了 Animal， 并实现方法shout，打印 "喵喵喵"
 * 3. Dog 类继承了 Animal， 并实现方法shout，打印 "汪汪汪"
 * 4. 在主方法中实例化对象 Animal cat = new Cat();并调用cat的shout方法
 * 5. 在主方法中实例化对象 Animal dog = new Dog();并调用dog的shout方法
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        //匿名内部类写法
        new Animal(){
            @Override
            void shout() {
                System.out.println("汪汪汪");
            }
        }.shout();
    }
}

abstract class Animal{
    abstract void shout();
}

class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("喵喵喵");
    }
}
