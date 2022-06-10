package com.final_;

import com.final_.object_.Circle;

public class FinalExercise01 {
    public static void main(String[] args) {
        //练习01:
        //编写一个程序，能够计算圆形的面积。要求圆周率为3.14， 赋值的位置3个方式都写一下
        Circle c = new Circle(10);

        System.out.println(c.getArea());
    }
}
