package com.homework.object_;

public class SchoolTeacher extends Employee{
    private double classSal;
    private int classDay;


    public SchoolTeacher(String name, double daySalary, int workDays, double tuitionFee, double grade) {
        super(name, daySalary, workDays, grade);
    }

    public SchoolTeacher(String name, double salary, double classSal, int classDay) {
        super(name, salary);
        this.classSal = classSal;
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    @Override
    public void printAnnualSalary() {
        System.out.println("老师姓名: " + super.getName() + "\t年薪: "
                + ((super.getDaySalary() * super.getWorkDays() * super.getSalMonth()) + (this.classSal * this.classDay))
        );
    }
}
