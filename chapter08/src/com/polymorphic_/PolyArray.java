package com.polymorphic_;

import com.polymorphic_.polyarr_.Person;
import com.polymorphic_.polyarr_.Student;
import com.polymorphic_.polyarr_.Teacher;

public class PolyArray {
    public static void main(String[] args) {
        //应用实例1: 现有一个继承结构如下:
        //  要求创建1个对象Person,
        //  2个Student 对象
        //  2个 Teacher 对象
        //  统一放在数组中,并调用每个对象say方法
        Person[] p = new Person[5];
        p[0] = new Person("张三", 20);
        p[1] = new Student("李四", 11, 50);
        p[2] = new Student("王五", 12, 60);
        p[3] = new Teacher("赵六", 28, 5000);
        p[4] = new Teacher("钱七", 35, 9000);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].say());
        }

        //应用实例2: 如何调用子类特有的方法
        //  比如Teacher 有一个teach, Student 有一个study
        //  怎么调用?
        for (int i = 0; i < p.length; i++) {
            if(p[i] instanceof Teacher) { //向下转型调用子类特有方法
                System.out.println(((Teacher) p[i]).teach());
            } else if(p[i] instanceof Student) {
                System.out.println(((Student) p[i]).study());
            }
        }
    }
}
