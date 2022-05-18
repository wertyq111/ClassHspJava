package com.debug_;

import com.debug_.object_.Person;

/**
 * 课后练习
 * 1. 使用断点调试的方法, 追踪下一个对象创建的过程
 * 2. 使用断点调试查看动态绑定机制的工作原理
 */
public class DebugExercise {
    public static void main(String[] args) {
        // 创建对象流程
        // 1. 加载 Person 类信息
        // 2. 初始化 2.1 默认初始化 2.2 显式初始化 2.3 构造器初始化
        // 3. 返回对象地址
        Person john = new Person("John", 18);
        System.out.println(john);
    }
}
