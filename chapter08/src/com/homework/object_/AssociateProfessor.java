package com.homework.object_;

public class AssociateProfessor extends Teacher{
    private double level;

    public AssociateProfessor(String name, int age, String post, double salary, double level) {
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
