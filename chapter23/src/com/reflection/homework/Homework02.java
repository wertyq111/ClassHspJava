package com.reflection.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author zhouxufeng
 * @version 1.0
 * 利用反射和 File 完成以下功能
 *  1. 利用 Class类的 forName方法得到File 类的class 对象
 *  2. 在控制台打印File 的所有构造器
 *  3. 通过 new Instance()的方法创建 File 对象, 并创建 /Users/zhouxufeng/program/ClassHspJava/chapter23/data/mynew.txt文件
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) throws Exception {
        Class<?> fileCls = Class.forName("java.io.File");
        String fileDir = "/Users/zhouxufeng/program/ClassHspJava/chapter23/data";
        String filePath = fileDir + "/mynew.txt";

        Constructor<?>[] constructors = fileCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.print(parameterType.getName() + " ");
            }
            System.out.println("\n");
        }

        Constructor<?> fileConstructor = fileCls.getDeclaredConstructor(String.class);
        Object dir = fileConstructor.newInstance(fileDir);
        Object file = fileConstructor.newInstance(filePath);
        Method exists = fileCls.getMethod("exists");
        Method isDirectory = fileCls.getMethod("isDirectory");
        Method mkdirs = fileCls.getMethod("mkdirs");
        Method createNewFile = fileCls.getMethod("createNewFile");
        Boolean isExists = (Boolean) exists.invoke(dir); //invoke 默认 Object 不能进行 boolean 比较,所以先向下转型再进行判断
        if(isExists.booleanValue() == false) {
            mkdirs.invoke(dir);
        }
        createNewFile.invoke(file);



    }
}
