package com.inner_class_;

/**
 * 演示局部内部类
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer001 outer01 = new Outer001();
        System.out.println("outer01 hashcode="+outer01);
        System.out.println(outer01.n1);
        //System.out.println(((Outer001)outer01).n1);//向下转型才能调用子类的成员
        outer01.m1();
    }
}

class Outer01 {
    private int n1 = 100;
    public void m1() {
        final class Inner01 { //局部内部类
            //可以直接访问外部类的所有成员
            private int n1 = 200;
            public void f1() {
                System.out.println("局部内部类调用n1="+n1);
                //Outer01.this 本质就是外部类的对象，即哪个对象调用了m1, Outer01.this就是哪个对象,访问遵循就近原则
                System.out.println("调用外部类的n1="+Outer01.this.n1);
                System.out.println("Outer01.this hashcode="+Outer01.this);
            }
        }

        //class Inner02 extends Inner01 { }//如果Inner01 使用 final 修饰则不能进行继承

        //局部内部类只有在它的作用域中才能访问
        Inner01 inner01 = new Inner01();
        inner01.f1();
    }

    public void m2() {
    }
}

class Outer001 extends Outer01{
    public int n1 = 300;
}
