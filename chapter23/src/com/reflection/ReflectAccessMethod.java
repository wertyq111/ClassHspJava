package com.reflection;

import java.lang.reflect.Method;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示通过反射调用方法
 */
@SuppressWarnings({"all"})
public class ReflectAccessMethod {
    public static void main(String[] args) throws Exception {
        Class<?> bosCls = Class.forName("com.reflection.Boss");

        //实例化
        Object boss = bosCls.newInstance();

        //通过反射获取方法hi 对象
        Method hi = bosCls.getMethod("hi", String.class);//要带上方法的实参类型
        hi.invoke(boss,"老板");

        //静态方法 say 操作
        Method say = bosCls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true); //私有方法进行爆破
        System.out.println(say.invoke(null, 100, "老板", 'n'));

        //在反射中,如果方法有返回值,统一返回 Object
        Object sayValue = say.invoke(null, 200, "开心", 'g');
        System.out.println("sayValue 的运行类型: "+sayValue.getClass());

    }
}

@SuppressWarnings({"all"})
class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi" + s);
    }
}
