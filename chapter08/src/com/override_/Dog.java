package com.override_;

public class Dog {
    public void cry() {
        System.out.println("小狗叫声:汪汪汪");
    }

    //子类方法的返回类型和父类方法的返回类型一样,或者是父类返回类型的子类
    // 比如: 父类返回类型是 Object ,子类方法返回的是 String
    public String m1() {
        return null;
    }

    //子类方法不能缩小父类方法的访问权限
    // public > protected > 默认 > private
    public void eat() {
        System.out.println("小狗吃骨头");
    }
}
