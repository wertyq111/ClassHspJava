package com.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/zhouxufeng/program/ClassHspJava/chapter23/src/com/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath: " + classfullpath);
        System.out.println("method: " + method);

        //使用反射机制解决
        // 1. 加载类,返回Class类型的对象 cls
        //    Class.newInstance() 只能够调用无参的构造函数，即默认的构造函数；
        //    Constructor.newInstance() 可以根据传入的参数，调用任意构造构造函数
        Class cls = Class.forName(classfullpath);
        // 2. 通过 cls 得到你加载的类 com.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型是: " + o.getClass());
        // 3. 通过 cls 得到加载的类 com.Cat 的 methodName "hi" 的方法对象
        //    即: 在反射中， 可以把方法视为对象(万物皆对象)
        Method method1 = cls.getMethod(method);
        // 4. 通过method1 调用方法: 即通过方法对象来实现调用方法
        System.out.println("==============");
        method1.invoke(o); //传统方法 对象方法(), 反射机制 方法.invoke(对象)

        //java.lang.reflect.Field: 代表类的成员变量， Field对象表示某个类的成员变量
        //得到name字段
        //getField不能得到私有的属性
        //cls.getField("name");
        Field age = cls.getField("age");
        System.out.println(age.get(o));//传统写法 对象.成员变量， 反射： 成员变量对象.get(对象)

        //java.lang.reflect.Constructor: 代表类的构造方法，Constructor对象表示构造器
        Constructor constructor = cls.getConstructor();//()中可以指定构造器参数类型，返回无参构造器
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class);//这里传入的 String.class 就是String类的Class对象
        System.out.println(constructor1);
    }
}
