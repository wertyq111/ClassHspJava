package com.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getInstance();
    }
}

//有一个类 GirlFriend
//只能有一个女朋友(饿汉式单例设计模式演示)
class GirlFriend {
    private String name;

    //步骤
    //1. 构造器私有化 => 防止new
    //2. 在类的内部直接创建
    //3. 提供一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        this.name = name;
    }

    // 对象， 通常是重量级的对象， 饿汉式可能造成对象创建但不使用
    private static GirlFriend gf = new GirlFriend("xqq");

    public static GirlFriend getInstance(){
        return gf;
    }
}
