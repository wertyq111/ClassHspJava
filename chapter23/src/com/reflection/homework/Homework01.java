package com.reflection.homework;

import com.reflection.homework.object.PrivateTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zhouxufeng
 * @version 1.0
 * 通过反射修改私有成员变量
 * 1. 定义 PrivateTest类,有私有name 属性,并且属性值为 hellokitty
 * 2. 提供getName的公共方法
 * 3. 创建PrivateTest 类,利用 Class类得到私有的 name 属性,修改私有的 name 属性值,并调用getName()的方法打印name 属性值
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) throws Exception {
        Class<?> pCls = Class.forName("com.reflection.homework.object.PrivateTest");
        //Class<PrivateTest> pCls = PrivateTest.class;

        Object o = pCls.newInstance();

        Method getName = pCls.getMethod("getName");
        Object nameVal = getName.invoke(o);
        System.out.println(nameVal);

        Field name = pCls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "tiger");
        nameVal = getName.invoke(o);
        System.out.println(nameVal);
    }
}
