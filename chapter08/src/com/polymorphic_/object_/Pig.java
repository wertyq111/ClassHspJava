package com.polymorphic_.object_;

public class Pig extends Animal {
    private String name;

    public Pig(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
