package com.reflection.class_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示加载类 - 初始化(initiallization)
 */
@SuppressWarnings({"all"})
public class ClassLoad03 {
    public static void main(String[] args) throws Exception{
        //分析
        // 1. 加载 B 类,并生成 B 的 class 类
        // 2, 链接 num = 0
        // 3. 初始化阶段
        //    (1) 依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句, 并进行合并
        /*
            clinit() {
                System.out.println("B 静态代码块被执行");
                num = 300;
                num = 100;
            }
            合并: num = 100;
         */
        //System.out.println(B.num);//如果直接使用类的静态属性,也会导致类的加载.但不会执行类的构造器

        //加载类的时候,是有同步机制控制的
        B b = new B();

    }
}

@SuppressWarnings({"all"})
class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B() {
        System.out.println("B 的构造函数被执行");
    }
}
