package com.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();

        //说明
        // 1. 在执行add方法后，会返回一个boolean值
        // 2. 如果添加成功，返回 true， 否则返回false
        // 3. 可以通过remove 指定删除某个对象
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("mary"));
        System.out.println(hashSet.add("tom"));
        System.out.println(hashSet.add("rose"));
        System.out.println(hashSet.add("timi"));
        System.out.println(hashSet.add("timi"));

        //重点注意
        System.out.println(hashSet.add(new String("hash")));
        System.out.println(hashSet.add(new String("hash")));
        hashSet.remove("mary");
        System.out.println("hashSet:" + hashSet);
    }
}
