package com.polymorphic_.polyarr_;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //重写父类say方法
    @Override
    public String say() {
        return super.say() + "\t salary: " + this.salary;
    }

    public String teach() {
        return this.name + "老师正在讲课..";
    }
}
