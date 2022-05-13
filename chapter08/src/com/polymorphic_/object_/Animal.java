package com.polymorphic_.object_;

public class Animal {
    private String name;
    private int age;

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

    public void cry() {
        System.out.println("Animal is crying");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void run() {
        System.out.println("Animal is running");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void show() {
        System.out.println("Animal name is " + name);
        System.out.println("Animal age is " + age);
    }
}
