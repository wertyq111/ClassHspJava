package com.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        BoyFriend bf1 = BoyFriend.getInstance();
    }
}

//懒汉式单例设计模式
class BoyFriend {
    private String name;

    //步骤
    //1. 构造器私有化
    //2. 定义一个static静态属性对象
    //3. 提供一个public的static方法，可以返回一个BoyFriend对象

    private static BoyFriend bf;

    private BoyFriend(String name) {
        this.name = name;
    }

    public static BoyFriend getInstance() {
        if (bf == null) {
            bf = new BoyFriend("zxf");
        }

        return bf;
    }
}


