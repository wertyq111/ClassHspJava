package com.extend;

public class ExtendDetail {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Graduate graduate = new Graduate();

        pupil.setAge(10);
        pupil.setScore(100);

        graduate.setName("金角大王");
        graduate.setAge(20);
        graduate.setScore(200);

        pupil.testing();
        pupil.showInfo();

        System.out.println("===============================");
        graduate.testing();
        graduate.showInfo();
    }
}
