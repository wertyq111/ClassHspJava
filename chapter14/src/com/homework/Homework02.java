package com.homework;

import com.homework.obj.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 * 使用ArrayList完成对对象Car(name，price)的各种操作 Car car=new Car"宝马", 400000) Car car2=new Car("宾利", 5000000);
 * 1.add：添加单个元素
 * 2.remove:删除指定元素
 * 3.contains:查找元素是否存在
 * 4.size:获取元素个数
 * 5.isEmpty:判断是否为空
 * 6.clear:清空
 * 7.addAll：添加多个元素
 * 8.containsAll：查找多个元素是否都存在
 * 9.removeAll：删除多个元素
 * 使用增强for和送代器来遍历所有的car，需要重写Car的toString方法
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car("宝马", 400000);
        Car car1 = new Car("宾利", 5000000);
        Car car2 = new Car("大众", 200000);
        List list = new ArrayList();
        list.add(car);
        list.add(car1);

        //add
        list.add(car2);
        System.out.println("添加元素后的list: " + list);

        //remove
        list.remove(car1);
        System.out.println("删除元素后的list: " + list);

        //contain
        boolean isExist = list.contains(car);
        System.out.println("宝马是否存在: " + isExist);

        //size
        System.out.println("list的元素个数: "+ list.size());

        //isEmpty
        System.out.println("list是否为空: " + list.isEmpty());

        //clear
        List list1 = new ArrayList();
        for(int i = 0; i < list.size(); i++) {
            list1.add("");
        }
        Collections.copy(list1, list);
        System.out.println("当前list1: " + list1);
        list1.clear();
        System.out.println("清空后list1: " + list1);

        //addAll
        Car car3 = new Car("五菱", 50000);
        Car car4 = new Car("本田", 200000);
        list1.add(car3);
        list1.add(car4);
        list.addAll(list1);
        System.out.println("添加多个元素(集合list1)后: " + list);

        //removeAll
        list.removeAll(list1);
        System.out.println("删除多个元素(集合list1)后: " + list);

        //containsAll
        System.out.println("查找多个元素(集合list1)是否存在: " + list.containsAll(list1));
    }
}
