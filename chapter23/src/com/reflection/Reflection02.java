package com.reflection;

import com.Cat;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author zhouxufeng
 * @version 1.0
 * 测试反射调用的性能和优化方案
 */
@SuppressWarnings({"all"})
public class Reflection02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }

    //传统方法来调用hi
    @Test
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for(int i=0; i< 900000000;i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi 耗时=" + (end - start));
    }

    //反射机制调用hi
    @Test
    public static void m2() throws Exception {
        Class cls = Class.forName("com.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");

        long start = System.currentTimeMillis();
        for(int i=0; i< 900000000;i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制方法调用hi 耗时=" + (end - start));
    }


    //反射调用优化 + 关闭访问检查
    public static void m3() throws Exception {
        Class cls = Class.forName("com.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射低调用方法时，取消访问检查


        long start = System.currentTimeMillis();
        for(int i=0; i< 900000000;i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制方法调用hi 耗时=" + (end - start));
    }
}
