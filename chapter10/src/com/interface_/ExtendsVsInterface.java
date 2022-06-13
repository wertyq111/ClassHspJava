package com.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();
        wukong.swimming();
        wukong.flying();
    }
}

//父类
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//接口
interface Fish {
    void swimming();
}
interface Bird {
    void flying();
}

//小结
// 当子类继承了父类，就自动的拥有父类的功能
// 如果子类要扩展功能，可以通过实现接口的方式进行扩展
// 可以理解 实现接口 是 对java 单继承机制的一种补充
class LittleMonkey extends Monkey implements Fish,Bird{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(super.getName() + "学会了游泳");
    }


    @Override
    public void flying() {
        System.out.println(super.getName() + "学会了飞行");
    }
}
