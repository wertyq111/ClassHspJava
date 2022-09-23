package com.reflection.class_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ClassLoad02 {
    public static void main(String[] args) {

    }
}
class A {
    //属性 - 成员变量 - 字段
    //分析类加载的链接阶段-准备,属性是如何处理
    // 1.n1 是实例变量, 不是静态变量, 因此在准备阶段是不会分配内存
    // 2.n2 是静态变量, 分配内存 n2 是默认初始化 0 ,而不是 20
    // 3.n3 是static final, 是常量,它和静态变量不一样, 因为一旦赋值就不变了 n3 = 30
    public int n1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;
}
