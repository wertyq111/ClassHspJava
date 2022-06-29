package com.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 * ArrayList来演示
 */
@SuppressWarnings({"all"})
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();

        //add: 添加单个元素
        list.add("a");
        list.add(10); //list.add(new Integer(10));
        list.add(true);
        System.out.println("list=" + list);
        //remove:  删除指定元素
        list.remove(0); // 删除第一个元素
        list.remove(true); // 删除指定元素
        System.out.println("list=" + list);
        //contains:  查找元素是否存在
        System.out.println("list.contains(10)=" + list.contains(10));
        //size: 获取元素个数
        System.out.println("list.size()=" + list.size());
        //isEmpty:  判断是否为空
        System.out.println("list.isEmpty()=" + list.isEmpty());
        //clear:  清空
        list.clear();
        System.out.println("list.size()=" + list.size());
        //addAll: 添加多个元素
        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list.addAll(list1);
        System.out.println("list=" + list);
        //containsAll:  查找多个元素是否都存在
        System.out.println("list.containsAll(list1)=" + list.containsAll(list1));
        //removeAll:  删除多个元素
        list.add("c");
        list.removeAll(list1);
        System.out.println("list=" + list);
    }
}
