package com.extend;

public class Student {
    public String name;
    public int age;
    private double score;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("学生: " + name + " 正在考数学...");
    }

    public void showInfo() {
        System.out.println("姓名: " + name + " 年龄: " + age + " 成绩: " + score);
    }
}
