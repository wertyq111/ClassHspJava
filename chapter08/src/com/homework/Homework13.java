package com.homework;

import com.homework.object_.homework13_object.Person;
import com.homework.object_.homework13_object.Student;
import com.homework.object_.homework13_object.Teacher;

/**
 * 案例题目描述：
 * 1. 做一个Student类，Student类有名称(name),性别(sex),年龄(age)学号(stu id),做合理封装，通过构造器在创建对象时将4个属性赋值。
 * 2. 写一个Teacher类，Teacher类有名称(name),性别(sex),年龄(age),工龄(work age),做合理封装，通过构造器在创建对象时将4个属性赋值。
 * 3. 抽取一个父类Person类，将共同属性和方法放到Person类
 * 4. 学生需要有学习的方法(study),在方法里写生“我承诺，我会好好学习。”。
 * 5. 教师需要有教学的方法(teach),在方法里写上“我承诺，我会认真教学。”。
 * 6. 学生和教师都有玩的方法(play),学会玩的是足球，老师玩的是象棋，此方法是返回字符串的，分别返回“xx爱玩足球”和“xx爱玩象棋”
 *    (其中x分别代表学生和老师的姓名)。因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
 * 7. 定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序，
 * 8. 定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
 */
public class Homework13 {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("张三", '男', 20, 123456789),
                new Student("李四", '男', 18, 987654321),
                new Teacher("王五", '女', 30, 10),
                new Teacher("赵六", '男', 28, 8)
        };

        //冒泡排序
        Homework13 homework13 = new Homework13();
        persons = homework13.bubbleSort(persons);

        //打印输出排序后的多态数组,并调用对应的方法
        for (Person person : persons) {
            person.showInfo();
            System.out.println("---------------------------------");
        }
    }

    public Person[] bubbleSort(Person[] persons) {
        //按照年龄从高到低排序，使用冒泡排序
        int loopLength = persons.length - 1;
        for (int i = 0; i < loopLength; i++) {
            for (int j = 0; j < loopLength - i; j++) {
                int nextIndex = j + 1;
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    Person temp = persons[j];
                    persons[j] = persons[nextIndex];
                    persons[nextIndex] = temp;
                }
            }
        }
        return persons;
    }
}
