package com.set_;

import java.util.HashSet;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        /**
         * HashSet底层是HashMap，第一次添加时，table 数组扩容到 16，
         * 临界值(threshold)是 16 * 加载因子(loadFactor)是0.75 = 12，
         * 如果table 数组使用到了临界值 12, 就会扩容到 16 * 2 = 32,
         * 新的临界值就是 32 * 0.75 = 24，依次类推，直到扩容到最大值 Integer.MAX_VALUE
         */

        HashSet hashSet = new HashSet();

//        for (int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }

        /**
         * 在Java8中，如果一条链表的元素个数到达 TREEIFY_THRESHOLD(默认8) 时，
         * 并且table的大小 >= MIN_TREEIFY_CAPACITY(默认64)，就会进行树化(红黑树)
         * 否则扔采用数组扩容机制
         */
        for (int i = 0; i <= 12; i++) {
            hashSet.add(new A(i));
        }
    }
}

class A {
    int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
