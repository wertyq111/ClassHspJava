package com.homework.object_;

public class Employee {
    private String name;
    private double daySalary;
    private int workDays;
    private double salary;

    public Employee(String name, double daySalary, int workDays) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDays = workDays;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("员工: " + name + "\t月工资: " + (daySalary * workDays));
    }

    public void printAnnualSalary() {
        System.out.println("员工: " + name + "\t年薪: " + (salary * 12));
    }
}
