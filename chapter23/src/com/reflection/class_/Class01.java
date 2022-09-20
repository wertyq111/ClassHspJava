package com.reflection.class_;

import com.Cat;

import java.lang.reflect.Field;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Class01 {
    public static void main(String[] args) throws Exception{
        //Cat cat = new Cat();
        Class<?> aClass = Class.forName("com.Cat");

        String str = "com.hspedu.reflection.Person";
        //获取到Class类对象，? 表示不确定的java类型
        Class<?> clazz = Class.forName(str);
        System.out.println(clazz);//显示该clazz对象是哪个类的Class对象
        System.out.println(clazz.getClass());//运行类型
        System.out.println(clazz.getPackage().getName());
        System.out.println(clazz.getName());
        Object obj =clazz.newInstance();//通过反射创建对象
        Field field = clazz.getField("name");//通过反射获取属性
        field.set(obj,"hspedu"); // 通过字段对象 赋值
        Object obj2 = field.get(obj);// 获取值
        System.out.println(obj2);//输出
    }
}
