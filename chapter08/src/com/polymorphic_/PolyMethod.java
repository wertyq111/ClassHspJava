package com.polymorphic_;

public class PolyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A a = new A();
        //这里我们用不同的参数就会调用不同的sum方法,就体现了多态
        System.out.println(a.sum(1, 2));
        System.out.println(a.sum(1, 2, 3));

        //方法重写体现多态
        B b = new B();
        a.say();
        b.say();
    }
}

class B {
    public void say() {
        System.out.println("B类 say()方法被调用");
    }
}

class A extends B {
    public int sum(int n1, int n2) { //和下面的sum方法构成重载
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A类 say()方法被调用");
    }
}


