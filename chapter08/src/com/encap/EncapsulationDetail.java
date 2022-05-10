package com.encap;

public class EncapsulationDetail {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        person.setSalary(5000);

        System.out.print("Name: " + person.getName());
        System.out.print(" Age: " + person.getAge());
        System.out.print(" Salary: " + person.getSalary() + "\n");

        //构造器直接指定属性
        Person smith = new Person("Smith", 28, 15000);
        System.out.println("Smith's information: ");
        System.out.print(" Name: " + smith.getName());
        System.out.print(" Age: " + smith.getAge());
        System.out.print(" Salary: " + smith.getSalary() + "\n");
    }
}
/*
不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
年龄，必须在1-120，年龄，工资不能直接查看，name的长度在2-6字符之间
*/

class Person {
    public String name;
    private int age;
    private double salary;

    //构造器 alt + insert

    public Person() { //构造器
    }

    public Person(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("Name is not valid, default name is John");
            this.name = "John";
        }
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Age is not valid, default age is 20");
            this.age = 20;
        }
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
