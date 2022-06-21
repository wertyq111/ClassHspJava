package com.homework;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 计算器接口具有work方法，功能是运算，有一个手机类CellPhone， 定义方法testWork测试计算功能, 调用计算器接口的work方法
 * 2. 要求调用CellPhone对象的testWork方法，使用上匿名内部类
 */
@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {
        new CellPhone().testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 15);

    }
}

interface Calculator {
    double work(double n1, double n2);
}

class CellPhone {
    public void testWork(Calculator calculator, double n1, double n2) {
        double result = calculator.work(n1, n2);
        System.out.println("计算结果：" + result);
    }
}
