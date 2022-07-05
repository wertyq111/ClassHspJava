package com.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author zhouxufeng
 * @version 1.0
 * 定义一个Employee类，该类包含: private String name; private int age;
 * 要求：
 *  1. 创建3个Employee 放入HashSet中
 *  2. 当 name和age的值相同时，认为是相同员工，不能添加到HashSet集合中
 */
@SuppressWarnings({"all"})
public class HashSetExercise01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 16));
        hashSet.add(new Employee("john", 16));
        hashSet.add(new Employee("jack", 16));

        System.out.println(hashSet);
    }
}

@SuppressWarnings({"all"})
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
