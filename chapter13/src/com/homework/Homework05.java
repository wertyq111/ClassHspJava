package com.homework;

/**
 * @author zhouxufeng
 * @version 1.0
 * 输出结果
 */
@SuppressWarnings({"all"})
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a==b); //false 堆中的地址不同
        System.out.println(a.equals(b)); //false 这是两个对象的对比，地址不同.等同于(obj1 == obj2)
        System.out.println(a.name==b.name); //true 常量池地址相同

        String s4 = new String("hspedu");
        String s5 = "hspedu";
        System.out.println(s1==s4); //false s1是常量池地址, s4是堆地址
        System.out.println(s4==s5); //fale 同上

        String t1 = "hello" + s1;
        String t2 = "hellohspedu";
        System.out.println(t1.intern()==t2); // true intern()指向的是字符串常量池地址，所以相同
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
