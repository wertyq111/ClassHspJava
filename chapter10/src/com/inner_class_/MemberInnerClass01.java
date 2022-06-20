package com.inner_class_;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer04 outer = new Outer04();
        outer.m1();

        //外部其他类，调用内部类的方法
        Outer04.Inner04 inner04 = outer.new Inner04();
        inner04.f1();
        //通过外部类方法获取成员内部类
        outer.getInnerInstance().f1();
    }
}

class Outer04 {
    private int n1 = 99;

    class Inner04 {
        public void f1() {
            System.out.println("n1 = " + n1);
        }
    }

    public void m1() {
        Inner04 inner = new Inner04();
        inner.f1();
    }

    public Inner04 getInnerInstance() {
        return new Inner04();
    }
}
