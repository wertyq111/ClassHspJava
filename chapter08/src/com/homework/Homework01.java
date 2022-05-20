package com.homework;

import com.homework.object_.Person;

/**
 * 定义一个 Person 类(name, age, job)
 * 初始化 Person 对象数组
 * 有3个 Person 对象
 * 并按照 age 从大到小进行排序
 * 提示: 使用冒泡排序
 */
public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("张三", 18, "高中生"),
                new Person("李四", 27, "社畜"),
                new Person("赵五", 12, "小学生"),
        };

        int loopLength = persons.length - 1;

        for(int i = 0; i < loopLength; i++) {
            for(int j = 0; j < loopLength - i; j++) {
                int nextIndex = j + 1;

                if(persons[j].age < persons[nextIndex].age) {
                    Person tempPerson = persons[j];
                    persons[j] = persons[nextIndex];
                    persons[nextIndex] = tempPerson;
                }
            }
        }

        for(int i = 0; i < persons.length; i++) {
            System.out.println("姓名: " + persons[i].name + "\t年龄: " + persons[i].age + "\t工作: " + persons[i].job);
        }
    }
}
