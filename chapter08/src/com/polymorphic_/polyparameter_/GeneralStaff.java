package com.polymorphic_.polyparameter_;

public class GeneralStaff extends Employee {

    public GeneralStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public String work() {
        return super.getName() + "拿着" + super.getSalary() + "工资在工作";
    }
}
