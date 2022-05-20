package com.homework.object_;

public class Manager extends Employee{
    private double level;

    public Manager(String name, double daySalary, int workDays, double level) {
        super(name, daySalary, workDays);
        this.level = level;
    }

    @Override
    public void printSalary() {
        System.out.println("经理: " + super.getName() + "\t月工资: "
                + (1000.0 + super.getDaySalary() * super.getWorkDays() * this.level)
        );
    }
}
