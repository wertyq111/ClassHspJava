package com.object_;

import com.object_.object_.Person;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("John");

        Person p2 = new Person();
        p2.setName("Simon");

        System.out.println(p1 == p2); //false
        System.out.println(p1.getName().equals(p2.getName())); //false
        System.out.println(p1.equals(p2)); //false

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2); //false

    }
}
