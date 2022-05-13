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

    //传统方法
//    public void feed(Dog dog, Bone bone){
//        System.out.println("主人 " + this.name + "给" + dog.getName() + "吃了" + bone.getName());
//    }
//
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人 " + this.name + "给" + cat.getName() + "吃了" + fish.getName());
//    }

    //使用多态机制,可以统一管理主任喂食物
    //animal 编译类型是Animal, 可以指向(接收) Animal子类的对象
    //food 编译类型是Food, 可以指向(接收) Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + this.name + " 给 " + animal.getName() + " 吃了 " + food.getName());
    }
}
