package com.abstract_;

import com.abstract_.object_.CommonEmployee;
import com.abstract_.object_.Manager;

/**
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。
 * 提供必要的构造器和抽象方法：work()。对于Manager类来说，他既是员工，还具有奖金（bonus）的属性。
 * 请使用继承的思想，设计CommonEmployee类和Manager类，
 * 要求类中提供必要的方法进行属性访问，实现work()，提示“经理/普通员工名字工作中...
 */
public class AbstractExercise01 {
    public static void main(String[] args) {
        CommonEmployee ce = new CommonEmployee("张三", 10, 5000);

        Manager m = new Manager("李四", 2, 10000, 8000);

        ce.work();
        m.work();



    }
}
