package com.homework.object_;

public class Professor extends Teacher {

    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("教授姓名: " + super.getName() + "\t年龄: " + super.getAge() + "\t职称: " + super.getPost()
                + "\t基本工资: " + super.getSalary());
    }
}
