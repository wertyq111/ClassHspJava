package com.polymorphic_.object_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Dog dog, Bone bone){
        System.out.println("主人" + this.name + "给" + dog.getName() + "吃了" + bone.getName());
    }

    public void feed(Cat cat, Fish fish) {
        System.out.println("主人" + this.name + "给" + cat.getName() + "吃了" + fish.getName());
    }
}
