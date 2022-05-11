package com.polymorphic_.object_;

public class Bone extends Food{
    private String name;

    public Bone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
