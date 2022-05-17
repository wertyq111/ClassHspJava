package com.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;

        System.out.println(a == b); // true
        System.out.println(b == c); // true

        B bObj = a;
        System.out.println(bObj == a); // true

        /**
         * Object类的equals()方法就是比较两个对象地址是否相同
         *     public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         */
        a.equals(b);

        /**
         * 为什么要使用equals()方法？
         * public boolean equals(Object anObject) {
         *         if (this == anObject) {//如果是同一个对象，直接返回true
         *             return true;
         *         }
         *         if (anObject instanceof String) { //如果是String类型，则调用String的equals()方法
         *             String anotherString = (String)anObject; //向下转型
         *             int n = value.length;
         *             if (n == anotherString.value.length) { //如果长度相等
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) { //一个一个的比较字符
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false; //如果比较的不是String 直接返回false
         *     }
         */
        "hello".equals("abc");

        Integer integer = new Integer(3);
        /**
         * Integer类的equals()方法就是比较两个对象的值是否相同
         *     public boolean equals(Object obj) {
         *         if (obj instanceof Integer) {
         *             return value == ((Integer)obj).intValue();
         *         }
         *         return false;
         *     }
         */
        integer.equals(3);

        Integer integer1 = new Integer(3);

        System.out.println(integer == integer1); // false, 地址比较
        System.out.println(integer.equals(integer1)); // true, 值比较

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2); // false, 地址比较
        System.out.println(str1.equals(str2)); // true, 值比较
    }
}

class B {}
class A extends B {}
