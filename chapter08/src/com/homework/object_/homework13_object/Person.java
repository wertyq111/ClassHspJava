package com.homework.object_.homework13_object;

public class Person {
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String play() {
        return this.name + "爱玩";
    }

    public void showInfo() {
        System.out.println("姓名: " + getName());
        System.out.println("年龄: " + getAge());
        System.out.println("性别: " + getSex());
    }
}
