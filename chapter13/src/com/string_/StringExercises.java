package com.string_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class StringExercises {
    public static void main(String[] args) {
        exercise08();
    }

    public static void exercise01() {
        String a = "abc";
        String b = "abc";

        System.out.println(a.equals(b)); //true
        System.out.println(a == b); //true
    }

    public static void exercise02() {
        String a = "abc";
        String b = new String("abc");

        System.out.println(a.equals(b)); //true
        System.out.println(a == b); //false
    }

    public static void exercise03() {
        String a = "abc";
        String b = new String("abc");

        System.out.println(a.equals(b)); //true
        System.out.println(a == b); //false
        System.out.println(a==b.intern()); //true .intern()指向的是常量池地址所以a的常量池地址 = b的常量池地址
        System.out.println(b==b.intern()); //false b指向的是堆的地址，b.intern()指向的是常量池地址所以不同
    }

    public static void exercise04() {
        String s1 = "edu";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);//false 常量池地址与堆地址对比不同
        System.out.println(s2 == s4);//true 常量池地址相同
        System.out.println(s2.equals(s3)); //true 值相同
        System.out.println(s1 == s2); //false 值不同
    }

    public static void exercise05() {
        Person p1 = new Person();
        p1.name = "jack";
        Person p2 = new Person();
        p2.name = "jack";

        System.out.println(p1.name.equals(p2.name)); //true 值相等
        System.out.println(p1.name == p2.name); // true 常量池地址相等
        System.out.println(p1.name == "jack"); // true 常量池地址相等

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2); // false 堆地址不相等
    }

    public static void exercise06() {
        String a = "hello";
        String b = "abc";
        //解读
        // 1. 先创建一个 StringBuilder sb = StringBuilder()
        // 2. 执行sb.append("heelo")
        // 3. sb.append("abc")
        // 4. String c = sb.toString()
        // 最后其实是 c 指向对重的对象(String) value[] -> 常量池中 "helloabc"
        String c = a + b; //变量相加看堆
        String d = "helloabc";
        System.out.println(c == d); //false
        System.out.println(c.intern() == d); //true
        String e = "hello" + "abc";
        System.out.println(e == d);//true 常量相加，看常量池
    }

    public static void exercise07() {
        String s1 = "edu";
        String s2 = "java";
        String s5 = "edujava";
        String s6 = (s1 + s2).intern();
        System.out.println(s5 == s6); //true s6.intern()指向常量池地址，与s5相同
        System.out.println(s5.equals(s6)); //true 值相同
    }

    /**
     * 输出结果：
     *   1. jack and
     *   2. hava
     */
    public static void exercise08() {
        Exercise08 exer = new Exercise08();
        exer.change(exer.str, exer.ch);
        System.out.println(exer.str + " and ");
        System.out.println(exer.ch);
    }
}

class Person {
    public String name;
}

@SuppressWarnings({"all"})
class Exercise08 {
    String str = new String("jack");
    final char[] ch = {'j','a','v','a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }
}