package com.homework.object_;

public class Professor extends Teacher {
    private double level;

    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary);
        this.level = level;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    @Override
    public void introduce() {

    }
}
