package com.homework.object_;

public class Farmer extends Employee{
    public Farmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSalary() {
        System.out.print("农民: ");
        super.printAnnualSalary();
    }
}
