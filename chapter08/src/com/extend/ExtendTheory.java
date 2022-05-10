package com.extend;

/**
 * √案例
 * 我们看一个案例来分析当子类继承父类，创建子类
 * 对象时，内存中到底发生了什么？老韩提示：当子类
 * 对象创建好后，建立查找的关系
 * 讲解继承的本质
 */
public class ExtendTheory {
    public static void main(String[] args) {
        Son son = new Son(); //内存的布局
        //?-> 这时请大家注意, 要按照查找关系来返回信息
        //  1. 首先看子类是否有该属性
        //  2. 如果子类有这个属性, 并且可以访问, 则返回信息
        //  3. 如果子类没有这个属性, 父类有这个属性, 并且可以访问, 则返回信息
        //  4. 如果父类没有这个属性就按照(3)的规则继续找上级父类, 直到 Object类
        System.out.println(son.name);//返回大头儿子
        System.out.println(son.age);//返回大头爸爸的年龄
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 39;
}

class Son extends Father {
    String name = "大头儿子";
}
