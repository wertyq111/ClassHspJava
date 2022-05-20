package com.homework.object_;

public class GeneralStaff extends Employee{
    private double level;

    public GeneralStaff(String name, double daySalary, int workDays, double level) {
        super(name, daySalary, workDays);
        this.level = level;
    }

    @Override
    public void printSalary() {
        System.out.println("普通员工: " + super.getName() + "\t月工资: "
                + (super.getDaySalary() * super.getWorkDays() * this.level)
        );
    }
}
