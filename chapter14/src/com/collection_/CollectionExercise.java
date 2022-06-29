package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author zhouxufeng
 * @version 1.0
 * 创建3个Dog{name, age}，并将它们添加到ArrayList中
 * 用迭代器和增强for循环两种方式来遍历
 * 重写Dog的toString方法，输出name和age
 */
@SuppressWarnings({"all"})
public class CollectionExercise {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Dog("a", 1));
        list.add(new Dog("b", 2));
        list.add(new Dog("c", 3));

        Iterator iterator = list.iterator();

        System.out.println("===iterator迭代器===");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("===增强for===");
        for(Object dog : list) {
            System.out.println((Dog)dog);
        }
    }
}

@SuppressWarnings({"all"})
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }
}
