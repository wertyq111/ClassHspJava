package com.reflection;

import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示如何通过反射获取类的结构信息
 */
@SuppressWarnings({"all"})
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    //第一组API
    @Test
    @SuppressWarnings({"all"})
    public void api_01() throws Exception{
        Class<?> personCls = Class.forName("com.reflection.Person");
        //getName: 获取全类名
        System.out.println("获取全类名:" + personCls.getName());
        System.out.println("===============");

        //getSimpleName: 获取简单类名
        System.out.println("获取简单类名:" + personCls.getSimpleName());
        System.out.println("===============");

        //getFields: 获取所有 public修饰的属性, 包含本类以及父类
        Field[] fields = personCls.getFields();
        for (Field f : fields) {
            System.out.println("获取本类及父类属性:" + f.getName());
        }
        System.out.println("===============");
        //getDeclaredFields: 获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field df : declaredFields) {
            System.out.println("获取本类属性:" + df.getName());
        }
        System.out.println("===============");

        //getMethods: 获取所有 public 修饰的方法, 包含本类以及父类
        Method[] methods = personCls.getMethods();
        for (Method m : methods) {
            System.out.println("获取本类及父类方法:" + m.getName());
        }
        System.out.println("===============");

        //getDeclaredMethods: 获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method dm : declaredMethods) {
            System.out.println("获取本类方法:" + dm.getName());
        }
        System.out.println("===============");

        //getConstructors: 获取所有 public 修饰的构造器,只包含本类
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println("获取本类构造器:" + c.getName());
        }
        System.out.println("===============");

        //getDeclaredConsrtuctors: 获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> dc : declaredConstructors) {
            System.out.println("获取本类构造器:" + dc.getName());
        }
        System.out.println("===============");

        //getPackage: 以Package 形式返回 包信息
        System.out.println("包名:" + personCls.getPackage().getName());
        System.out.println("===============");

        //getSuperClass: 以 Class形式返回父信息
        System.out.println("父类对象信息:" + personCls.getSuperclass().getName());
        System.out.println("===============");

        //getInterfaces: 以 Class[]形式返回接口信息
        System.out.println("===============");

        //getAnnotations: 以 annotation[] 形式返回注解
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息:" + annotation);
        }
    }

    //第二组API
    @Test
    @SuppressWarnings({"all"})
    public void api_02() throws Exception{
        Class<?> personCls = Class.forName("com.reflection.Person");
        //getModifies: 以int 形式返回修饰符[说明: 默认修饰符是 0, public 是 1, private 是 2, protected 是 4, static 是 8, final 是 16]
        //getType: 以 Class 形式返回类型
        //getName: 返回属性名
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field df : declaredFields) {
            System.out.println("获取本类属性:" + df.getName() + " 该属性修饰符值:" + df.getModifiers()
                    + " 该属性的类型:" + df.getType());
        }
    }

    //第三组API
    @Test
    @SuppressWarnings({"all"})
    public void api_03() throws Exception{
        Class<?> personCls = Class.forName("com.reflection.Person");
        //getModifier: 以int 形式返回修饰符[说明: 默认修饰符是 0, public 是 1, private 是 2, protected 是 4, static 是 8, final 是 16]
        //getReturnType: 以 Class 形式获取返回类型
        //getName: 返回方法名
        //getParamterTypes: 以 Class[]返回参数类型数组
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method dm : declaredMethods) {
            Class<?>[] parameterTypes = dm.getParameterTypes();
            System.out.println("获取本类方法:" + dm.getName()
                    + " 该方法返回形式:" + dm.getReturnType()
                    + " 该方法返回修饰符:" + dm.getModifiers());

            for (Class<?> parameterType : parameterTypes) {
                System.out.println("方法参数:" + parameterType);
            }

        }
    }
}

@SuppressWarnings({"all"})
@Deprecated
class Person extends Earth {
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person() {
        super();
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(int age) {
        this.age = age;
    }

    public void m1(String name) {
        this.name = name;
    }

    protected void m2() {

    }

    void m3() {

    }

    private void m4() {}
}

@SuppressWarnings({"all"})
class Earth {
    public String hobby;

    public Earth() {

    }

    public Earth(String name) {
        this.hobby = hobby;
    }

    public void setHobby(String name) {
        this.hobby = hobby;
    }
}
