package com.set_;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        //解读
        //  1. set 接口的实现类的对象(Set接口对象),不能存放重复的元素,可以添加一个null
        //  2. set 接口对象存放数据是无序的(即添加的顺序和取出的顺序不一致)
        //  4. 注意: 取出的顺序虽然不是添加的顺序,但是它取出的顺序是固定的
        Set set = new HashSet();
        set.add(new String("jack"));
        set.add(new String("jack"));
        set.add("mary");
        set.add("tom");
        set.add(null);
        set.add(null);
        set.add("timi");

        System.out.println(set);

        //遍历
        System.out.println("===迭代器遍历===");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next + " ");
        }
        System.out.println("\n===增强for循环遍历===");
        for(Object s : set) {
            System.out.print(s + " ");
        }

    }
}
