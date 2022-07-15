package com.generic_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zhouxufeng
 * @version 1.0
 * 练习要求:
 *  1. 创建3个学生对象
 *  2. 放入到 HashMap 中，要求 KEY 是 String name, Value 就是学生对象
 *  3. 使用两种方式遍历
 */
@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        Student student1 = new Student("小明", 12);
        Student student2 = new Student("李雷", 13);
        Student student3 = new Student("韩梅梅", 11);
        Map<String, Student> studentMap = new HashMap<String, Student>();
        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);

        //加强For循环遍历
        Set<String> keys = studentMap.keySet();
        for(String key:keys) {
            System.out.println(studentMap.get(key));
        }

        //Iterator迭代器
        Iterator<Student> iterator = studentMap.values().iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<Map.Entry<String, Student>> entries = studentMap.entrySet();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
