package com.customGeneric_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CustomMethodGenericExxercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();

        apple.fly(10);//Integer
        apple.fly(new Dog());//Dog
    }
}

@SuppressWarnings({"all"})
class Apple<T, R, M> {
    public<E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }

    //public void eat(U u) {} // 错误，不是泛型方法，只能使用类中的泛型T, R, M

    public void run(M m) {}
}

class Dog{}
