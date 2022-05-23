package com.homework;

import com.homework.object_.Doctor;

/**
 * 编写Doctor类{name,age,job,gender,sal}
 * 相应的getter()和setter)方法，5个参数的构造器，重写父类的equals()方法：
 * public boolean equals(Object obj),
 * 并判断测试类中创建的两个对象是否相等。
 * 相等就是判断属性是否相同
 */
public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("张三", '男', 20,"医生", 15000);
        Doctor doctor1 = new Doctor("张三", '男', 20, "医生", 15000);

        System.out.println(doctor.equals(doctor1));
    }
}
