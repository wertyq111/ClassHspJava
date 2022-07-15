package com.generic_;

import java.util.ArrayList;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("旺财", 2));
        dogs.add(new Dog("小黄", 3));
        dogs.add(new Dog("大黄", 1));
        dogs.add(new Dog("小花", 5));

        // 添加其他对象会报错
        //dogs.add(new Cat("西米", 1));

        for(Dog dog:dogs) {
            System.out.println(dog);
        }
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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
}

class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}

class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
