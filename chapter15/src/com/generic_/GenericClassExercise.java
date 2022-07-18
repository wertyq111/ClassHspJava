package com.generic_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author zhouxufeng
 * @version 1.0
 * 定义Employee类
 * 1）该类包含：private成员变量name,sal,birthday，其中birthday 为 MyDate 类的对象；
 * 2）为每一个属性定义 getter, setter 方法；
 * 3) 重写 toString 方法输出 name, sal, birthday
 * 4) MyDate类包含：private成员变量month,day,year；并为每一个属性定义 getter,setter 方法；
 * 5) 创建该类的 3 个对象，井把这些对象放入 ArrayList 集合中 (Arraylist 需使用泛型来定义），对集合中的元素进行排序，井遍历输出;
 * 排序方式：调用ArrayList 的sort 方法，传入 Comparator对象「使用泛型]，先按照name排序
 * 如果name相同，则按生日日期的先后排序。
 */
@SuppressWarnings({"all"})
public class GenericClassExercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("simth", 1200, new MyDate("1990", "05", "03")));
        employees.add(new Employee("john", 2300, new MyDate("1988", "11", "13")));
        employees.add(new Employee("john", 6666.22, new MyDate("1977", "09", "12")));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                int compareName = emp1.getName().compareTo(emp2.getName());
                if (compareName != 0) return compareName;

                return emp1.getBirthday().compareDate(emp2.getBirthday());
            }
        });

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.getName() + "," + employee.getSal() + "," + employee.getBirthday());
        }

    }
}

@SuppressWarnings({"all"})
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
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
    public String toString() {
        return "Employee{" +
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

    /**
     * 转换成日期格式
     * @return LocalDate
     */
    public LocalDate toDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        int yearInt = Integer.parseInt(year);
        int monthInt = Integer.parseInt(month);
        int dayInt = Integer.parseInt(day);
        return LocalDate.of(yearInt, monthInt, dayInt);
    }

    public int compareDate(MyDate date) {
        return this.toDate().compareTo(date.toDate());
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }
}
