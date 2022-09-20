package com.reflection.class_;

import com.Car;

import java.lang.reflect.Field;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Class02 {
    public static void main(String[] args) throws Exception{
        String classAllPath = "com.Car";
        //<?> 表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //输出cls
        System.out.println(cls);//显示cls对象, 是哪个类的Class对象 com.Car
        System.out.println(cls.getClass());//输出运行类型 java.lang.Class
        //得到包名
        System.out.println(cls.getPackage().getName());
        //得到类名
        System.out.println(cls.getName());
        //通过cls创建对象实例
        //Car car = (Car) cls.newInstance();
        Object o = cls.newInstance();
        System.out.println(o.toString());
        //通过反射获取属性 brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(o));
        //通过反射给属性赋值
        brand.set(o, "奔驰");
        System.out.println(brand.get(o));
        //得到所有的属性
        for(Field f:cls.getFields()) {
            System.out.println(f.getName());//书名名称
        }
    }
}
