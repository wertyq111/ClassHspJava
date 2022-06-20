package com.inner_class_;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer05 outer = new Outer05();
        outer.m1();

        //外部其它类使用静态内部类
        //1. 创建对象直接调用静态内部类
        Outer05.Inner05 inner05 = new Outer05.Inner05();
        inner05.f1();

        System.out.println("===============================");
        //2. 通过外部类的方法获取静态内部类
        Outer05.Inner05 inner05_2 = outer.getInnerInstance();
        inner05_2.f1();

        System.out.println("===============================");
        //3. 通过外部类的静态方法直接调用静态内部类
        Outer05.getInnerInstance_().f2();
    }
}

class Outer05 {
    private static int n1 = 99;
    public String name = "张三";
    private static double sal = 99.8;

    static class Inner05 {
        public void f1() {
            //只能访问外部类的静态成员
            System.out.println("n1 = " + n1);
        }

        public static void f2() {
            //只能访问外部类的静态成员
            System.out.println("sal = " + sal);
        }
    }

    public void m1() {
        //可以直接访问静态内部类中的静态方法，不能访问非静态方法
        Inner05.f2();
    }

    public Inner05 getInnerInstance() {
        return new Inner05();
    }

    public static Inner05 getInnerInstance_() {
        return new Inner05();
    }
}
