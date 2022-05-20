package com.homework.object_;

public class Scientist extends Employee{
    private double awards;

    public Scientist(String name, double salary, double awards) {
        super(name, salary);
        this.awards = awards;
    }

    public Scientist(String name, double daySalary, int workDays, double awards) {
        super(name, daySalary, workDays);
        this.awards = awards;
    }

    public double getAwards() {
        return awards;
    }

    public void setAwards(double awards) {
        this.awards = awards;
    }

    @Override
    public void printAnnualSalary() {
        System.out.println("科学家姓名: " + super.getName() + "\t年薪: " + ((super.getSalary() * 12) + this.awards));
    }
}
