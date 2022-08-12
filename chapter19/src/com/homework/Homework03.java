package com.homework;

import com.enum_.FileEnum;

import java.io.*;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 * 要求:
 *  （1）要编写一个dog.properties
 *      name=tom
 *      age=5
 *      color=red
 *  (2）编写Dog 类(name,age,color）创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化，并输出
 *  (3) 将创建的Dog 对象， 序列化到文件 dog.dat 文件
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String configDir = FileEnum.DIR_PATH + "homework";
        String configName = "dog.properties";
        //序列化文件名
        String datName = "dog.dat";

        //编写配置文件
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");

        //写入配置文件中
        properties.store(new FileOutputStream(configDir + "/" + configName), null);
        System.out.println("保存配置成功");

        //读取配置并初始化Dog类并打印
        Properties config = new Properties();
        config.load(new FileReader(configDir + "/" + configName));
        String name = config.getProperty("name");
        int age = Integer.parseInt(config.getProperty("age"));
        String color = config.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        System.out.println("=============");
        System.out.println("开始序列化Dog");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(configDir + "/" + datName));
        oos.writeObject(dog);
        oos.close();
        System.out.println("序列化完毕");
        System.out.println("==============");
        System.out.println("反序列化");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(configDir + "/" + datName));
        Dog dog1 = (Dog) ois.readObject();
        System.out.println("运行类型: " + dog1.getClass());
        System.out.println("Dog内容: " + dog1);
        //关闭流
        ois.close();
    }
}

class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
