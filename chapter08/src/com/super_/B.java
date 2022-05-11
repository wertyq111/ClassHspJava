package com.super_;

public class B extends A {
    public int n1 = 101;

    //编写测试方法
    public void test() {
        //super的访问不限于直接父类,
        // 如果超类和本类中有同名的成员, 也可以使用super去访问超类的成员.
        // 如果多个超类(基类/上级类)中都有同名的成员,
        // 使用super访问遵循就近源则
        super.eat();
    }

    public void sum() {
        System.out.println("B类的sum方法");
        //希望调用A类的cal方法


        //找cal方法时,
        //  1. 先找本类,如果有,并且可以调用则调用,
        //  2. 如果没有则找父类
        //  3. 如果没有则找超类
        // 提示: 如果查找方法中找到了,但是不能访问则报错. 如果没有找到也报错
        cal();
        this.cal(); //等价 cal();
        super.cal(); //直接查找父类的cal()方法, 其他都一样


        //演示访问属性的规则
        //查找n1的规则:
        //1. 先找本类,如果有,并且可以访问则访问,
        //2. 如果没有则找父类
        //3. 如果没有则找超类
        //4. 如果没有或者找到却不能访问则报错
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1); //直接查找父类的n1属性, 其他都一样
    }

    public void cal() {
        System.out.println("B类的cal方法");
    }
}
