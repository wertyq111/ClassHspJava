package com.object_;

import com.object_.object_.Monster;

public class Finalize_ {
    public static void main(String[] args) {
        Monster bigMonster = new Monster("大妖怪");

        //这时 Monster 对象就是一个垃圾， 垃圾回收期就会回收(销毁)对象, 在销毁对象前会调用该对象的finalize() 方法
        //1. 程序员就可以在 finalize() 方法中做一些清理工作(比如释放资源: 数据库连接, 或者打开文件..)
        //2. 如果程序员不重写 finalize() 方法， 则系统会自动调用该对象的 finalize() 方法,那么就会调用 Object类的 finalize() 方法
        bigMonster = null;

        System.gc();//主动调用垃圾回收机制
    }
}
