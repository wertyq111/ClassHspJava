package com.outputstream_;

import java.io.Serializable;

@SuppressWarnings({"all"})
public class Dog implements Serializable {
    private String name;
    private int age;
    //serialVersionUID 序列化的版本号， 可以提高兼容性
    private static final long serialVersionUID = 1L;

    //static和transient不会被序列化
    private static String nation;
    private transient String color;

    //序列化对象时， 要求里面属性的类型也需要实现序列化接口
    private Master master = new Master("Saber");

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", master=" + master +
                '}';
    }
}
