package com.inner_class_;

/**
 * 匿名内部类演示
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.method();
    }
}

class Outer02 {
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        // 1. 需求： 想使用IA接口并创建对象
        // 2. 传统方式，是写一个类，实现该接口并创建对象
        // 3. 现有需求：只使用一次，以后再也不使用
        // 4.可以使用匿名内部类来简化开发
        // 5. tiger编译类型 IA
        // 6. tiger 运行类型 就是匿名内部类
        // 7. jdk底层再创建匿名内部类 Outer02$1， 立即马上就创建了 Outer02$1实例，并且把地址返回给tiger
        // 8. 匿名内部类使用一次就不能再使用。tiger可以反复调用
        /*
            底层解析 系统会分配一个类名 Outer02$1
            class Outer02$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫");
                }
            }
         */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());

        tiger.cry();

        //匿名内部类
        /*
            底层分析
            class Outer02$2 extends Father {
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test()");
                }
            }
         */
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test()");
            }
        };
        System.out.println("father的运行类型="+father.getClass());
        father.test();
    }
}

interface IA {
    public void cry();
}

class Father {
    public Father(String name) {

    }

    public void test() {

    }
}
