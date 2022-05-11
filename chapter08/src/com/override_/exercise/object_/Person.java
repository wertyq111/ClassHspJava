package com.override_.exercise.object_;

public class Person {
    private String name;
    private int age;

    public Person() {
        //无参构造器
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String say() {
        return "我的名字是" + name + "，我的年龄是" + age;
    }
}
