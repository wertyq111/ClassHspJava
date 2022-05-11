package com.override_.exercise.object_;

public class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + ", 学生ID: " + id + ", 学生成绩: " + score;
    }
}
