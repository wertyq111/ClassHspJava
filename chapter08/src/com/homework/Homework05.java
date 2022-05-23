package com.homework;

import com.homework.object_.*;

/**
 * 设计父类一员工类。子类：工人类，农民类，教师类，科学家类，服务生类。
 * (1)其中工人，农民，服务生只有基本工资
 * (2)教师除基本工资外，还有课酬（元/天）
 * (3)科学家除基本工资外，还有年终奖
 * (4)编写一个测试类，将各种类型的员工的全年工资打印出来
 */
public class Homework05 {
    public static void main(String[] args) {
        Employee worker = new Worker("小甲", 8000);
        Employee farmer = new Farmer("小乙", 6000);
        Employee waiter = new Waiter("小丙", 7000);
        Employee teacher = new SchoolTeacher("小丁", 8000, 300, 150);
        Employee scientist = new Scientist("卯先生", 13000, 250000);

        worker.printAnnualSalary();
        farmer.printAnnualSalary();
        waiter.printAnnualSalary();
        teacher.printAnnualSalary();
        scientist.printAnnualSalary();
    }
}
