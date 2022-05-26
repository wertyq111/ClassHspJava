package com.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.n2);
        System.out.println(B.n2);

        //类加载的时候就初始化了, 也就是说即使你没有创建对象, 只要类加载了, 就可以使用类变量.
        System.out.println(C.address);
    }
}

class B {
    public int n1 = 100;
    public static int n2 = 100;
}

class C {
    public static String address = "杭州";
}
