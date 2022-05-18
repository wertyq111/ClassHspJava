package com.object_.object_;

public class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monster [name=" + name + "]";
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Monster " + name + " is being destroyed");
    }

}
