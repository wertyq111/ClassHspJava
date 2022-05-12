package com.polymorphic_.object_;

public class Cat extends Animal {
    private String name;

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

    public void cry() {
        System.out.println("Cat " + name + " is crying");
    }
}
