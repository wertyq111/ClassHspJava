package com.polymorphic_.polyarr_;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类say
    @Override
    public String say() {
        return super.say() + "\t score:" + score;
    }

    public String study() {
        return this.name + "正在上课";
    }
}
