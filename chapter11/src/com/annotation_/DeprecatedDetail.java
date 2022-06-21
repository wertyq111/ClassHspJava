package com.annotation_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
public class DeprecatedDetail {
    public static void main(String[] args) {
        //1. @Deprecated 注解表示该类、方法、属性或枚举常量已经过时，不建议使用。
    }
}

// 1. @Deprecated 注解表示该成员已经过时，不建议使用。
// 2. 可以修饰方法, 类, 字段, 包, 参数 等等。
// 3. @Deprecated 可以做版本升级过渡使用
@Deprecated
class Son1 {
    @Deprecated
    @SuppressWarnings({"all"})
    private int age;
    @Deprecated
    public void fly() {
        System.out.println("Son can fly");
    }
}
