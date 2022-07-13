package com.set_;

import apple.laf.JRSUIUtils;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeSetExercise {
    public static void main(String[] args) {
        // 1. 无参构造器按照字典排序 数字，字母等
        // 2. 可以传入一个比较器
        //TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //从大到小排序
                //return ((String) o2).compareTo((String) o1);
                //按照长度从大到小排序
                int len1 = ((String) o1).length();
                int len2 = ((String) o2).length();
                return len2 - len1; //查看底层源码， 如果长度相等则不会加到数组中
            }
        });
        treeSet.add("jack");
        treeSet.add("lucy");
        treeSet.add("john");
        treeSet.add("mary");
        treeSet.add("tom");
        treeSet.add("adbort");
        treeSet.add("111");
        treeSet.add("风风火火");

        System.out.println(treeSet);
    }
}
