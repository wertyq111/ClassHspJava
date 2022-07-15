package com.homework;

import java.util.TreeSet;

/**
 * @author zhouxufeng
 * @version 1.0
 * 分析程序是否会抛出异常，从源码层面分析
 */
@SuppressWarnings({"all"})
public class Homework05 {
    public static void main(String[] args) {
        //解读:
        // 结论: 会抛出异常
        // 1. TreeSet 使用无参构造器的时候再add添加元素时会引用元素对象的Comparator接口
        // 2. Person对象没有引用Comparable接口，所以在添加的时候会抛出ClassCastException异常
        // 在Person引用Comparable对象并重写compareTo方法
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());

    }
}

@SuppressWarnings({"all"})
class Person implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
