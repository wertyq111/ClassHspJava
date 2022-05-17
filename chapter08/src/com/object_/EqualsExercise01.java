package com.object_;

import com.object_.object_.Person;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person john = new Person("John", 15, '男');
        Person lus = new Person("John", 15, '男');

        System.out.println(john.equals(lus));
    }
}

