package com.homework.object_;

public class GeneralStaff extends Employee{
    public GeneralStaff(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    @Override
    public void printSalary() {
        System.out.print("普通员工: ");
        super.printSalary();
    }
}
