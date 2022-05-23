package com.homework.object_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("经理: " + super.getName() + "\t月工资: "
                + (this.bonus + super.getDaySalary() * super.getWorkDays() * super.getGrade())
        );
    }
}
