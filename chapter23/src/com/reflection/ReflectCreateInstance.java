package com.reflection;

import java.lang.reflect.Constructor;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示通过反射机制创建实例
 */
@SuppressWarnings({"all"})
public class ReflectCreateInstance {
    public static void main(String[] args) throws Exception {
        //1. 先获取 User类的 Class 对象
        Class<?> userCls = Class.forName("com.reflection.User");
        //2. 通过 public的无参构造器创建实例
        Object user = userCls.newInstance();
        System.out.println(user);
        System.out.println("==============");
        //3. 通过 public的有参构造器创建实例
        // 3.1 先得到对应构造器
        Constructor<?> constructor = userCls.getConstructor(String.class);
        // 3.2 创建实例并传入实参
        Object user1 = constructor.newInstance("zxf");
        System.out.println(user1);
        System.out.println("=============");
        //4. 通过私有的有参构造器创建实例
        // 4.1 先得到私有构造器
        Constructor<?> declaredConstructor = userCls.getDeclaredConstructor(String.class, int.class);
        // 4.2 创建实例
        declaredConstructor.setAccessible(true); //爆破[暴力破解], 使用反射可以访问私有(private..)构造器/方法/属性. 反射面前都是纸老虎
        Object cat = declaredConstructor.newInstance("西米", 1);
        System.out.println(cat);
    }
}

@SuppressWarnings({"all"})
class User {
    private int age;
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
