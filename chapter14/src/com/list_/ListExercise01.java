package com.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 * 添加10个以上的元素(比如: String "hello"),
 * 在2号位插入一个元素"韩顺平教育"，
 * 获得第5个元素，删除第6个元素，修改第7个元素
 * 再使用迭代器遍历集合
 * 要求：使用List的实现类ArrayList完成
 */
@SuppressWarnings({"all"})
public class ListExercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("c++");
        list.add("c#");
        list.add("python");
        list.add("php");
        list.add("javascript");
        list.add("html");
        list.add("css");
        list.add("jquery");

        System.out.println("===原始数据===");
        System.out.println(list);

        //插入一个元素
        list.add(1, "韩顺平教育");
        System.out.println(list);

        //获得第5个元素
        System.out.println(list.get(4));

        //删除第6个元素
        list.remove(5);
        System.out.println(list);

        //修改第7个元素
        list.set(6, "netsun");
        System.out.println(list);

        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next + " ");
        }

    }
}
