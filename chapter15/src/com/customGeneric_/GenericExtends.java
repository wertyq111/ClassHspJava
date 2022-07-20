package com.customGeneric_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class GenericExtends {
    public static void main(String[] args) {

        //泛型不具备继承性
        //List<Object> list = new ArrayList<String>();

        List list1 = new ArrayList();
        List<String> list2 = new ArrayList();
        List<Grandpa> list3 = new ArrayList();
        List<Father> list4 = new ArrayList();
        List<Son> list5 = new ArrayList();

        System.out.println("======可以使用List<?>======");
        printCollectoin1(list1);
        printCollectoin1(list2);
        printCollectoin1(list3);
        printCollectoin1(list4);
        printCollectoin1(list5);

        System.out.println("======可以使用List<? extends Grandpa>======");
        printCollectoin2(list3);
        printCollectoin2(list4);
        printCollectoin2(list5);

        System.out.println("======可以使用List<? super Grandpa>======");
        printCollectoin3(list1);
        printCollectoin3(list3);
    }

    //List<?> 表示任意的泛型类型都可以接收
    public static void printCollectoin1(List<?> c) {
        for(Object object : c) {
            System.out.println(object);
        }
    }

    // List<? extends Grandpa> 表示 上限, 可以接受 Grandpa或者Grandpa的子类
    public static void printCollectoin2(List<? extends Grandpa> c) {
        for(Object object : c) {
            System.out.println(object.getClass().getSimpleName());
        }
    }

    //List<? super Grandpa> 表示 下限, 支持Grandpa类以及Grandpa的父类，不限于直接父类
    public static void printCollectoin3(List<? super Grandpa> c) {
        for(Object object : c) {
            System.out.println(object);
        }
    }
}

class Grandpa {

}

class Father extends Grandpa {

}

class Son extends Father {

}
