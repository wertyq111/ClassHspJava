package com.dynamic_;

import com.dynamic_.object_.A;
import com.dynamic_.object_.B;

public class DynamicBinding {
    public static void main(String[] args) {
        // Create a new instance of the class
        A a = new B(); //向上转型

        System.out.println(a.sum()); //40|30
        System.out.println(a.sum1()); //30|20
    }
}
