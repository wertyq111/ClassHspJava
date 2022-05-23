package com.homework.object_;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, char gender, int age, String job, double sal) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if (obj instanceof Doctor) {
            Doctor d = (Doctor) obj;
            return this.name.equals(d.name) && this.age == d.age
                    && this.gender == d.gender && this.job.equals(d.job) && this.sal == d.sal;
        }

        return false;
    }
}
