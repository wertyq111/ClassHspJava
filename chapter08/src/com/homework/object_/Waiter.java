package com.homework.object_;

public class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printAnnualSalary() {
        System.out.print("服务员: ");
        super.printAnnualSalary();
    }
}
