package com.homework.object_.homework13_object;

public class Student extends Person {
    private int stuId;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public Student(String name, char sex, int age, int stuId) {
        super(name, sex, age);
        this.stuId = stuId;
    }

    public void study() {
        System.out.println("我承诺, 我会好好学习!");
    }

    @Override
    public String play() {
        return super.getName() + " 爱玩足球";
    }

    @Override
    public void showInfo() {
        System.out.println("学生的信息:");
        super.showInfo();
        System.out.println("学号: " + stuId);
        study();
        System.out.println(play());
    }
}
