package com.homework.object_;

public class SchoolTeacher extends Employee{
    private double tuitionFee;

    public SchoolTeacher(String name, double daySalary, int workDays, double tuitionFee) {
        super(name, daySalary, workDays);
        this.tuitionFee = tuitionFee;
    }

    public SchoolTeacher(String name, double salary, double tuitionFee) {
        super(name, salary);
        this.tuitionFee = tuitionFee;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void printAnnualSalary() {
        System.out.println("老师姓名: " + super.getName() + "\t年薪: "
                + ((super.getDaySalary() * super.getWorkDays() * 12) + (this.tuitionFee * super.getWorkDays() * 12))
        );
    }
}
