package com.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author zhouxufeng
 * @version 1.0
 * 定义一个Employee1类， 该类包含: name, sal, birthday(MyDate类型)
 * 其中 birthday 为 MyDate 类型(属性包括: year, month, day)
 * 要求:
 *  1. 创建3个Employee1 放入HashSet中
 *  2. 当name和birthday的值相同时， 仍未是相同员工，不能添加到HashSet中
 */
@SuppressWarnings({"all"})
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Employee1("jack", 1000, new MyDate("2022", "03", "14")));
        hashSet.add(new Employee1("jhon", 1000, new MyDate("2022", "03", "14")));
        hashSet.add(new Employee1("jack", 1000, new MyDate("2022", "03", "14")));

        System.out.println(hashSet);
    }
}

@SuppressWarnings({"all"})
class Employee1 {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee1(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && birthday.equals(employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

@SuppressWarnings({"all"})
class MyDate {
    private String year;
    private String month;
    private String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
