package com.homework.object_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSalary() {
        System.out.print("工人: ");
        super.printAnnualSalary();
    }
}
