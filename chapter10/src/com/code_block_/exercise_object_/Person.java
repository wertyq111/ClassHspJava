package com.code_block_.exercise_object_;

public class Person {
        public static int total;
        static {
            total = 100;
            System.out.println("in static block");
        }
}
