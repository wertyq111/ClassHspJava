package com.reflection;

import java.lang.reflect.Field;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示反射操作属性
 */
@SuppressWarnings({"all"})
public class ReflectAccessProperty {
    public static void main(String[] args) throws Exception {
        Class<?> studentCls = Class.forName("com.reflection.Student");

        //创建对象
        Object student = studentCls.newInstance();

        //使用反射获取属性对象
        Field age = studentCls.getDeclaredField("age");
        age.set(student, 11);
        System.out.println(student);

        //使用反射操作 name属性
        Field name = studentCls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(null, "西米");
        System.out.println(student);

        //获取属性值
        System.out.println(age.get(student));
        System.out.println(name.get(null));
    }
}

@SuppressWarnings({"all"})
class Student {
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
