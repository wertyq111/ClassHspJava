package com.homework;

import java.util.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 按要求完成下列任务
 * 1）使用HashMap类实例化一个Map类型的对象m，键（String）和值（int）分别用于存储员工的姓名和工资，
 *  存入数据如下：
 *  jack--650元
 *  tom--1200元
 *  smith--2900元
 * 2）将jack的工资更改为2600元
 * 3）为所有员工工资加薪100元
 * 4）遍历集合中所有的员工
 * 5）遍历集合中所有的工资
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);

        //将jack的工资更改为2600元
        m.put("jack", 2600);

        //为所有员工工资加薪100元
        Set entrySet = m.entrySet();
        for(Object set:entrySet) {
            Map.Entry entry = (Map.Entry) set;
            m.put(entry.getKey(), (Integer)entry.getValue() + 100);
        }

        //遍历所有员工
        Set keySet = m.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //遍历所有工资
        Collection salaries = m.values();
        for(Object s:salaries) {
            System.out.println(s);
        }
    }
}
