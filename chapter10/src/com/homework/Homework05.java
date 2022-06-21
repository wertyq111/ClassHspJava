package com.homework;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 编写一个A 类，在类中定义局部内部类B，B中有一个私有常量name， 有一个方法show()打印常量name，进行测试
 * 2. 进阶：A中也定义一个私有的变量name，在show方法中打印测试
 */
@SuppressWarnings({"all"})
public class Homework05 {
    public static void main(String[] args) {
        new A();
    }
}

class A {
    private final String name = "A";

    {
        class B {
            final static String name = "B";

            public void show() {
                System.out.println("内部类的name：" + name + "\n外部类的name：" + A.this.name);
            }
        }

        B b = new B();
        b.show();
    }


}
