package com.final_.object_;

public class Circle {
    private double radius;
    //private final double PI = 3.14;
    private final double PI;

    {
        PI = 3.14;
    }
    public Circle(double radius) {
        this.radius = radius;
        //PI = 3.14;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
