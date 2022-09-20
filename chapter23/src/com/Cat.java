package com;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Cat {
    private String name;
    public int age = 1;

    public Cat() {
        this.name = "西米";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hi() {
        this.name = "111";
        //System.out.println("小猫 " + name + " 正在对你喵喵叫");
    }
}
