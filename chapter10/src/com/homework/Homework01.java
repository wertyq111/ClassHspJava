package com.homework;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(100);
        System.out.println(car);
        System.out.println(car1);
        //输出结果：
        // 1. 9.0 blue
        // 2. 100.0 blue // 因为color是静态属性，car实例化的时候已经把color赋值了，所以car1的color也是blue
    }
}

@SuppressWarnings({"all"})
class Car {
    double price = 10;
    static String color = "red";

    @Override
    public String toString() {
        return price + " " + color;
    }

    public Car() {
        this.price = 9;
        this.color = "blue";
    }

    public Car(double price) {
        this.price = price;
    }
}
