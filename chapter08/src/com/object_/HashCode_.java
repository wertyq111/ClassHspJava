package com.object_;

import com.object_.object_.Person;

public class HashCode_ {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = p1;

        System.out.println("p1 hashCode() = " + p1.hashCode());
        System.out.println("p2 hashCode() = " + p2.hashCode());
        System.out.println("p3 hashCode() = " + p3.hashCode());
    }
}
