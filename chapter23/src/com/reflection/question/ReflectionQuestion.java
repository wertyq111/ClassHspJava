package com.reflection.question;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    }
}
