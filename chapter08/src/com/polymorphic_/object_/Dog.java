package com.polymorphic_.object_;

public class Dog extends Animal {
    private String name;

    public Dog() {};
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("Dog " + name + " is crying");
    }
}
