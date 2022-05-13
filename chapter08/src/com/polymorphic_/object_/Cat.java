package com.polymorphic_.object_;

public class Cat extends Animal {
    private String name;
    private int age;

    public Cat() {};
    public Cat(String name) {
        this.name = name;
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

    public void cry() {
        System.out.println("Cat " + name + " is crying");
    }

    public void eat() {
        System.out.println("Cat " + name + " is eating");
    }

    public void catchMouse() {
        System.out.println("Cat " + name + " is catching mouse");
    }
}
