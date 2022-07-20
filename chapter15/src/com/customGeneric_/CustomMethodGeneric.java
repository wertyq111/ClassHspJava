package com.customGeneric_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 1000000); //当调用方法时，传入参数，编译器就会确定类型
        car.fly(500, "飞行");
    }
}

@SuppressWarnings({"all"})
class Car {
    public void run() {//普通方法

    }

    //<T, R> 就是泛型， 是提供给fly使用的
    public <T, R> void fly(T t, R r) {//泛型方法

    }
}
