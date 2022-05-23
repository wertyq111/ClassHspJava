package com.homework.object_.homework13_object;

public class Teacher extends Person {
    private int workAge;

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public Teacher(String name, char sex, int age, int workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }

    public void teach() {
        System.out.println("我承诺, 我会认真教学!");
    }

    @Override
    public String play() {
        return super.getName() + " 爱玩象棋";
    }

    @Override
    public void showInfo() {
        System.out.println("老师的信息:");
        super.showInfo();
        System.out.println("工龄: " + workAge);
        teach();
        System.out.println(play());
    }
}
