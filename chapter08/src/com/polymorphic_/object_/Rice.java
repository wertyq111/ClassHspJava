package com.polymorphic_.object_;

public class Rice extends Food {
    private String name;

    public Rice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
